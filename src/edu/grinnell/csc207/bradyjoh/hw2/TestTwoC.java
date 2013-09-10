package edu.grinnell.csc207.bradyjoh.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoC {

    @Test
    public void test_decimalRep() {
	assertEquals("",3.5,TwoC.decimalRep(7/2));
    }
    @Test
    public void test_denominator() {
	assertEquals("",2,TwoC.denominator(3.5));
    }
    @Test
    public void test_square() {
	assertEquals("",400,TwoC.square(20));
    }
    @Test
    public void test_numerator() {
	assertEquals("",9,TwoC.numerator(4.5));
    }
    @Test
    public void test_floor() {
	assertEquals("",5,TwoC.floor(5.5348));
    }
    @Test
    public void test_ceiling() {
	assertEquals(78343,TwoC.ceiling(78342.2342));
    }
    @Test
    public void test_reciprocal() {
	assertEquals("",0.068856,TwoC.reciprocal(14.523));
    }
    @Test
    public void test_sqrt() {
	assertEquals("",4,TwoC.sqrt(16));
    }
    @Test
    public void test_string() {
	assertEquals("","5.35",TwoC.string(5.35));
    }
    @Test
    public void test_cube() {
	assertEquals("",125,TwoC.cube(5));
    }
    @Test
    public void test_round() {
	assertEquals("",6,TwoC.round(5.5));
    }
}
