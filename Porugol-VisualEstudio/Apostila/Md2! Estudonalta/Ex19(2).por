programa
{
	
	funcao inicio()
	{
		real num
		escreva("Digite um numero: ")
		leia(num)
		se(num>0){escreva("O oposto do numero :",num," é ",1/num)}
							senao{
								se(num<0){escreva("O oposto do numero :",num," é ",(-1)*num)}
																			senao{escreva("O numero e nulo")}
																										}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */