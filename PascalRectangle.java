package com.capgemini.pascalrectangle;

/**
 * Created by ldrygala on 2015-01-23.
 * 0                     1
 * 1                   1   1
 * 2                 1   2   1
 * 3               1   3   3   1
 * 4             1   4   6   4   1
 * 5           1   5   10  10   5   1
 * 6         1   6   15  20  15   6   1
 * 7       1   7   21  35  35   21  7   1
 * 8     1   8   28  56  70  56   28  8   1
 * 9   1   9  36   84  126 126  84  36  9   1
 */
public class PascalRectangle {
    public long pascal(int c, int r) // column, row
    // make sure, that there is such a column in the row, 
    // some kind of a function that calculates numbers of columns based on num. of rows
    // simply cloumns == rows + 1
    // throw exception if that doesn't agree
    {
    	if (c > r)
    	{
    		//throw 
    		System.out.println("niepoprawne argumenty")
    	}
    	
    	
        return 0;
    }
}