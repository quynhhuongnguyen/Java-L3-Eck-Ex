package Interger_Set;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegersSet {
	public static void main(String[] args) {
		 ArrayList<Integer> IntSet = new ArrayList<Integer>();
		 Scanner scan = new Scanner(System.in);

		 System.out.println("Please enter numbers. Enter 0.");
		 while (scan.hasNextLine()) {
		      int num = Integer.parseInt(scan.next());
		      if(num == 0) break;
		      IntSet.add(num);  
		 }
		 System.out.println(IntSet);
	 }
}
