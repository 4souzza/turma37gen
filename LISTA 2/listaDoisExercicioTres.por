programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real valor1, valor2, valor3, valor4
		escreva("Digite o valor de 1: ")
		leia(valor1)
		escreva("Digite o valor de 2: ")
		leia(valor2)
		escreva("Digite o valor de 3: ")
		leia(valor3)
		escreva("Digite o valor de 4: ")
		leia(valor4)

		valor1=mat.potencia(valor1,2)
		valor2=mat.potencia(valor2,2)
		valor3=mat.potencia(valor3,2)
		valor4=mat.potencia(valor4,2)
		se(valor3>=1000){
			escreva("O valor do terceiro valor é: ",valor3)
			
		}
		senao {
			escreva("\n o quadrado do primeiro é ", valor1)
			escreva("\n o quadrado do segundo é ", valor2)
			escreva("\n o quadrado do terceiro é ", valor3)
			escreva("\n o valor quadrado do quarto é ", valor4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */