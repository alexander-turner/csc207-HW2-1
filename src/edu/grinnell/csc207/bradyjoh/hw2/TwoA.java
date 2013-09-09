package edu.grinnell.csc207.bradyjoh.hw2;

public class TwoA {

    public static boolean isMultiple(long a, long b) 
    { 
	if (b==0)
	    return false;
	return(0 == (a % b));
	    
    } // isMultiple

    public static boolean isOdd(int i)
    {
	if (i == 0)
	    return false;
	if (i == 1 || i == -1)
	    return true;
	return (i != ((i >> 1) << 1));
    } // isOdd

    public static int oddSumTo(int n)
    {
	int sum = 0;
	for(int i = 1; i < n; i+=2)
	    sum += i;
	return sum;
    } // oddSumTo

    public static boolean isOddProd(int[] ints)
    { 
	if(ints.length > 1)
	    for(int x = 0; x<(ints.length-1); x++)
		for(int y=x+1; y<ints.length; y++)
		    if (TwoA.isOdd(ints[x]*ints[y]))
			return true;
	return false;
    } // isOddProd

    public static boolean allDistinct(int[] ints)
    {
	if(ints.length <= 1)
	    return true;
	for(int x = 0; x<(ints.length-1); x++)
	    for(int y=x+1; y<ints.length; y++)
		if (ints[x]==ints[y])
		    return true;
	return false;
    } // allDistinct

    public static int[] reverseInts(int[] ints)
    {
	if(ints.length > 1)
	    for (int i = 0; i<ints.length-i; i++)
	    {
		int hold = ints[i];
		ints[i]=ints[ints.length-i];
		ints[ints.length-i]=hold;
	    }
	return ints;
    } // reverseInts - idea from http://stackoverflow.com/questions/2137755/how-do-i-reverse-an-int-array-in-java
}