programa
{
	inclua biblioteca Matematica --> M
	funcao inicio()
	{
	
		cadeia nome
		real sal,aju,new
		
		escreva("Nome: ")
		leia(nome)
		escreva("Salario: R$")
		leia(sal)
		escreva("Reajuste: (%): ")
		leia(aju)

		escreva("----------Reajuste---------\n")
		escreva("O funcionario: ",nome," ganhava R$",sal,"\n")
		escreva("Depois de ganhar: ",aju,"% de almento,\n")
		new=sal*(aju/100)
		escreva("vai passar a ganhar ",M.arredondar(new,5)," a mais por mes.\n")
		escreva("Seu novo salario será de: R$",new+sal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 452; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */