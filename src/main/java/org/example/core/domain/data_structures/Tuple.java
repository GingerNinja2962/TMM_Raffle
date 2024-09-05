package org.example.core.domain.data_structures;

public interface Tuple<A, B> extends Comparable<Tuple<A, B>> {

    A getFirst();
    B getSecond();
}
