package com.vesoft.nebula.sentence.graph;

/**
 * DELETE EDGE <edge_type> <vid> -> <vid>[@<ranking>] [, <vid> -> <vid> ...]
 */
public class DeleteEdgeSentence extends DeleteSentence {

    public DeleteEdgeSentence() {

    }

    public DeleteEdgeSentence addEdges(Long source, Long target, Long ranking) {
        return this;
    }

    public DeleteEdgeSentence addEdges(Long source, Long target) {
        return this;
    }

    @Override
    public String build() {
        return String.format("DELETE EDGE %s");
    }


}
