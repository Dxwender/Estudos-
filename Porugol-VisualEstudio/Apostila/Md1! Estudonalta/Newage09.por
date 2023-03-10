programa
{
	
	funcao inicio()
	{
		real s,r
		cadeia n 
		escreva("Nome do funcionario: ")
		leia(n)
		escreva("Digite o seu salario : ")
		leia(s)
		escreva("Reajuste (%) : ")
		leia(r)
		escreva("-----Resultado-----\n")
		escreva(n," ganhava: $",s,"\n")
		escreva("depois do rajuste de: ",r,"% de aulmeto\n")
		escreva("vai passara ganhar: $",s+(s*r/100))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */