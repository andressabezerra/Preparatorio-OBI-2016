import java.util.ArrayList;
import java.util.Scanner;

public class InesVenezuelana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList divisores = new ArrayList();
		int A, B;
		long ladoMesa, qtCdsInes;
		
		boolean achou = false;

		A = sc.nextInt();
		B = sc.nextInt();

		int aux = 1;
		while (aux <= MDC(A,B)) {
			if (A % aux == 0 && B % aux == 0) {
				divisores.add(aux);
			}
			aux++;
		}
		ladoMesa = 1;
		qtCdsInes = 1;

		while (!encontrou(divisores, qtCdsInes)) {
			ladoMesa++;
			qtCdsInes = ladoMesa * ladoMesa;
		}

		System.out.println(ladoMesa);
	}

	private static boolean encontrou(ArrayList divisores, long qtCdsInes) {
		for (int i = 0; i < divisores.size(); i++) {
			if (qtCdsInes % (int) divisores.get(i) != 0) {
				return false;
			}
		}
		return true;
	}

	public static int MDC(int A, int B) {
		int resto;
		while (B != 0) {
			resto = A % B;
			A = B;
			B = resto;
		}
		return A;
	}

}
