package edu.grinnell.csc207.bradyjoh.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA {

    @Test
    public void test_isMultiple() {
	assertEquals("Negative and Positive",true,twoA.isMultiple(-30,15));
	assertEquals("Positive and Negative",true,twoA.isMultiple(5,-20));
	assertEquals("Negative and Negative",true,twoA.isMultiple(-60,-20));
	assertEquals("Equal neg values",true,twoA.isMultiple(-20,-20));
	assertEquals("Equal pos values",true,twoA.isMultiple(7,7));
	assertEquals("Failing case",false,twoA.isMultiple(5,2));
	assertEquals("zero and Negative",true,twoA.isMultiple(0,-20));
	assertEquals("Negative and zero",false,twoA.isMultiple(-20,0));
	assertEquals("zero and zero",true,twoA.isMultiple(0,0));
	for (int i = -1000; i<1000; i++){
	    assertEquals("multiples of 2",true,twoA.isMultiple(2*i,i));
	}
	    
	
    }
    @Test
    public void test_isOdd() {
	assertEquals("zero",true,twoA.isOdd(0));
	assertEquals("negative",true,twoA.isOdd(-9));
	assertEquals("positive",true,twoA.isOdd(7));
	assertEquals("even",true,twoA.isOdd(8));
	 // Integer.MAX_VALUE is 2^31 - 1, which is odd
	assertEquals("MAX_VALUE", true, twoA.isOdd(Integer.MAX_VALUE));
	for(int i = 1; i<1000; i+=2){
	    assertEquals("positive even", true, twoA.isOdd(2*i));
	    assertEquals("positive odd", false, twoA.isOdd(i));
    	    assertEquals("negative even", true, twoA.isOdd(-2*i));
    	    assertEquals("negative odd", false, twoA.isOdd(-1*i));
	} // for, this is from Alex's code
    }
    
    @Test
    public void test_oddSumTo() {
	assertEquals("n=0",0,twoA.oddSumTo(0));
	assertEquals("n=5",4,twoA.oddSumTo(0));
	
    }
    
    @Test
    public void test_isOddProd() {
	//assertEquals("all evens", true, twoA.isOddProd([1,3,5,7,9]));
	
    //}
    }
    

}
