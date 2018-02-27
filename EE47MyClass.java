import java.util.Scanner;

public class EE47MyClass {
	/** 
	 * la fontion permet de créer 2 array qui enregistrent les 2 numéros dans la question
	 * @param N1 le premier numero dans la question
	 * @param N2 le deuxieme numero dans la question
	 */
	public static void createQuiz(int[] N1,int[] N2) {
        for ( int i = 0; i < 10; i++ ) {
            N1[i] = (int)(Math.random() * 30);  
            N2[i] = (int)(Math.random() * 40); 
        }
    }
	/**
	 * la fonction permet d'afficher les question et enregistrer la réponse du joueur 
	 * @param N1 le premier numero dans la question
	 * @param N2 le deuxieme numero dans la question
	 * @param reponse la réponse du joueur
	 */
	 public static void administerQuiz(int[] N1, int[] N2, int[] reponse) {
	        Scanner sc = new Scanner(System.in);
	        int compteur =0;
	        for (int i = 0; i < 10; i++) {
	        	compteur++;
	            System.out.printf(compteur + " : " + N1[i] + " + " + N2[i] + " = ?" );
	            reponse[i] = sc.nextInt();
	        }
	    }
	 /**
	  * la fonction permet d'afficher le résultat et calculer le point du joueur
	  * @param N1 le premier numero dans la question
	  * @param N2 le deuxieme numero dans la question
	  * @param reponse la réponse du joueur
	  */
	 public static void gradeQuiz(int[] N1, int[] N2, int[] reponse) {
		 int correct = 0;
		 int point =0;
		 int compteur =0;
		 int nbCorrect =0;
		 for (int i = 0; i < 10; i++) {
			 compteur++;
			 int resultat = N1[i] + N2[i];
			 System.out.printf(compteur + " : " + N1[i] + " + " + N2[i] + " = " + resultat);
		      if ( reponse[i] == resultat ) {
		                System.out.println(" Bingo! Vous avez gagné 1 points");
		                nbCorrect++;
		            }
		            else {
		                System.out.println(" Non! Ce n'est pas le bon résultat");
		            }
		        }
		 	point = nbCorrect * 10;
	        System.out.println();
	        System.out.println("Vous avez " + nbCorrect + " questions corrects.");
	        System.out.println("Vous avez gagné: " + point);
	     
		 }
	 
	 public static void main(String[] args) {
	        int[] N1 = new int[10];  
	        int[] N2 = new int[10]; 
	        int[] reponse = new int[10];   
	        createQuiz(N1,N2);
	        administerQuiz(N1,N2,reponse);
	        gradeQuiz(N1,N2,reponse);
	    }
		 
	 }


