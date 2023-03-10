programa
{
	
	funcao inicio()
	{
		real dist
		escreva("			Viaçao			\n")
		escreva("---------------------------------------------------------------")
		escreva("\nViagens até 200km:					R$0.50/KM")
		escreva("\nViagens acima de 200km:					R$0.35/KM\n")
		escreva("===============================================================\n")
		escreva("Informe a distancia total , em KM: ")
		leia(dist)
		escreva("========================Resultado==============================\n")
		se(dist<200){escreva("O valor total de uma viagem de ",dist,"Km vai custar R$0,50\n","VALOR TOTAL: ",dist*0.5)
						}senao{escreva("O valor total de uma viagem de ",dist,"Km vai custar R$0,35\n","VALOR TOTAL: ",dist*0.35)}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 476; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */