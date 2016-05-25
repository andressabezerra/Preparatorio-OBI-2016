import java.util.ArrayList;
import java.util.Scanner;

public class ObiUri {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N;
		String palavra;
		ArrayList palavras = new ArrayList();
		
		N = sc.nextInt();
		for(int i =0; i<N;i++){
			palavra = sc.next();
			if(palavra.length()==3 && (palavra.substring(0, 2).equals("UR"))){
				palavra = "URI";
			}
			if(palavra.length()==3 && (palavra.substring(0, 2).equals("OB"))){
				palavra = "OBI";
			}
			palavras.add(palavra);
		}
		for(int i = 0; i < palavras.size()-1; i++){
			System.out.print(palavras.get(i)+ " ");
		}
		System.out.println(palavras.get(palavras.size()-1));
	}

}
