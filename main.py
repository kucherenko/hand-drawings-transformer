import uvicorn
from fastapi import FastAPI, UploadFile, File
from fastapi.staticfiles import StaticFiles
from starlette.middleware.cors import CORSMiddleware

from transformer.image import prepare, corners, process
from transformer.utils import save_file

URL='http://localhost:8000/static/images'

app = FastAPI()
app.mount("/static", StaticFiles(directory="static"), name="static")

origins = [
    "http://localhost",
    "http://127.0.0.1:1234",
    "http://localhost:1234",
]

app.add_middleware(
    CORSMiddleware,
    allow_origins=origins,
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

@app.post("/upload")
async def upload(file: UploadFile):
    contents = await file.read()
    filename = "./static/images/{}".format(file.filename)
    save_file(filename, contents)
    prep = prepare(filename)
    height, width = prep.shape[:2]
    coordinates = []
    for c in corners(prep):
        coordinates.append((int(c[0]), int(c[1])))
    return {
        "url": "{url}/{file}".format(file=file.filename, url=URL),
        "coordinates": coordinates,
        "width": width,
        "height": height
    }

@app.post("/process")
async def process_img(file: UploadFile):
    contents = await file.read()
    filename = "./static/images/{}".format(file.filename)
    save_file(filename, contents)
    process(filename, 'static/images')
    return {
        "url": "{url}/{file}".format(file=file.filename, url=URL),
    }

if __name__ == '__main__':
    uvicorn.run(app, host='127.0.0.1', port=8000, debug=True)
