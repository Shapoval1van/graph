package com.graph.base

class Graph {
    Vertex[] vertices
    Edge[] edges
    boolean isDirected

    def readGraph(fileName){
        def file = new File(fileName)
    }
}


class Vertex {
    int number

    @Override
    boolean equals(Object obj) {
        obj = (Vertex)obj
        this.number == obj.number
    }
}

class Edge {
    int number
    Tuple2 <Vertex, Vertex> tuple
}
