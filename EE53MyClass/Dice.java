package EE53MyClass;

public class Dice {
	private int die1;
	private int die2;
	
	public Dice() {
		play();
	}

	public void play() {
		  die1 = (int)(Math.random()*6) + 1;
          die2 = (int)(Math.random()*6) + 1;
	}
	public int getDice1() {
		return die1;
	}
	public int getDice2() {
		return die2;
	}
	public int total() {
		return die1+die2;
	}
	public int counter() {
		 int count = 0;
		 int total = total();
		 return count;
	}
	                                                                        
	public String toString() {
	    return "Die1 : " +die1+ ", Die2 : " +die2;
	}
	

}