import numpy as np


def closest_node(node, nodes):
    nodes = np.asarray(nodes)
    deltas = nodes - node
    dist_2 = np.einsum('ij,ij->i', deltas, deltas)
    return nodes[np.argmin(dist_2)]


def file_name(original, suffix):
    return '{name}-{suffix}.jpeg'.format(name=original.rsplit('.', 1)[0], suffix=suffix)


def save_file(filename, data):
    with open(filename, 'wb') as f:
        f.write(data)
