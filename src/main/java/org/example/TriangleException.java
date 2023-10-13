package org.example;

public class TriangleException extends Exception {
    public TriangleException(int a, int b, int c) {
        super(String.format("The sides %d, %d, and %d do not form a valid triangle.", a, b, c));    //若不符合三角形條件就印出
    }
}
