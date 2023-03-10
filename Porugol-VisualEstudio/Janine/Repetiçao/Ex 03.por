programa
{
	
	funcao inicio()
	{
		real idade,altura,peso,cont=0,cont_peso=0,tot_idade=0
		enquanto (cont<=24){
			escreva("\n")
			escreva("Digite sua idade: ")
			leia(idade)
			escreva("Digite sua altura: ")
			leia(altura)
			escreva("Digite seu peso: ")
			leia(peso)
				se(peso>90){
					cont_peso++
				}
		tot_idade=idade+tot_idade
		cont++	
		}
		escreva("\n")
		escreva("A quantidade de pessoas com mais de 90kg: ",cont_peso,"\n")
		escreva("A media de idade é: ",tot_idade/251)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 93; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {idade, 6, 7, 5}-{tot_idade, 6, 44, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */