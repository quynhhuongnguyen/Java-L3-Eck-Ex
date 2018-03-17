package EE57MyClass;

import java.util.Scanner;

public class GeneralQuiz {
	private static IntQuestion[] questions; 
    private static int[] Answers;   // The user's answers to the ten questions.

	public static void main(String[] args) {
		createQuiz();
        administerQuiz();
        gradeQuiz();

	}

	private static void gradeQuiz() {
		 int correct = 0;
		 int point =0;
		 int nbCorrect =0;
		 for (int i = 0; i < 10; i++) {
			 System.out.println("Question number " + (i+1) + ":");
	         System.out.println("    " + questions[i].getQuestion());
		      if (Answers[i] == questions[i].getCorrectAnswer() ) {
		          nbCorrect++;
		       }
		   }
		 	point = nbCorrect * 10;
	        System.out.println();
	        System.out.println("Vous avez " + nbCorrect + " questions corrects.");
	        System.out.println("Vous avez gagné: " + point);
		
	}

	private static void createQuiz() {
		questions = new IntQuestion[10];
		for ( int i = 0; i < 8; i++ ) {
	            if (Math.random() < 1.0)
		            questions[i] = new AdditionQuestion();
		        else
		            questions[i] = new SubstractionQuestion();
	        }
		questions[8] = new IntQuestion(){
			public String getQuestion() {
                return "How many hours in a day?";
            }
            public int getCorrectAnswer() {
                return 24;
            }
		};
		questions[9] = new IntQuestion(){
			public String getQuestion() {
                return "How many arrondissements in Paris?";
            }
            public int getCorrectAnswer() {
                return 20;
            }
		};
	}

	private static void administerQuiz() {
		 Scanner sc = new Scanner(System.in);
	        int compteur =0;
	        Answers = new int[10];
	        for (int i = 0; i < 10; i++) {
	        	compteur++;
	        	System.out.printf("Question %2d:  %s ", compteur, questions[i].getQuestion());
	        	Answers[i] = sc.nextInt();
	        }
		
	}


}
