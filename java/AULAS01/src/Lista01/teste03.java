package Lista01;
import java.util.Scanner;

public class teste03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		
		int segundosTotais;
		int segundos;
		int minutos;
		int horas;
		
		System.out.println("Quantos segundos o evento durou?");
		
		segundosTotais = leia.nextInt();
		
		horas = segundosTotais / 3600;
		minutos = (segundosTotais - horas*3600)/ 60;
		segundos = (segundosTotais % 60);
		
		System.out.printf("A quantidade de horas: %d : %d : %d", horas,minutos, segundos);

	}

}
