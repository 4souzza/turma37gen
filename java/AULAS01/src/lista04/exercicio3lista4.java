package lista04;
import java.util.Scanner;
import java.util.Locale;
public class exercicio3lista4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int matrizA [][] = new int [4][6];
		int matrizB [][] = new int [4][6];
		int matrizC [][] = new int [4][6];
		int matrizD [][] = new int [4][6];
		int linha=0, coluna=0;
		
		
		
		
		System.out.println("Matriz A");
		for(linha=0; linha<4;linha++) {
			System.out.println();
			for(coluna=0;coluna<6;coluna++) {
				System.out.print(matrizA[linha][coluna]+ "\t");
				
			
				
			}
	}
		System.out.println("Matriz B");
		for(linha=0; linha<4;linha++) {
			System.out.println();
			for(coluna=0;coluna<6;coluna++) {
				System.out.print(matrizB[linha][coluna]+ "\t");
}
}