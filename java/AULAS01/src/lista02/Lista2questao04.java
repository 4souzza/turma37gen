package lista02;

import java.util.Scanner;

public class Lista2questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double numero, resultado;
		
		System.out.printf("Digite um n�mero qualquer: ");
		numero = scan.nextDouble();
		
		if (numero%2 == 0 && numero != 0) {
			System.out.printf("O n�mero digitado � par.");
			resultado = Math.sqrt(numero);
			System.out.printf("\nA raiz quadrada do n�mero %.2f � %.2f",numero,resultado);
		}
		else if (numero%2 == 1) {
			System.out.printf("O n�mero digitado � impar.");
			resultado = Math.pow(numero,2);
			System.out.printf("\nO n��umero %.2f elevado ao quadrado � %.2f.",numero,resultado);
		}
		else if (numero == 0) {
			System.out.printf("o n�mero %.2f � nulo.", numero);
		}
	}

}
