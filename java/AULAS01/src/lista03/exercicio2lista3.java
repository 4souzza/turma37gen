package lista03;

	import java.util.Scanner;

	public class exercicio2lista3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int num=0,par=0,impar=0;
		
	for(int x=0; x<10;x++) {
		System.out.print("Digite um n�mero: ");
		num= scan.nextInt();
		
		if(num%2==0) {
				par++;
		}
		else {
			impar++;
			}
		
		}
		System.out.printf("S�o pares %d e s�o impares %d ", par, impar);
			
			
	}

}
