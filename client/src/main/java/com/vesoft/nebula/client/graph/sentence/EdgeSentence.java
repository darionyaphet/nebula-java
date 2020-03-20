package com.vesoft.nebula.client.graph.sentence;

public abstract class EdgeSentence {

    protected class EdgeKey {
        public EdgeKey(Long source, Long target, Long ranking) {
            this.source = source;
            this.target = target;
            this.ranking = ranking;
        }

        @Override
        public String toString() {
            return "EdgeKey{" +
                    "source=" + source +
                    ", target=" + target +
                    ", ranking=" + ranking +
                    '}';
        }

        private Long source;
        private Long target;
        private Long ranking;
    }
}
