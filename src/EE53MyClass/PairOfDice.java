package EE53MyClass;

public class PairOfDice {
	public static void main(String[] args) {
		Dice PairOfDice = new Dice();
		int counter = 0;
		while (PairOfDice.total() != 2){
			PairOfDice.play();
			counter ++;
			System.out.println("Numero sur les 2 des " + PairOfDice );
		}
		System.out.println("\nIl faut " + counter + " pour obternir 2.");

	}

}
