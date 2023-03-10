programa
{
	
	funcao inicio()
	{
		real num,num2
		escreva("Olá digite o primeiro numero: ")
		leia(num)
		escreva("Olá digite o segundo numero: ")
		leia(num2)
		se(num<num2){escreva(num," e ",num2)}
									senao{se(num>num2){escreva(num2," e ",num)}
																		senao{escreva("Iguais")}				
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 302; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */