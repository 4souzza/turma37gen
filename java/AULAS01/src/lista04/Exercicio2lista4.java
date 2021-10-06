package lista04;

import java.util.Random;
public class Exercicio2lista4 {
	
	public static void main(String[] args) {
		Random gerador = new Random();
		
		int[] lancamentos = new int[10];
		double media = 0.00;
		int maiorValor = 0;
		int soma= 0;
		int quantasVezesMaiorValor=0;
		
		for(int x = 0; x<10; x++) {
			int valorDoDado = gerador.nextInt(6) + 1;
			
			System.out.println("Lançamento"+ (x+1)+ "=" + valorDoDado);
			lancamentos[x] = valorDoDado;
			soma = (soma + lancamentos[x]);
			
			if (lancamentos[x] >= maiorValor) {
				if (lancamentos[x] == maiorValor) { 
					quantasVezesMaiorValor++;
				}
					else if (lancamentos[x] > maiorValor) {
						quantasVezesMaiorValor = 1;
						
				}
					maiorValor = lancamentos[x];
	}
			
		}
		media = soma/ 10.00;
		System.out.println("\nMedia: "+ media);
		System.out.println("\n Maior Valor"+ maiorValor);
		System.out.println("\n O maior valor aparece"+ quantasVezesMaiorValor);
	}
}
