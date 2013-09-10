package edu.grinnell.csc207.bradyjoh.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoC {
    
    @Test
    public void test_decimalRep() {
    	testNum = Rational.create(7,2);
	assertEquals("Decimal representation of 7/2",3.5,testNum.decimalRep);
    }
    
    @Test
    public void test_numerator() {
    	testNum = Rational.create(7,2);
	assertEquals("Numerator of 7/2",7,testNum.numerator);
    }
    
    @Test
    public void test_denominator() {
    	testNum = Rational.create(7,2);
	assertEquals("Denominator of 7/2",2,testNum.denominator);
    }
    
    @Test
    public void test_square() {
    	testNum = Rational.create(7,2);
	assertEquals("Square of 7/2",49/4,testNum.square);
    }
    
    @Test
    public void test_floor() {
    	testNum = Rational.create(7,2);
	assertEquals("Floor of 3.5",3,testNum.floor);
    }
    
    @Test
    public void test_ceiling() {
       	testNum = Rational.create(7,2);
	assertEquals("Ceiling of 3.5",4,testNum.ceiling);
    }
    
    @Test
    public void test_round() {
    	testNum = Rational.create(7,2);
	assertEquals("Round 7/2",4,testNum.round);
    }
    
    @Test
    public void test_reciprocal() {
    	testNum = Rational.create(7,2);
	assertEquals("Reciprocal of 7/2",2/7,testNum.reciprocal);
    }
    
    @Test
    public void test_sqrt() {
        testNum = Rational.create(16,1);
	assertEquals("Square root of 16",4,testNum.sqrt);
    }
    
    @Test
    public void test_string() {
    	testNum = Rational.create(7,2);
	assertEquals("String representation of 7/2","7/2",testNum.string);
    }
    
    @Test
    public void test_expt() {
    	testNum = Rational.create(7,2);
	assertEquals("Exponentiate 7/2 to the third",42.875,testNum.expt);
    }
    
    @Test
    public void test_add() {
    	testNum1 = Rational.create(7,2);
    	testNum2 = Rational.create(3,2);
	assertEquals("Add 7/2 and 3/2",5,testNum1.add(testNum2));
    }
    
    @Test
    public void test_multiply() {
    	testNum = Rational.create(7,2);
	assertEquals("Multiply 7/2 by 2",7,testNum.multiply(2));
    }
    
    @Test
    public void test_duplicate() {
    	testNum = Rational.create(7,2);
    	testCopy = Rational.duplicate(testNum);
    	assertEquals("Comparing the two rational numbers",testNum.decimalRep,testCopy.decimalRep);
    }
}
