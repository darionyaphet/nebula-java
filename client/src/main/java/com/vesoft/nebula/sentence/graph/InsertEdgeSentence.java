package com.vesoft.nebula.sentence.graph;

/**
 * INSERT EDGE <edge_name> ( <prop_name_list> ) VALUES | VALUE
 * <src_vid> -> <dst_vid>[@<ranking>] : ( <prop_value_list> )
 * [, <src_vid> -> <dst_vid> : ( <prop_value_list> ), ...]
 */
public class InsertEdgeSentence extends InsertSentence {

    InsertEdgeSentence addEdgeName(String name) {
        return this;
    }

    @Override
    public String build() {
        return null;
    }
}
