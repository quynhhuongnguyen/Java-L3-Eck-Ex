import java.util.ArrayList;
import java.util.Collections;

public class EE36MyClass {
	public static void main(String[] args) {
		int entier;
		int divisorMax;
		ArrayList <Integer> tab=new ArrayList<Integer>(10000);
		for ( entier = 1;  entier <= 10000;  entier++ ) {
	           int divisor;
	           int counter =0;
	           for ( divisor = 1;  divisor<= entier;  divisor++ ) {  
	              if ( entier % divisor == 0 ){
	            	  counter++;
	            	  tab.add(counter);
	              }
	           }
	          
	    }
		System.out.println("Among integers between 1 and 10000,");
		divisorMax = Collections.max(tab);
        System.out.println("The maximum number of divisors was " + divisorMax);
         
	}
}

