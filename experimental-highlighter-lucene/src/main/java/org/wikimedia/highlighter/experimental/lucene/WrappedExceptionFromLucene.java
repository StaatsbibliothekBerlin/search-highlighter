package org.wikimedia.highlighter.experimental.lucene;

public class WrappedExceptionFromLucene extends RuntimeException {
    private static final long serialVersionUID = -3838263646006326148L;

    public WrappedExceptionFromLucene(Throwable cause) {
        super(cause);
    }
}