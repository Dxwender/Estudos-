programa
{
	inclua biblioteca Calendario -->c
	
	funcao inicio()
	{
		inteiro ano
		escreva("Em que ano voce nasceu? Ano:")
		leia (ano)
		se(c.ano_atual()-ano>=65){escreva("Voce tem:",ano,"correto? seja bem vindo!!\n")
							 escreva("===ATENÇAO ! DIRIGA-SE AO CAIXA PREFERENCIAL!!===")
							 }senao{
								  escreva("Voce tem:",ano," correto? Seja bem vindo!!\n")
								  }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */