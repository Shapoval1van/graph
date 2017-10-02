package com.graph.operation

import com.graph.base.Vertex

class DFSTraversal extends Traversal{
    Vertex vertex
    Stack stack

    DFSTraversal(Object graph) {
        super(graph)
        stack = new Stack()
    }

    @Override
    void traversal(vertexNumber) {
        init()
        vertex = graph.vertices[vertexNumber]
        discovered[vertex.number] = true
        processed[vertex.number] = true
        parent[vertex.number] = -1
        stack.push(vertex)
        while (!stack.isEmpty()) {
            vertex = stack.pop()
            processed[vertex.number] = true
            processedVertex vertex
            Vertex tempVertex
            while ((tempVertex = getSuccessor(vertex.number)) != null) {
                discovered[tempVertex.number] = true
                stack.push(tempVertex)
            }
        }
    }
}
