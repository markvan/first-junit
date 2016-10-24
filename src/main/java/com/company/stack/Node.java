package com.company.stack;

public class Node {
    private int value;
    Node next_node;

    public Node(Node next_n, int val) {
        next_node = next_n;
        value = val;
    }

    int value() {
        return value;
    }

    Node next() {
        return next_node;
    }
}
