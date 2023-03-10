programa
{
	
	funcao inicio()
	{
		inteiro cont=0,vis=0,pra=0,cont_vist=0,tot_vist=0,cont_pra=0,tot_pra=0
		cadeia T
		
		enquanto (cont<=14){
			escreva("Digite V para transaçoes a vista ou P para transasonçoes a praso: ")
			leia(T)
			se (T=="V" ou T=="v"){
				escreva("Digite o Valor a Vista: ")
					leia(cont_vist)
				tot_vist=cont_vist+tot_vist
				vis++	
			}senao se (T=="P" ou T=="p"){
					escreva("Digite o Valor a Praso: ")
					leia(cont_pra)
				tot_pra=cont_pra+tot_pra
				pra++
			} senao {escreva("Error\n")}
		cont++	
		}
		escreva("\n O total do numero de compras a Vista são:", vis,"\n")
		escreva("\n O valor total de compras a Vista são:",tot_vist,"\n")
		escreva("\n O total do numero de compras a Praso são: ", pra,"\n")
		escreva("\n O valor total de compras a Praso são:",tot_pra,"\n")
		escreva("\n O total dos valores das compra a Praso ea Vista são: ",tot_pra+tot_vist )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 140; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */