package com.graph.operation

import com.graph.base.Vertex

class BFSTraversal extends Traversal {
    Vertex vertex
    Queue queue

    BFSTraversal(Object graph) {
        super(graph)
        queue = new LinkedList()
    }

    @Override
    void traversal(vertexNumber) {
        init()
        vertex = graph.vertices[vertexNumber]
        discovered[vertex.number] = true
        processed[vertex.number] = true
        parent[vertex.number] = -1
        queue.add(vertex)
        while (!queue.isEmpty()) {
            vertex = queue.remove()
            processed[vertex.number] = true
            processedVertex vertex
            Vertex tempVertex
            while ((tempVertex = getSuccessor(vertex.number)) != null) {
                discovered[tempVertex.number] = true
                queue.add(tempVertex)
            }
        }
    }
}
