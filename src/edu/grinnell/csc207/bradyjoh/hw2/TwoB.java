package edu.grinnell.csc207.bradyjoh.hw2;

public class TwoB {
    /**
     * Compute the average of two integers.  Rounds toward zero if the
     * average is not a whole number.
     * One issue is when we want the average of Integer.MAX_VALUE, or something that 
     * would push our sum over Integer.MAX_VALUE. We can at least prevent it 
     * from reaching MAX_INT if the two numbers would sum to over the value,
     * or if the numbers are the same.
     */
    public static int average(int left, int right) {
	if(left>(Integer.MAX_VALUE/2) && right>(Integer.MAX_VALUE/2)) //alternatively, (left==right)
	    return left;
	else
        return (left + right) / 2;
    } // average(int,int)
} // class TwoB