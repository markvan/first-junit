package com.company.stack;

public class Main {

    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(2);
        stk.push(888);
        System.out.println( stk.pop() );
        System.out.println( stk.pop() );
    }
}
