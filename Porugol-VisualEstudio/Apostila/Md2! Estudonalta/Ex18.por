programa
{
	
	funcao inicio()
	{
		real dist
		escreva("Infome a distancia total da viagem, em KM: ")
		leia(dist)
		se(dist>=200){escreva("Uma viagem de: ",dist,"Km vai custar R$ 0,35/Km. O valor total e:",dist*0.35)
					}senao{escreva("Uma viagem de: ",dist,"Km vai custar R$ 0,5/Km. O valor total e:",dist*0.50)}
	}				
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */