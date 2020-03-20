package com.vesoft.nebula.sentence.graph;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * DELETE VERTEX <vid_list>
 */
public class DeleteVertexSentence extends DeleteSentence {

    public DeleteVertexSentence() {
        vertices = Lists.newLinkedList();
    }

    public DeleteVertexSentence addVertices(String... vertices) {
        for (String vertex : vertices) {
            this.vertices.add(vertex);
        }
        return this;
    }

    @Override
    public String build() {
        return String.format("DELETE VERTEX %s", Joiner.on(",").join(vertices));
    }

    private List<String> vertices;
}
