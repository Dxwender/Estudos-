programa
{
	
	funcao inicio()
	{
		inteiro op=0,num1,num2
			escreva("\nOperador 1 :")
			leia(num1)
			escreva("Operador 2 :")
			leia(num2)
		enquanto (op!=6){
			se(op!=6){
			escreva("============Escolha uma operação==============")
			escreva("\n[1] Soma\n")
			escreva("[2] Subtração\n")
			escreva("[3] Multiplicaçao\n")
			escreva("[4] Divizao\n")
			escreva("[5] Novos dados\n")
			escreva("[6] Sair\n")
			escreva("		Sua opção: ")
			leia(op)
			se (op==1){
				escreva("\n--------------------------------------\n")
				escreva("Calculando: ",num1 ,"+", num2,"=",num1+num2,"\n")
				escreva("--------------------------------------\n")
			}
			se(op==2){
				escreva("\n--------------------------------------\n")
				escreva("Calculando: ",num1 ,"-", num2,"=",num1-num2,"\n")
				escreva("--------------------------------------\n")
			}
			se(op==3){
				escreva("\n--------------------------------------\n")
				escreva("Calculando: ",num1 ,"x", num2,"=",num1*num2,"\n")
				escreva("--------------------------------------\n")
			}
			se(op==4){
				escreva("\n--------------------------------------\n")
				escreva("Calculando: ",num1 ,"/", num2,"=",num1/num2,"\n")
				escreva("--------------------------------------\n")
			}
			se(op==5){
				escreva("\nOperador 1 :")
				leia(num1)
				escreva("Operador 2 :")
				leia(num2)
			}
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */