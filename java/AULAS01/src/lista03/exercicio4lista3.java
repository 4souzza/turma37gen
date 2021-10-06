package lista03;
import java.util.Scanner;
public class exercicio4lista3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int idade;
		char sexo;
		char opcao;
		int pessoasCalmas=0;
		int mulheresNervosas=0;
		int homensAgressivos=0;
		int outrosCalmos=0;
		int pessoasNervosasAcima40Anos=0;
		int pessoasCalmasMenos18Anos=0;
		char op= 'S';
		int contadorHabitantes = 1;
		
		while(op == 'S') {
			System.out.print("Digite a idade :");
			idade = leia.nextInt();
			System.out.print("Escolha\n1-feminino\n2-masculino\n3-Outros :");
			sexo = leia.nextInt().charAt(0);
			System.out.print("Escolha\n1-pessoas calma\n2-pessoa nervosa\n3-pessoa agressiva :");
			opcao = leia.nextInt().charAt(0);
			System.out.print("Continua? S/N ");
			op = leia.next().toUpperCase().charAt(0);
			contadorHabitantes++;
		}
		while (op=='S' && contadorHabitantes <=150) {
			System.out.println("Habitante numero"+contadorHabitantes);
			System.out.print("digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Ecolha\n1-Feminino\n2-Masculino\n3-Outros: ");
			
			}
		
	}

}
