package com.company.stack;


import java.util.EmptyStackException;

public class Stack {
    private Node head = null ;


    public Stack push(int value) {
        head = new Node(head, value);
        return this;
    }

    public int pop()  {
        if ( not_empty() ) {
            int ret = head.value();
            head = head.next();
            return  ret;
        }
        else
            // todo error handling needed
            throw  new EmptyStackException();
            // return -999999999 ;
    }

    private boolean not_empty() {
        return head != null;
    }

}

