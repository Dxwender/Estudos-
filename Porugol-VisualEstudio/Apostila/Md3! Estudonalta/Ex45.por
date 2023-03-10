programa
{
	inclua biblioteca Util-->u
	funcao inicio()
	{
		inteiro num,sort,cont=1,cont_chan=0
		escreva("Vou pensar em numero de 1 a 10\n")
		escreva("Voce tem 3 chances para acertar\n")
		escreva("==================================\n")
		sort=u.sorteia(0,10)
		faca{
		cont++
		cont_chan++
		escreva("Chance ",cont_chan,"/3. Em que numero eu penser? N:")
		leia(num)
		se(num<sort){
			escreva("Chute um numero maior.\n")
		}senao{
			se(num>sort){
				escreva("Chute um numero menor.\n")
			} senao{
				se(num==sort){
				escreva("====================================\n")
				escreva("Voce acertou em: ",cont_chan," tentativas! :D\n")
				pare 
				 }
				
				}
			}	
		}enquanto(cont<=3)
		escreva("====================================\n")
		escreva("Voce errou todas as tentativas.:(\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 636; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {sort, 6, 14, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */