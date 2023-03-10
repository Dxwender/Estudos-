programa
{
	inclua biblioteca Texto -->T	
	funcao inicio()
	{
		cadeia  n
		escreva("Olá ! Qual cidade voce mora? ")
		leia(n)
		escreva("-----Analisando-----\n")
		escreva("Voce mora na cidade : ",T.caixa_alta(n),"\n")
		escreva("A primeira letra é:",T.obter_caracter(n,0),"\n")
		escreva("E contem ",T.numero_caracteres(n)," caracteres.")
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 274; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */