programa
{
	
	funcao inicio()
	{
		real valor[5], pontuacao=0

		para( inteiro y=0; y<5; y++){
			escreva("Digite um valor: ")
			leia(valor[y])
			se(pontuacao<valor[y]){
				pontuacao=valor[y]
			}
		}

		para (inteiro y=0; y<5; y++){
			escreva (valor[y] + "\n")		
			
			}
			escreva("o maior numero é: " + pontuacao)	
		}
	}

	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 499; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */