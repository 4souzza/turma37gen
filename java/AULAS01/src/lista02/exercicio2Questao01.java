package lista02;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio2Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num[]=new int[3];
		for(int x=0;x<3;x++) {
			System.out.print("Digite o valor do "+(x+1)+"º número: ");
			num[x]=scan.nextInt();
		}
		Arrays.sort(num);
		System.out.print("Os números em ordem crescente são:");
		for(int x=0;x<3;x++) {
			System.out.print(" "+num[x]);
		}
	}

}
