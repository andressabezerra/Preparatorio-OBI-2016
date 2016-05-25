import java.util.Scanner;

public class Parenteses {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String entrada;
		boolean correto = false;
		int indice1, indice2;

		while (sc.hasNext()) {

			entrada = sc.nextLine();

			indice1 = 0;
			indice2 = 0;

			for (int i = 0; i < entrada.length(); i++) {
				if(entrada.charAt(i) == '('){
					for(int j = i + 1; j < entrada.length(); j++){
						if(entrada.charAt(j) == ')'){
							entrada.replaceFirst("(", "*");
							break;
						}
					}
				}
			}

			if (correto) {
				System.out.println("correct");
			} else {
				System.out.println("incorrect");
			}

			correto = false;
		}
	}

}
