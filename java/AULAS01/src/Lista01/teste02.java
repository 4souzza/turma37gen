package Lista01;
import java.util.Scanner;

public class teste02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		
        int dias; 
		int ano;
		
		System.out.println("Quantos dias voc� j� viveu?: ");
		
		dias = leia.nextInt();
		
		ano = dias / 365;
		
		
		System.out.printf("Voc� tem %d anos", ano);

	}

}
