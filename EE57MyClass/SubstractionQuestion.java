package EE57MyClass;

public class SubstractionQuestion implements IntQuestion {
	  private int N1, N2; 
      public SubstractionQuestion() { 
    	  N1 = (int)(Math.random() * 30);
          N2 = (int)(Math.random() * 40);
          //the answer is not negative
          if (N2 > N1) { 
             int N = N1;
             N1 = N2;
             N2 = N;
          }
      }
          
      public String getQuestion() {
          return "What is " + N1 + " - " + N2 + " ?";
      }
      public int getCorrectAnswer() {
          return N1 - N2; 
        
      }
}
