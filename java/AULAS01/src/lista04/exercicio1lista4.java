package lista04;
import java.util.Locale;
import java.util.Scanner;


public class exercicio1lista4 {

		
		
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double pontuacao[]= new double [5];
		int x=0;
		double maiorPontuacao=0.00;
		
		for(x=0; x<5; x++) {
			
			System.out.print("Digite o valor:  ");
			pontuacao[x]=leia.nextDouble();
			
		}
		for(x =0; x<5; x++) {
			System.out.print("Numero"+(x+1)+ "-" +pontuacao[x]+ "\n");
			if(pontuacao[x]>maiorPontuacao) {
				maiorPontuacao=pontuacao[x];
			}
		}
		System.out.println();
	}
	
}
