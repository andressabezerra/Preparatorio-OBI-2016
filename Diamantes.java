import java.util.Scanner;

public class Diamantes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		String entrada;

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			entrada = sc.next();
			System.out.println(contaDiamantes(entrada));
		}
	}

	private static int contaDiamantes(String entrada) {
		int qtMenor = 0;
		int qtMaior = 0;

		for(int i = 0; i < entrada.length(); i++){
			if(entrada.charAt(i) == '<')
				qtMenor++;
			if(entrada.charAt(i) == '>')
				qtMaior++;
		}
		
		if (qtMenor <= qtMaior)
			return qtMenor;
		else
			return qtMaior;
	}

}
