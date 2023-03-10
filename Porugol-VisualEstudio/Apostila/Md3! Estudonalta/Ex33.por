programa
{
	inclua biblioteca Util -->u
	funcao inicio()
	{
		inteiro c=1,n,s=u.sorteia(0,10)
		escreva("Olá! Quantos numeros voce quer que se sorteie: ")
			leia (n)
		enquanto(c<=n){
			escreva("\nO ",c,"º valor sorteado foi: ",s)
			s+=n
			c++
		}
		escreva("\n",s)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {c, 6, 10, 1}-{n, 6, 14, 1}-{s, 6, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */