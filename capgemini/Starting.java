package capgemini;
//import java.io.*;

public class Starting {

	   /* This is my first java program.  
	    * This will print 'Hello World' as the output
	    */

	    public static void main(String []args) {
	       System.out.println("Hello World"); // prints Hello World
	       int [] coins = new int[]{10,5,10,2,3};
	       if (PlaceToSplit.canBalance(coins))
	       {
	    	   System.out.println("Gut!");
	       }
	       else 
	       {
	    	   System.out.println("Nicht gut!");
	       }
	    }
	} 