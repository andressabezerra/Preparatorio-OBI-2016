import java.util.ArrayList;
import java.util.Scanner;

public class MaiorPalindromo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, comeco, fim;
		String palavra, maiorPali = null;
		ArrayList<String> palindromos = new ArrayList();

		do {

			n = sc.nextInt();

			for (int i = 0; i < n; i++) {

				palavra = sc.next();

				for (comeco = 0; comeco < palavra.length(); comeco++)
					for (fim = palavra.length() - 1; fim >= comeco; fim--) {

						if (ehPalindromo(palavra.substring(comeco, fim + 1))
								&& !palindromos.contains(palavra.substring(comeco, fim + 1)))
							palindromos.add(palavra.substring(comeco, fim + 1));
						}
			}

			System.out.println(palindromos);
			palindromos.clear();

		} while (sc.hasNextInt());
	}

	private static boolean ehPalindromo(String palavra) {

		int comeco = 0;
		int fim = palavra.length() - 1;

		while (comeco < fim) {
			if (palavra.charAt(comeco) != palavra.charAt(fim)) {
				return false;
			}
			comeco++;
			fim--;
		}
		return true;
	}

}
