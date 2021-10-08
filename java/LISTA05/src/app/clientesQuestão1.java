package app;
import entities.Clientes;
import java.util.Scanner;

public class clientesQuestão1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clientes exemplo1 = new Clientes();
		Scanner leia = new Scanner(System.in);
		
		//ENTRADAS
		exemplo1.nome = "Lu";
		exemplo1.anoNascimento = 1996;
		exemplo1.cpf = 123456789;
		exemplo1.contato = 90908080;
		
		//SAIDA
		exemplo1.exibirNome();
		exemplo1.exibirIdade();
		exemplo1.exibirCpf();
		exemplo1.exibirContato();
		
		System.out.println("O cliente pagara como? digite 'D' para crédito 'C' ou 'E' para espécie: ");
		exemplo1.formaPagamento = leia.next().toUpperCase().charAt(0);
		exemplo1.exibirPagamento();		

	}

}
