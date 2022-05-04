from corner_finder import closest_node


def test_closest_node():
    # testing that the function returns the correct node
    assert closest_node([[0, 0], [1, 1], [2, 2]], [1, 1]) == [1, 1]
