package com.graph

import com.graph.base.Edge
import com.graph.base.Graph
import com.graph.base.Vertex
import com.graph.operation.BFSTraversal
import com.graph.operation.DFSTraversal


Graph graph = new Graph()
graph.vertices = [new Vertex(number: 0), new Vertex(number: 1), new Vertex(number: 2), new Vertex(number: 3), new Vertex(number: 4)]
graph.edges = [new Edge(number: 0, tuple: new Tuple(graph.vertices[0], graph.vertices[2])),
        new Edge(number: 1, tuple: new Tuple(graph.vertices[0], graph.vertices[4])),
        new Edge(number: 2, tuple: new Tuple(graph.vertices[1], graph.vertices[3])),
        new Edge(number: 0, tuple: new Tuple(graph.vertices[1], graph.vertices[4]))]

traversal = new BFSTraversal(graph)
traversal.traversal 0

println traversal.parent

traversal = new DFSTraversal(graph)
traversal.traversal(0)