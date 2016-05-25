import java.util.ArrayList;
import java.util.Scanner;

public class TeoremaDePitagoras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y, z;
		ArrayList saida = new ArrayList();
						
		while (sc.hasNextLine()) {

			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();

			if ((x * x == y * y + z * z) || (y * y == x * x + z * z) || (z * z == y * y + x * x) && (mdc(x, y) == 1 && mdc(x, z) == 1 && mdc(y, z) == 1)) {
				saida.add("tripla pitagorica primitiva");
			} else if ((x * x == y * y + z * z) || (y * y == x * x + z * z) || (z * z == y * y + x * x)) {
				saida.add("tripla pitagorica");
			} else {
				saida.add("tripla");
			}
		} 

		for (int i = 0; i < saida.size(); i++) {
			System.out.println(saida.get(i));
		}
	}

	private static int mdc(int x, int y) {
		int resto;

	    while(y != 0){
	      resto = x % y;
	      x = y;
	      y = resto;
	    }

	    return x;
	  } 
				
}
