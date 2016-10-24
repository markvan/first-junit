package com.company.stack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.EmptyStackException;

public class MyTests {

    @Test
    public void should_pop_a_single_push() {
        Stack stk = new Stack();
        stk.push(3);
        assertEquals( 3, stk.pop() );
    }

    @Test
    public void should_pop_two_pushes() {
        Stack stk = new Stack();
        stk.push(3).push(300);
        assertThat( stk.pop(), equalTo( 300 ) );
        assertThat( stk.pop(), equalTo( 3 ) );
    }

    @Test(expected=EmptyStackException.class)
    public void should_handle_pop_of_empty_stack() {
        Stack stk = new Stack();
        stk.pop();
    }
}