programa
{
	inclua biblioteca Util-->u
	funcao inicio()
	{
		inteiro ini,fim,int
		escreva ("Inicio:")
		leia (ini)
		escreva("Fim: ")
		leia(fim)
		escreva("Passo: ")
		leia(int)
		se(ini>fim){
			
			para(ini;ini>=fim;ini=ini){
				
				ini=ini-int
				se(ini<fim){
				pare
				}
			escreva(ini,"...")
			}	
		}		
		senao{
			para (ini;ini<=fim;ini=ini){
				ini=ini+int
				se(ini>fim){ 
				pare	
				}
			escreva(ini,"...")	
				}
			}
		escreva("Acabou")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 179; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */