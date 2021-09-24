programa
{
	
	funcao inicio() {
		inteiro segundos, totalHoras, totalMinutos, totalSegundos
			escreva("Segundos: ")
			leia (segundos)
			totalHoras = segundos / 24
			totalMinutos = (segundos % 60) / 24
			totalSegundos = (segundos % 60) % 24
			escreva ("Você tem:", totalHoras,  " Horas ",  totalMinutos,  " Minutos ",  totalSegundos,  " segundos ") 
	
}



}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 170; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */