//package com.capgemini.placeToSplit;

/**
 * Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
 * Example:
 * {{{
 * canBalance({1, 1, 1, 2, 1}) → true
 * canBalance({2, 1, 1, 2, 1}) → false
 * canBalance({10, 10}) → true
 * }}}
 */
public final class PlaceToSplit {
    private PlaceToSplit()  
    {
    	// dlaczego prywatny konstruktor??? 
    }

    public static boolean canBalance(int[] nums) 
    {
    	if (nums.length == 0)
    	{ 
    		return false;
    	}
    	// wyznaczyc indeksy
    	int ind1 = 0;
    	int ind2 = nums.length - 1;
    	int suma1 = 0;
    	int suma2 = 0;
    	while (ind1 != ind2)
    	{
    		if (suma1 < suma2)
    		{
    			suma1 += nums[ind1];
    			++ind1;
    		}
    		else
    		{
    			suma2 += nums[ind2];
    			--ind2;
    		}
    		
    	}
    	return suma1 == suma2;
    	       
    }
}
