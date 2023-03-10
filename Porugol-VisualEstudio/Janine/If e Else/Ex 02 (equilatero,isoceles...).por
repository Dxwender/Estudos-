programa
{
	
	funcao inicio()
	{
		real L1,L2,L3
		escreva("Olá digite o primeiro lado do triangulo")
		leia(L1)
		escreva("Olá digite o segundo lado do triangulo")
		leia(L2)
		escreva("Olá digite o terceiro lado do triangulo")
		leia(L3)
		se(L1==L2 e L2==L3){
			escreva("Equilatero")
		} senao se(L1==L2 ou L2==L3){
			escreva("Isoceles")
		}senao{ escreva("Escaleno")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 364; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */