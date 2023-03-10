programa
{
	inclua biblioteca Util-->u
	funcao inicio()
	{
		inteiro sta,fim,int
		escreva("Olá! Digite o numero de inicio da contagem: ")
		leia(sta)
		escreva("Digite o numero do fim da contagem: ")
		leia (fim)
		escreva("Digite o numero de intervalo da contagem: ")
		leia(int)
		escreva("Start")
		enquanto(sta<=fim){
			sta=sta+int
			u.aguarde(2000)
			escreva(sta,"-")	
		}
		escreva("Game Over")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */