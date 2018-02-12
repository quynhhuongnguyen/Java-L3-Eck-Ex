import java.util.Scanner;
public class EE34MyClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le text :");
		String text = sc.nextLine();
	    int position;        
	    char charactere;        

	    for ( position = 0;  position < text.length(); position++ ) {
	    	charactere = text.charAt(position);
	    	if ( Character.isLetter(charactere) )
	    	     System.out.print(charactere);
	    	else
	    	      System.out.println();   
	    	}
	         
	   }  


	}


