package com.vesoft.nebula.sentence.graph;

/**
 * INSERT VERTEX <tag_name> [, <tag_name>, ...] (prop_name_list[, prop_name_list])
 * {VALUES | VALUE} vid: (prop_value_list[, prop_value_list])
 */
public class InsertVertexSentence extends InsertSentence {
    InsertVertexSentence addTagName(String name) {
        return this;
    }

    @Override
    public String build() {
        return null;
    }
}
