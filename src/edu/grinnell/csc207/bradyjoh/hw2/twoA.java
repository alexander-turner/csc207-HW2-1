package edu.grinnell.csc207.bradyjoh.hw2;

public class twoA {
    
  
    public static boolean isMultiple(long a, long b) 
    { if ((a/b) == (int)(a/b)) //integer test from http://stackoverflow.com/questions/5502548/checking-if-a-number-is-an-integer-in-java
	return true;
    else
	return false;
    
   /* second version:
     int i;
    	    for(i = 1; b*i < a; i++);
            return (b*i == a);  
    */
    
    } // isMultiple
    
    public static boolean isOdd(int i)
    {int half_i = i << 1;
	    return (i != 0) && (i == (half_i >> 1));
	
    }
    
    public static int oddSumTo(int n)
    {
    int sum = 0;
	    for(int i = 1; i < n; i+=2)
	        sum += i;
	    return sum;
    }
    
    public static boolean isOddProd (int n)
    { return true;
    
    }
    
    
}

