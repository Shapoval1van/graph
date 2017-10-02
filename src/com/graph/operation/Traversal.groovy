package com.graph.operation

import com.graph.base.Graph
import com.graph.base.Vertex

abstract class Traversal {
    protected boolean[] processed
    protected boolean[] discovered
    protected int[] parent
    protected Graph graph

    Traversal(graph) {
        this.graph = graph
    }

    abstract void traversal(vertexNumber)

    void processedVertex(Vertex vertex){
        println "Vertex number $vertex.number proccesed"
    }

    void init() {
        parent = new int[graph.vertices.size()]
        processed = new boolean[graph.vertices.size()]
        discovered = new boolean[graph.vertices.size()]
    }

    Vertex getSuccessor(vertexNumber) {
        for (edge in graph.edges)
            if (edge.tuple.contains(new Vertex(number: vertexNumber)))
                if (!discovered[edge.tuple.second.number]){
                    parent[edge.tuple.second.number] = vertexNumber
                    return edge.tuple.second
                }
                else if (!discovered[edge.tuple.first.number]){
                    parent[edge.tuple.second.number] = vertexNumber
                    return edge.tuple.first
                }
        null
    }
}

