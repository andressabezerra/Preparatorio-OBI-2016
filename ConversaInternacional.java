import java.util.ArrayList;
import java.util.Scanner;

public class ConversaInternacional {

	public static void main(String[] args) {
		
		int qtTestes, qtPessoas;
		String idiomaConversa, idiomaNativo;
		ArrayList idiomas = new ArrayList();
				
		Scanner sc = new Scanner(System.in);
		
		qtTestes = sc.nextInt();
		
		for(int i = 0; i < qtTestes; i++){
			
			qtPessoas = sc.nextInt();
			
			idiomaNativo = sc.next();
			idiomaConversa = idiomaNativo;
			
			for(int j = 0; j < qtPessoas-1; j++){
				if(!sc.next().equals(idiomaNativo)){
					idiomaConversa = "ingles";
				}
			}
			
			idiomas.add(idiomaConversa);
		}
		
		for(int i = 0; i < idiomas.size(); i++){
			System.out.println(idiomas.get(i));
		}
		
	}

}
