programa
{
	
	funcao inicio()
	{
	inteiro num
	escreva("Digite um número :\n")
	leia(num)

	se(num == 0){
		escreva( num, " é um número neutro\n")
	}
	senao se (num % 2 ==1){
		escreva (num, " é um número impar.\n")
	}
	senao se (num % 2 ==0) {
			escreva(num, " é um número par\n")
	}
	senao{ escreva(" Informe um número positivo")
	}
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 134; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */