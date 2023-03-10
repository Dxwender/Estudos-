programa
{
	inclua biblioteca Texto -->t
	funcao inicio()
	{
		cadeia cid
		escreva("Em qual cidade você mora? ")
		leia(cid)
		escreva("--------ANALISANDO-------\n")
		escreva("Voce mora na cidade de ",t.caixa_alta(cid),"\n")
		escreva("A primeira letra é: ",t.obter_caracter(cid,0),"\n")
		escreva("E contem ",t.numero_caracteres(cid)," caracteres.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 114; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */