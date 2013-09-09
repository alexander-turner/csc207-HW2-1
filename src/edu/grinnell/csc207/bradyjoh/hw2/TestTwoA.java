package edu.grinnell.csc207.bradyjoh.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA {

    @Test
    public void test_isMultiple() {
	assertEquals("Negative and Positive",true,TwoA.isMultiple(-30,15));
	assertEquals("Positive and Negative",false,TwoA.isMultiple(5,-20));
	assertEquals("Negative and Negative",true,TwoA.isMultiple(-60,-20));
	assertEquals("Equal neg values",true,TwoA.isMultiple(-20,-20));
	assertEquals("Equal pos values",true,TwoA.isMultiple(7,7));
	assertEquals("Failing case",false,TwoA.isMultiple(5,2));
	assertEquals("zero and Negative",true,TwoA.isMultiple(0,-20));
	assertEquals("zero and zero",false,TwoA.isMultiple(0,0));
	for (int i = -1000; i<1000; i++){
	    if(i!=0)
		assertEquals("multiples of 2",true,TwoA.isMultiple(2*i,i));
	}
    } // test_isMultiple
    
    @Test
    public void test_isOdd() {
	assertEquals("zero",false,TwoA.isOdd(0));
	// Integer.MAX_VALUE is 2^31 - 1, which is odd
	assertEquals("MAX_VALUE", true, TwoA.isOdd(Integer.MAX_VALUE));
	for(int i = 1; i<1000; i+=2){
	    assertEquals("positive even", false, TwoA.isOdd(2*i));
	    assertEquals("positive odd", true, TwoA.isOdd(i));
    	    assertEquals("negative even", false, TwoA.isOdd(-2*i));
    	    assertEquals("negative odd", true, TwoA.isOdd(-1*i));
	} // for, this is from Alex's code
    } // test_isOdd
    
    @Test
    public void test_oddSumTo() {
	assertEquals("n=0",0,TwoA.oddSumTo(0));
	assertEquals("n=5",4,TwoA.oddSumTo(5));
	assertEquals("n=15",49,TwoA.oddSumTo(15));
    } // test_oddSumTo
    
    @Test
    public void test_isOddProd() {
	int[] array1 = {2,4,6,8,10};
	assertEquals("all evens", false, TwoA.isOddProd(array1));
	int[] array2 = {1,3,5,7,9};
	assertEquals("all odds", true, TwoA.isOddProd(array2));
	int[] array3= {2,4,6,7,9};
	assertEquals("mixed", true, TwoA.isOddProd(array3));
	
    //}
    } // test_isOddProd
    
    @Test
    public void test_allDistinct() {
	int[] array1={2,4,5,6,7,2,10};
	assertEquals("array1",false,TwoA.allDistinct(array1));
	int[] array2={2,4,5,6,7,10};
	assertEquals("array2",false,TwoA.allDistinct(array2));
	
    } // test_allDistinct

    
    @Test
    public void test_reverseInts() {
	int[] array1={2,4,5,6,7,2,10};
	int[] ar1rev={10,2,7,6,5,4,2};
	assertEquals("array1",ar1rev,TwoA.reverseInts(array1)); //comparing memory values, what in the world?
	int[] array2={2,4};
	int[] ar2rev={4,2};
	assertEquals("array2",ar2rev,TwoA.reverseInts(array2));
    }
}
