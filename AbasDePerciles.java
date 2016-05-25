import java.util.Scanner;

public class AbasDePerciles {

	public static void main(String[] args) {
		
		int N;
		int M;
		String opcao;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		
		for(int i = 0; i< M; i++){
			opcao = sc.next();
			
			if(opcao.equals("fechou")){
				N--;
				N = N +2;
			}else{
				N--;
			}
		}
		
		System.out.println(N);
		
	}

}
