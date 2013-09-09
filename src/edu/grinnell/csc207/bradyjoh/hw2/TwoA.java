package edu.grinnell.csc207.bradyjoh.hw2;

public class TwoA {
    
  
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
    
    public static boolean isOddProd (int[] ints)
    { return true;
    
    }
    
    public static boolean allDistinct(int[] ints){
	if(ints.length <= 1) {
		return false;
	}
	else {
	    for(int x = 0; x<(ints.length-1);x++)
	    {int num=ints[x];
	    	
		    for(int y=x+1;y<(ints.length-1);y++)
		    {
			if (num==ints[y])
				return true;
		    }
		
	    } //for
	    return false;
	}
    }

    public static int[] reverseInts(int[] ints){
	if(ints.length <= 1) {
		return ints;
	}
	else {
	    int i = 0;
	    int j = ints.length-1;
	    while(i<j)
	    {
		int hold = ints[i];
		ints[i]=ints[j];
		ints[j]=hold;
		i++;
		j--;
	    }
	    return ints;
	}
	
    } //reverseInts - idea from http://stackoverflow.com/questions/2137755/how-do-i-reverse-an-int-array-in-java
}

