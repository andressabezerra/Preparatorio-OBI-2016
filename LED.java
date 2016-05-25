import java.util.ArrayList;
import java.util.Scanner;

public class LED {

	public static void main(String[] args) {

		int qtTestes, qtLeds;
		String numero;
		ArrayList saida = new ArrayList();
				
		Scanner sc = new Scanner(System.in);
		
		qtTestes = sc.nextInt();
		
		for(int i = 0; i < qtTestes; i++){
			
			numero = sc.next();
			qtLeds = 0;
			
			for(int j = 0; j < numero.length(); j++){
				switch(numero.charAt(j)){
				case '1':
					qtLeds = qtLeds + 2;
					break;
				case '2':
					qtLeds = qtLeds + 5;
					break;
				case '3':
					qtLeds = qtLeds + 5;
					break;
				case '4':
					qtLeds = qtLeds + 4;
					break;
				case '5':
					qtLeds = qtLeds + 5;
					break;
				case '6':
					qtLeds = qtLeds + 6;
					break;
				case '7':
					qtLeds = qtLeds + 3;
					break;
				case '8':
					qtLeds = qtLeds + 7;
					break;
				case '9':
					qtLeds = qtLeds + 6;
					break;
				case '0':
					qtLeds = qtLeds + 6;
					break;
				}
			}
			
			saida.add(qtLeds + " leds");
		}
		
		for(int i = 0; i < saida.size(); i++){
			System.out.println(saida.get(i));
		}
		
	}

}
