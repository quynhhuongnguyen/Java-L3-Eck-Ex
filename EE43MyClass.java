
public class EE43MyClass {
	/**
	 * @author huongquynh
	 * @param totalvoulu le total qu'on veut obtenir 
	 * @return le nombre des fois qu'on a lancé les 2 dés pour obtenir le total voulu
	 */
	public static int snakeeyes(int totalvoulu) {
		int des1;
		int des2;
		int totaldes = 0;
		int compteur = 0;
		if ( totalvoulu < 2 || totalvoulu > 12 )
	          throw new IllegalArgumentException("Total impossible pour 1 paire des dés");
		while (totaldes != totalvoulu){
			 des1 = (int)(Math.random()*6) + 1;
	         des2 = (int)(Math.random()*6) + 1;
	         totaldes = des1 + des2;
	         compteur++;
		}
		return compteur;
		
	}
	public static void main(String[] args) {
		int compteur = snakeeyes(2);
		System.out.println("Il nous faut " + compteur + " fois pour faire le snake eyes");
		
	}
}
