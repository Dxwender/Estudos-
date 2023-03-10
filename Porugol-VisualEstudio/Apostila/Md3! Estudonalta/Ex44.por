programa
{
	inclua biblioteca Util-->u
	funcao inicio()
	{
		inteiro num=0,cont=0,cont_num=0,soma=0,maior=0,menor=0,cont_5=0
		caracter cond
		faca{
			num=u.sorteia(0, 10)
			cont++
			escreva("O ",cont,"º numero sorteado foi ",num,"\n")
			cont_num++
			soma+=num
			se(cont_num==1){
				maior=num
				menor=num
			}senao{
				se(num>maior){
				   maior=num	
				}
				se(num<menor){
				   menor=num
				}
			}
			se(num==5){
				cont_5++
			}
			escreva("Quer continuar? [s/n]: ")
			leia(cond)
		}enquanto(cond=='S' ou cond=='s')
		escreva("Voce me fez sortear ",cont_num," valores.\n")
		escreva("A soma dos valores foi ",soma,".\n")
		escreva("O maior valor foi ",maior," o menor valor foi ",menor,"\n")
		escreva("O valor 5 foi repitido ",cont_5," vezes.\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {cont, 6, 16, 4}-{cont_num, 6, 23, 8}-{soma, 6, 34, 4}-{cont_5, 6, 57, 6}-{maior, 6, 41, 5}-{menor, 6, 49, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */