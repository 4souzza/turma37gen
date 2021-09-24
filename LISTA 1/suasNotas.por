programa
{ 	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
	real suasNotas, notaUm, notaDois, notaTres
		
		escreva("digite o valor da primeira nota: ")
		leia(notaUm)
		escreva("digite o valor da segunda nota")
		leia(notaDois)
		escreva("digite o valor da terceira nota")
		leia(notaTres)
		suasNotas= ((notaUm*2)+(notaDois*3)+(notaTres))/(2+3+5)

		suasNotas= mat.arredondar(suasNotas,2)

	escreva("valor final é: " + suasNotas)
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */