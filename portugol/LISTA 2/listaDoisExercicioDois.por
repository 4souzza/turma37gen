
programa
 
 {
	funcao inicio()
	{
	cadeia codigo
	inteiro horaExtra
	inteiro salarioNormal
	inteiro salarioExtra
	inteiro horas
	
	escreva("Codigo do Funcionare:  ")
	leia (codigo)
	escreva("escreva o total de horas trabalhou:  ")
	leia (horas)
	

	horaExtra= horas-50

	salarioExtra= horas*20
	salarioNormal =horas*10

	se(horaExtra>0.1){
		escreva( " Você trabalhou ", horaExtra, " e recebera R$", salarioExtra, " a mais no seu salario") 
	}
	senao se (horaExtra<=0){
		escreva("Funcionario de codigo  ", codigo, "recebera salario padrão  ")
		}
	}
 }
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 542; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */