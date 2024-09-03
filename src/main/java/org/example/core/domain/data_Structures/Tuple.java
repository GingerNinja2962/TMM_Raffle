package org.example.core.domain.data_Structures;

public interface Tuple<A, B> extends Comparable<Tuple<A, B>> {

    A getFirst();
    B getSecond();
}
