package edu.grinnell.csc207.bradyjoh.hw2;

public class TwoA {

    /**isMultiple tests whether there exists an integer i such that a == b*i.
	Pre-conditions:
	a, b are longs.
	Post-conditions:
	Returns true if there is an integer i such that a == b*i, otherwise false.
     */
    public static boolean isMultiple(long a, long b) 
    { 
	if (b==0)
	    return false;
	return(0 == (a % b));
	    
    } // isMultiple

    /*isOdd tests whether a number is odd.
	Pre-conditions:
	n is an integer.
	Post-conditions:
	returns true if n is odd, otherwise false.
     */
    public static boolean isOdd(int i)
    {
	if (i == 0)
	    return false;
	if (i == 1 || i == -1)
	    return true;
	return (i != ((i >> 1) << 1));
    } // isOdd

    /*
     * oddSumTo sums the positive integers less than n.
	Pre-conditions:
	n is a positive integer.
	To avoid overflow, n <= sqrt(integer.MAX_INT).
	Post-conditions:
	If n is even, sum = 1 + 3 + ... + n-3 + n-1
	If n is odd, sum = 1 + 3 + ... + n-4 + n-2
     */
    public static int oddSumTo(int n)
    {
	int sum = 0;
	for(int i = 1; i < n; i+=2)
	    sum += i;
	return sum;
    } // oddSumTo

    /*
     * 
	isOddProd tests whether there is any pair of numbers in the array whose
 	product is odd.
	Pre-conditions:
	ints is an array of integers.
	Post-conditions:
	returns true if there is a pair of numbers with an odd product, otherwise false.
     */
    public static boolean isOddProd(int[] ints)
    { 
	if(ints.length > 1)
	    for(int x = 0; x<(ints.length-1); x++)
		for(int y=x+1; y<ints.length; y++)
		    if (TwoA.isOdd(ints[x]*ints[y]))
			return true;
	return false;
    } // isOddProd

    /*
     * 
	allDistinct tests whether no two numbers in an array are equal.
	Pre-conditions:
	ints is an array of numbers.
	Post-conditions:
	If any two numbers are equal, then false is returned, otherwise true.
     */
    public static boolean allDistinct(int[] ints)
    {
	if(ints.length <= 1)
	    return true;
	for(int x = 0; x<(ints.length-1); x++)
	    for(int y=x+1; y<ints.length; y++)
		if (ints[x]==ints[y])
		    return false;
	return false;
    } // allDistinct
    /*
     * 
	reverseInts reverses an array of integers.
	Pre-conditions:
	none.
	Post-conditions:
	returns the reversed array.
     */
    public static int[] reverseInts(int[] ints)
    {
	if(ints.length > 1)
	    for (int i = 0; i<ints.length-1-i; i++)
	    {
		int hold = ints[i];
		ints[i]=ints[ints.length-i-1];
		ints[ints.length-i-1]=hold;
	    }
	return ints;
    } // reverseInts - idea from http://stackoverflow.com/questions/2137755/how-do-i-reverse-an-int-array-in-java
  
}