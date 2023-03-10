programa
{
	inclua biblioteca Calendario -->c
	funcao inicio()
	{
		inteiro ano
		escreva("Em que ano voce nacseu? Ano:")
		leia (ano)
		se(c.ano_atual()-ano>=18){escreva("Sua idade atuale é: ",c.ano_atual()-ano,"\n")
							 escreva("Espero sinseramente que voce tenha se alistado")	
							}
							 senao{escreva("Voce ainda nao pode se alistar")
								 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 80; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */