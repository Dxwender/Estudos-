programa
{
	
	funcao inicio()
	{
		real pre
		inteiro op
		escreva("Digite o preço de um protudo: R$:\n")
		leia(pre)
		escreva("Escolha um protudo\n")
		escreva("======================\n")
		escreva("1-Ferias [+10%]\n")
		escreva("2-Ferias escolares [+20%]\n")
		escreva("3-Dias das crianças [+5%]\n")
		escreva("4-Black fralude [-30%]\n")
		escreva("5-Natal [-5%]\n")
		escreva("======================\n")
		escreva("Digite uma opção1=> ")
		leia(op)
		escreva("======================\n")
		escolha (op){
		caso 1:
		escreva("Na epoca de Ferias o prouto vai para ",pre+(pre*0.1))
		pare
		caso 2:
		escreva("Na epoca de Ferias escolares o prouto vai para ",pre+(pre*0.2))
		pare
		caso 3:
		escreva("Na epoca de Dia das crianças o prouto vai para ",pre+(pre*0.05))
		pare
		caso 4:
		escreva("Na epoca de Ferias o prouto vai para ",pre-(pre/0.3))
		pare
		caso 5:
		escreva("Na epoca de Ferias o prouto vai para ",pre-(pre/0.05))
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
 * @POSICAO-CURSOR = 990; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */