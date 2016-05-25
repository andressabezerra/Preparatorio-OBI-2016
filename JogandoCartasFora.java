import java.util.ArrayList;
import java.util.Scanner;

public class JogandoCartasFora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, base, proximo;
		
		ArrayList pilhaDeCartas = new ArrayList();
		num = sc.nextInt();
		
		while(num != 0){
			
			for(int i = 0; i < num; i++){
				pilhaDeCartas.add(i+1);
			}
			
			System.out.print("Discarded cards: ");
			int indice = 0;
			int tamanho = pilhaDeCartas.size();
			
			while(indice<tamanho-2){
				
				System.out.print(pilhaDeCartas.get(indice) + ", ");
				indice++;
				
				base = (int) pilhaDeCartas.get(indice);				
				pilhaDeCartas.add(base);
				
				pilhaDeCartas.remove(indice);
				
			}
			System.out.println(pilhaDeCartas.get(tamanho-2));
			System.out.println("Remaining card: " + pilhaDeCartas.get(tamanho-1));
			
			pilhaDeCartas.clear();
			num = sc.nextInt();
		}
		
	}

}
