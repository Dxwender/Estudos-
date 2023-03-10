programa
{
	
	funcao inicio()
	{
		real n1,n2
		caracter op


		escreva("================================\n")
		escreva("	    Tabuada\n")
		escreva("================================\n")
		escreva("+-Adiçao\n")
		escreva("--Subtraçao\n")
		escreva("*-Multiplicaçao\n")
		escreva("/-Divizao\n")
		escreva("================================\n")
		escreva("Olá escolha um operçao: ")
		leia(op)
		escreva("================================\n")
		escolha(op){
			caso '1':
				op='+'
			pare
			caso '2':
				op='-'
			pare
			caso '3':
				op='*'
			pare
			caso '4':
				op='/'
			pare
			caso contrario:
				op='+'
			pare
			}
			escreva("Voce escolheu ",op,"\n")
		escolha(op){
			caso '+':
				escreva("Voce escolheu Adiçao:\n")
				escreva("================================\n")
				escreva("Digite o primeiro numero: ")
				leia(n1)
				escreva("Digite o segundo numero: ")
				leia(n2)
				escreva("Realizando a soma do numero ",n1," e ",n2,"\n")
				escreva("==============Processando============\n")
				escreva("O resultado da soma é: ",n1+n2)
			pare
			caso '-':
				escreva("Voce escolheu Subtraçao\n")
				escreva("================================\n")
				escreva("Digite o primeiro numero: ")
				leia(n1)
				escreva("Digite o segundo numero: ")
				leia(n2)
				escreva("Realizando a subtraçao do numero ",n1," e ",n2,"\n")
				escreva("==============Processando============\n")
				escreva("O resultado da subtraçao é: ",n1-n2)
			pare
			caso '*':
				escreva("Voce escolheu Multiplicaçao\n")
				escreva("================================\n")
				escreva("Digite o primeiro numero: ")
				leia(n1)
				escreva("Digite o segundo numero: ")
				leia(n2)
				escreva("Realizando a multiplicaçao do numero ",n1," e ",n2,"\n")
				escreva("==============Processando============\n")
				escreva("O resultado da multiplicaçao é: ",n1*n2)
			pare
			caso '/':
				escreva("Voce escolheu Divizao\n")
				escreva("================================\n")
				escreva("Digite o primeiro numero: ")
				leia(n1)
				escreva("Digite o segundo numero: ")
				leia(n2)
				escreva("Realizando a divizao do numero ",n1," e ",n2,"\n")
				escreva("==============Processando============\n")
				escreva("O resultado da divizao é: ",n1/n2)
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
 * @POSICAO-CURSOR = 609; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */