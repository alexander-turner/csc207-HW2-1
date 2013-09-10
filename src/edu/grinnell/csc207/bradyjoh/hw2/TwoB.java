package edu.grinnell.csc207.bradyjoh.hw2;

public class TwoB {
    /**
     * Compute the average of two integers.  Rounds toward zero if the
     * average is not a whole number.
     *There would be an issue with the sum of the two numbers going past
     *Integer.MAX_VALUE. We fix that by storing the intermediate sum as a 
     *long integer (64 bit) and restore the original 32 bit version for the 
     *return statement.
     */
    public static int average(int left, int right) {
	long bob = (left + right)/2;
	return (int)bob;	
    } // average(int,int)
} // class TwoB