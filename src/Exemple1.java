/***
 * Les types de base en Java et les strctures de contrôle
 * @author E. Dauvin
 *
 */
public class Exemple1 {

	public static void main(String[] args) {
		// Les types de base
		boolean c;
		byte b;
		int a;
		long a2;
		float f;
		double f2;
		
		// assignation d'une valeur à une variable
		c = true;
		b = -25;
		a = 12;
		a2 = 69874528;
		f = (float) 65.42; // Notez le cast, car la valeur est considérée par défaut comme un double
		f2 = 9875.37522;
		
		// les structures alternatives
		
		if (a > 1) {
			System.out.println("La valeur de a est " + a);
		}
		else
			System.out.println("La valeur de a est plus petite ou égale à 1");
		
		// les structures répétitives
		for (int i=0; i<12; ++i) {
			System.out.println("Valeur de la variable de comptage i : " + i);
		}
		
		

	}
}