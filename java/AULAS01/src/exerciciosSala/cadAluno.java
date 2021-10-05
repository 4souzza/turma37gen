package exerciciosSala;

import java.util.Scanner;

public class cadAluno {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		String nome[] = new String[4];
		int nota[] = {0,0,0,0};
		char disciplinaNota
		String disciplina[]= {"MATEMATICA", "PORTUGUES","CIENCIAS", "ARTES"};
		
		
		for(int x=0; x<4; x++) {
			
			System.out.print("DIGITE NOME DO ALUNO:  ");
			nome[x] = leia.next();
			
		}
		
		
		

	}

}
