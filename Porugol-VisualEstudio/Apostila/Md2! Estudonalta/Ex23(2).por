programa
{
	inclua biblioteca Calendario-->c
	funcao inicio()
	{
		inteiro ano,ida
		escreva("Olá digite o seu ano de nacimento: ")
		leia(ano)
		ida=c.ano_atual()-ano
		escreva("============================================\n")
		escreva("Estamos no ano de ",c.ano_atual()," e voce tem ",ida," anos de idade.\n")
		escreva("============================================\n")
		se(ida>18){escreva("Voce deveria ter se alistado em ",ano+18, "\nVoce esta atrasado ",c.ano_atual()-(ano+18)," ano(s)")}
			senao{se(ida<18){(escreva("Estamos em ",c.ano_atual()," e voce tem ",c.ano_atual()-ano," de idade.\n"
									   ,"Voce  ainda  nao completou 18 anos e isso vai acontecer em ",ano+18,
										 "\nAinda faltam(m) ",(ano+18)-c.ano_atual()," ano(s)."))}
										   senao{escreva("Estamos em: ",c.ano_atual()," e vc tem 18 anos de idade\n",
										     "Voce completa 18 anos de idade em ",c.ano_atual()," corra.")}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 604; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */