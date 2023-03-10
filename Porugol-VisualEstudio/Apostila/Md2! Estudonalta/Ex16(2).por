programa
{
	inclua biblioteca Calendario-->c
	funcao inicio()
	{
		inteiro ano,ali
		escreva("Olá ! Em que ano voce nacseu ?: ")
		leia(ano)
		ali=c.ano_atual()-ano
		escreva("\n-------------Resultado------------\n")
		escreva("Sua idade atual é: ",ali,"\n")
		se(ali<18){escreva("Vc nao pode se alistar.")} senao{se(ali>18)escreva("Voce deveria ter se alistado")
														senao{escreva("Voce tem que alistar esse ano")}}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {ali, 6, 14, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */