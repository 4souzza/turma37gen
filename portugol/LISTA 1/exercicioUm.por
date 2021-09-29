programa
{
	
	funcao inicio()
	{
	inteiro peso
	inteiro excesso
	inteiro multa
		escreva("Quantidade em KG ")
		leia (peso)
		excesso = peso-50
		multa= excesso*4
		se(excesso == 0){
			escreva("não há peso escedente\n")
			
		}
		senao se(excesso >0){
			escreva("tem ",  excesso, " quilos a mais, sua multa é de ",  multa,  " reais")
			
		}
		senao se (peso<0) {
			escreva(" peso invalido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */