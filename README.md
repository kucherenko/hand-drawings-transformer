[![CI](https://github.com/MysterionRise/hand-drawings-transformer/actions/workflows/ci.yml/badge.svg)](https://github.com/MysterionRise/hand-drawings-transformer/actions/workflows/ci.yml)

# Application that transform drawn images on A4 paper into cropped, enhanced and warped images.

## How to build

#### Create venv
```
python -m venv venv
```

#### Install Python requirements
```
pip install -r requirements.txt
```

#### Install ImageMagick
```
brew install freetype imagemagick
```
or via - https://docs.wand-py.org/en/0.6.7/guide/install.html#

#### Install pre-commit hooks:
```
pre-commit install
```

## How to run

### Web Server
```bash
uvicorn main:app --reload
```
or
```bash
python ./main.py
```

### CLI

```bash
python cli.py
```
or
```bash
python cli.py [file name without ext]
```
