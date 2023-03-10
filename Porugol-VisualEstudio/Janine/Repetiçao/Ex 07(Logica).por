programa
{
	
	funcao inicio()
	{
		inteiro num1,num2,num3,cont=0
		enquanto(cont<=0){
			escreva("Digite o primeiro numero: \n")
			leia(num1)
			escreva("Digite o segundo numero: \n")
			leia(num2)
			escreva("Digite o terceiro numero: \n")
			leia(num3)
			se(num1<num2 e num2<num3){
				escreva(num1,num2,num3)
				}senao se(num3<num2 e num2<num1){
					escreva(num3,num2,num1)
					}senao{
						escreva(num3,num1,num2)
			}
		cont++	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */