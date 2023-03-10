programa
{
	
	funcao inicio()
	{
		inteiro ini,fim,int
		escreva("Olá onde começa a contagem:")
		leia(ini)
		escreva("Onde terminca:")
		leia(fim)
		escreva("Defina o intervalo:")
		leia(int)
		escreva("Start-")
		enquanto (ini<=fim){
			ini=ini+int
			se(ini>fim){ pare	
			}
			escreva(ini,"-")
			
		}
		escreva("Game Over")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {ini, 6, 10, 3}-{fim, 6, 14, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */