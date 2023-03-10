programa
{
	
	funcao inicio()
	{
		inteiro n,c=1,par=0,impar=0

		enquanto(c<=5){
			escreva("Digite o ",c,"º valor")
			leia(n)
			se(n&2==0){
					par+=n
					escreva(par)
					}senao{
						impar+=n
						escreva(impar)
						 }
		c++
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */