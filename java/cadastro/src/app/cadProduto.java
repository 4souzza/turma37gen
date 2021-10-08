package app;



import entities.pessoa;
import entities.produtos;


public class cadProduto {
	
	public static void main(String[] args) {
		
	        produtos p1 = new produtos();
	        pessoa pe1 = new pessoa();
	        
	        
	        pe1.anoNascimento = 1995;
	        pe1.email = "";
	        p1.nome="camisa";
	        p1.estoque= 10;
	        p1.valor=60.00;
	        p1.codigo="001";
	        
	        p1.tirarEstoque(2);
	        System.out.println(p1);
	        
	        p1.colocarEstoque(20);
	        System.out.println(p1);

		
	}

}
