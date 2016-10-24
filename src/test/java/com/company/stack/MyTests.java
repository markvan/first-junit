package com.company.stack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.matchers.JUnitMatchers.containsString;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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

    @Test
    public void should_throw_exception_on_pop_of_empty_stack_1() {
        Stack stk = new Stack();
        boolean emptyStackExceptionThrown = false;
        try {
            stk.pop();
        } catch (EmptyStackException e) {
            emptyStackExceptionThrown = true;
        }
        assertTrue( emptyStackExceptionThrown );
    }

    @Test
    public void should_throw_exception_on_pop_of_empty_stack_2() {
        Stack stk = new Stack();
        boolean emptyStackExceptionThrown = false;
        try {
            stk.pop();
        } catch (EmptyStackException e) {
            emptyStackExceptionThrown = true;
        } catch (Exception e) {
            assertEquals(null, e);
        }
        assertEquals( true, emptyStackExceptionThrown );
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void should_throw_exception_on_pop_of_empty_stack_3() { // throws EmptyStackException {
        Stack stk = new Stack();
        exception.expect(EmptyStackException.class);
        //exception.expectMessage(containsString("this will always fail for an exception without a message"));
        stk.pop();
        // ... this line will never be reached when the test is passing
    }
}