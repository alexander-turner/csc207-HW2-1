package edu.grinnell.csc207.bradyjoh.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA {

    @Test
    public void test_isMultiple() {
	assertEquals("Negative and Positive",true,TwoA.isMultiple(-30,15));
	assertEquals("Positive and Negative",true,TwoA.isMultiple(5,-20));
	assertEquals("Negative and Negative",true,TwoA.isMultiple(-60,-20));
	assertEquals("Equal neg values",true,TwoA.isMultiple(-20,-20));
	assertEquals("Equal pos values",true,TwoA.isMultiple(7,7));
	assertEquals("Failing case",false,TwoA.isMultiple(5,2));
	assertEquals("zero and Negative",true,TwoA.isMultiple(0,-20));
	assertEquals("Negative and zero",false,TwoA.isMultiple(-20,0));
	assertEquals("zero and zero",true,TwoA.isMultiple(0,0));
	for (int i = -1000; i<1000; i++){
	    assertEquals("multiples of 2",true,TwoA.isMultiple(2*i,i));
	}
	    
	
    }
    @Test
    public void test_isOdd() {
	assertEquals("zero",true,TwoA.isOdd(0));
	assertEquals("negative",true,TwoA.isOdd(-9));
	assertEquals("positive",true,TwoA.isOdd(7));
	assertEquals("even",true,TwoA.isOdd(8));
	 // Integer.MAX_VALUE is 2^31 - 1, which is odd
	assertEquals("MAX_VALUE", true, TwoA.isOdd(Integer.MAX_VALUE));
	for(int i = 1; i<1000; i+=2){
	    assertEquals("positive even", true, TwoA.isOdd(2*i));
	    assertEquals("positive odd", false, TwoA.isOdd(i));
    	    assertEquals("negative even", true, TwoA.isOdd(-2*i));
    	    assertEquals("negative odd", false, TwoA.isOdd(-1*i));
	} // for, this is from Alex's code
    }
    @Test
    public void test_oddSumTo() {
	assertEquals("n=0",0,TwoA.oddSumTo(0));
	assertEquals("n=5",4,TwoA.oddSumTo(0));
	
    }
    @Test
    public void test_isOddProd() {
	//assertEquals("all evens", true, twoA.isOddProd([1,3,5,7,9]));
	
    //}
    }
    @Test
    public void test_allDistinct() {
	
    }

}
