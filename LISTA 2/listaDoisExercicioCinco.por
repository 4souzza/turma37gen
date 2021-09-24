programa
{
	
	funcao inicio()
	{
	real indice
	escreva("Digite o indice de poluição atual: ")
	leia(indice)

	se(indice<=0.29){ 
		escreva("indice aceitavel ")
		}
	senao se (indice<=0.4){ 
		escreva("GRUPO 1 - PAREM SUAS ATIVIDADES")
		
	}
	senao se (indice<0.5) {
	escreva(" GRUPO 1 - GRUPO 2 PAREM SUAS ATIVIDADES")
		}
		senao {
			escreva(" GRUPO 1 - GRUPO 2 - GRUPO 3 PAREM SUAS ATIVIDADES")
		}
	}
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 187; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */