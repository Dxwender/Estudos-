programa
{
	inclua biblioteca Tipos -->T 
	funcao inicio()
	{
		inteiro n,n2
		escreva("Digite um numero: ")
		leia(n)
		escreva("Digite outro numero: ")
		leia(n2)
		escreva("----------------------------\n")
		escreva("SOMA: ",n+n2,"\n")
		escreva("DIFERENÇA: ",n-n2,"\n")
		escreva("PRODUTO: ",n*n2,"\n")
		escreva("QUOCIENTE INTEIRO: ",n/n2,"\n")
		escreva("QUOCIENTE REAL: ",T.inteiro_para_real(n)/n2,"\n")
		escreva("RESTO DA DIVISAO: ",n%n2)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 409; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */