programa
{
	
	funcao inicio()
	{
		para (inteiro i=0; i<3; i++){
			para(inteiro j=0; j<3; j++){
				escreva( "Digite o valor para a linha ", i, " e coluna ", j, ":")
				leia(X[i] [j])
				soma+=X[i] [j]
				se (i==j){
					somaPrincipal+=X[i] [j]
				}
				}
				
		}
		escreva( "A soma dos valores da diagonal principal é: ", somaPrincipal, "\n")
				escreva( "A soma dos valores da matriz é: ", soma, "\n")1
		
	}
}


	
	/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */