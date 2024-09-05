package org.example.core.domain.data_structures.Impl;

import org.example.core.domain.data_structures.Tuple;

public class TupleImpl<A, B> implements Tuple<A, B> {

    private final A a;
    private final B b;

    public TupleImpl(A a, B b) {
        this.a = a;
        this.b = b;
    }

    //<editor-fold desc="======== Getters & Setters ========">
    public A getFirst() {
        return this.a;
    }

    public B getSecond() {
        return this.b;
    }
    //</editor-fold>

    //<editor-fold desc="======== Comparable ========">
    /**
     * Compares the object to another Tuple.
     * Returns 0 if both values are the same.
     * returns 1 if the first values in the tuples are the same.
     * returns 2 if the second values in the tuples are the same.
     * returns -1 if neither value in the tuples are the same.
     *
     * @param tuple the object to be compared.
     * @return int
     */
    @Override
    public int compareTo(Tuple<A, B> tuple) {
        boolean first = this.a.equals(tuple.getFirst());
        boolean second = this.b.equals(tuple.getSecond());
        return first ? second ? 0 : 1 : second ? 2 : -1;
    }
    //</editor-fold>
}
