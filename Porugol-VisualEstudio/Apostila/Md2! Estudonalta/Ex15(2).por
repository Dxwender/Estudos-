programa
{	
	inclua biblioteca Matematica-->M
	inclua biblioteca Calendario-->C
	funcao inicio()
	{
		inteiro ano,res
		escreva("Digite o seu ano de nassimento: ")
		leia(ano)
		res=C.ano_atual()-ano
		escreva("Hoje em ",C.ano_atual()," voce tem ",res," certo?")
		escreva("\n===================\n")
		se(res>=65){escreva("Seja bem vindo(a) ao banco !\n")
				  escreva("======Dirija-se a fila preferncial babaca========")}
			senao{escreva("Seja bem vindo(a) ao banco !\n")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 358; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */