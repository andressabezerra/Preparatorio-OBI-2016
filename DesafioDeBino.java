import java.util.Scanner;

public class DesafioDeBino {

	public static void main(String[] args) {
		
		int N;
		int num;
		int count2 = 0, count3= 0, count4= 0, count5= 0;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for(int i = 0; i<N;i++){
			num = sc.nextInt();
			if(num%2==0){
				count2++;
			}
			if(num%3==0){
				count3++;
			}
			if(num%4==0){
				count4++;
			}
			if(num%5==0){
				count5++;
			}
		}
		System.out.println(count2 + " Multiplo(s) de 2");
		System.out.println(count3 + " Multiplo(s) de 3");
		System.out.println(count4 + " Multiplo(s) de 4");
		System.out.println(count5 + " Multiplo(s) de 5");
		
	}

}
