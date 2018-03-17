package EE57MyClass;

public class AdditionQuestion implements IntQuestion {
	  private int N1, N2; 
      public AdditionQuestion() { 
          N1 = (int)(Math.random() * 30);
          N2 = (int)(Math.random() * 40);
      }
      public String getQuestion() {
          return "What is " + N1 + " + " + N2 + " ?";
      }
      public int getCorrectAnswer() {
          return N1 + N2;
      }

}
