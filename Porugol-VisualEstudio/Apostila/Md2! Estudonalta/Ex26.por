programa
{
	
	funcao inicio()
	{	
		inteiro num
		real n1,n2
		escreva("\n===================\n")
		escreva("      1 Adiçao      \n")
		escreva("      2 Subtraçao      \n")
		escreva("      3 Multiplicaçao      \n")
		escreva("      4 Diviçao      ")
		escreva("\n===================")
		escreva("\nDigite a sua opção => :")
		leia(num)
		escolha(num){
			caso 1:
			escreva("Voce escolheu a operaçao [+]")
			escreva("\n===================\n")
			escreva("Digite o PRIMEIRO numero: ")
			leia(n1)
			escreva("Digite o SEGUNDO numero: ")
			leia(n2)
			escreva("===================\n")
			escreva("\nCalculando o valor de ",n1," e ",n2,"\n")
			escreva("O resultado da adição e:",n1+n2)
			escreva("\n=========================\n")
			escreva("	Volte sempre		")
			pare
			caso 2:
			escreva("Voce escolheu a operaçao [-]")
			escreva("\n===================\n")
			escreva("Digite o PRIMEIRO numero: ")
			leia(n1)
			escreva("Digite o SEGUNDO numero: ")
			leia(n2)
			escreva("===================\n")
			escreva("\nCalculando o valor de ",n1," e ",n2,"\n")
			escreva("O resultado da Subtração e:",n1-n2)
			escreva("\n=========================\n")
			escreva("	Volte sempre		")
			pare
			caso 3:
			escreva("Voce escolheu a operaçao [*]")
			escreva("\n===================\n")
			escreva("Digite o PRIMEIRO numero: ")
			leia(n1)
			escreva("Digite o SEGUNDO numero: ")
			leia(n2)
			escreva("===================\n")
			escreva("\nCalculando o valor de ",n1," e ",n2,"\n")
			escreva("O resultado da multiplicação e:",n1*n2)
			escreva("\n=========================\n")
			escreva("	Volte sempre		")
			pare
			caso 4:
			escreva("Voce escolheu a operaçao [/]")
			escreva("\n===================\n")
			escreva("Digite o PRIMEIRO numero: ")
			leia(n1)
			escreva("Digite o SEGUNDO numero: ")
			leia(n2)
			escreva("===================\n")
			escreva("\nCalculando o valor de ",n1," e ",n2,"\n")
			escreva("O resultado da divizão e:",n1/n2)
			escreva("\n=========================\n")
			escreva("	Volte sempre		")
			pare
			caso contrario:
			escreva("Error")
			pare
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 65; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */