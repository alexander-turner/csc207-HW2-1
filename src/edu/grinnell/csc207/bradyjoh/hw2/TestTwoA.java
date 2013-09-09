package edu.grinnell.csc207.bradyjoh.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA {

    @Test
    public void test_isMultiple() {
	assertEquals("Negative and Positive",true,twoA.isMultiple(-30,15));
	assertEquals("Positive and Negative",true,twoA.isMultiple(5,-20));
    }

}
