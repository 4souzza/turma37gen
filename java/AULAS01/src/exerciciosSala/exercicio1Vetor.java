package exerciciosSala;

import java.util.Locale;

import java.util.Scanner;

public class exercicio1Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		String codigoProduto[] = {"X01", "X02", "X03"};
		String nomeProduto[]= {"CAL�A", "CAMISA","SAIA"};
		int estoque[]= {20,20,20};
		double valorProduto[] = {100.50, 50.75, 70.99};
		
		//mostrando na tela
		
		System.out.println("LOJA DA TURMA 37");
		System.out.println();
		System.out.println("COD\tPRODUTO\tESTOQUE\tVALOR");
		for (int x=0; x<nomeProduto.length; x++) {	
			System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[x],nomeProduto[x],estoque[x],valorProduto[x]);
			
			}
		System.out.println();
		System.out.println("Digite o c�digo do produto que deseja comprar: ");
		
		

	}
}