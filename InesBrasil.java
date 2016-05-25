import java.util.Scanner;

public class InesBrasil {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A, B, saida;
		boolean dividir = false;

		A = sc.nextInt();
		B = sc.nextInt();

		saida = mdc(A, B);

		if (saida % 2 == 0) {
			dividir = true;
		}

		while (dividir == true) {
			saida = saida/2;
			if (saida % 2 != 0) {
				dividir = false;
			}
		}
		System.out.println(saida*2);

	}

	private static int mdc(int a, int b) {

		int resto;
		while (b != 0) {
			resto = a % b;
			a = b;
			b = resto;

		}

		return a;
	}

}
