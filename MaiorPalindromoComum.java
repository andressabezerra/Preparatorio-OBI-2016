import java.util.ArrayList;
import java.util.Scanner;

public class MaiorPalindromoComum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, comeco, fim, count = 0;
		String palavra, pali = null;
		ArrayList<String> palindromos = new ArrayList();
		ArrayList<String> palavras = new ArrayList();

		do {

			n = sc.nextInt();

			for (int i = 0; i < n; i++) {

				palavra = sc.next();
				palavra.concat(".");
				
				
				if (i == 0) {
					for (comeco = 0; comeco < palavra.length(); comeco++)
						for (fim = palavra.length(); fim >= comeco; fim--) {

							if (ehPalindromo(palavra.substring(comeco, fim))
									&& !palindromos.contains(palavra.substring(comeco, fim)))
								palindromos.add(palavra.substring(comeco, fim));
							
						}
				} else {
					palavras.add(palavra);
				}
			}

			for (int j = 0; j < palindromos.size(); j++) {
				for (int k = 0; k < palavras.size(); k++) {
					if (!palavras.get(k).contains(palindromos.get(j)))
						break;
					else
						count++;
				}

				if (count == palavras.size()) {
					pali = palindromos.get(j);
					break;
				} else
					count = 0;
			}

			if (pali != null)
				System.out.println(pali.length());
			else
				System.out.println(0);

			count = 0;
			palavras.clear();
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
