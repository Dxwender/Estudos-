programa
{
	inclua biblioteca Matematica -->M
	funcao inicio()
	{
		real p,eco,res
		escreva("Qual e o preço do produto?: $")
		leia(p)
		escreva("__________________________________________\n\n")
		escreva("O produto custava $",p," e agora custará $",eco=p-(p*0.05),"com 5% de desconto.\n")
		res=p-eco
		escreva("Ao todo, teremos R$ ",M.arredondar(res,5)," de economia.\n\n")
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */