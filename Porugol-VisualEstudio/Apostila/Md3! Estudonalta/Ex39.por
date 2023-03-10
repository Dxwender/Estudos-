programa
{
	inclua biblioteca Matematica-->m
	funcao inicio()
	{
		inteiro numero=0,cont=0,soma=0,media=0,cont2=0
		enquanto (numero!=9999){
			cont2++
			escreva ("=========================\n")
			escreva (cont2,"º Valor [9999 to stop] : ")
			leia(numero)
			se(numero!=9999){
				cont++
				
				soma=soma+numero
				media=soma/cont
				
			}
			
		}
		escreva("==========Flag Digitado===========\n")
		escreva("Ao todo voce digitou ",cont," valores.\n")
		escreva("A soma entre eles foi ",soma,"\n")
		escreva("E a media entre eles foi ",media,"\n")
		escreva("O maior numero informado foi ",m.maior_numero(numero,numero))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 239; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */