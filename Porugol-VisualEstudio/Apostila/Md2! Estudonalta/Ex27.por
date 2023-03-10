programa
{
	
	funcao inicio()
	{
		inteiro op,peso
		escreva("Qual e o seu poso na terra?: (KG): ")
		leia(peso)
		escreva("	Escolha um planeta	","\n")
		escreva("+++++++++++++++++++++++++++++++++\n")
		escreva("	1-Mercurio\n")
		escreva("	2-Venus\n")
		escreva("	3-Marte\n")
		escreva("	4-Juptire\n")
		escreva("	5-Saturno\n")
		escreva("	6-Urano\n")
		escreva("	7-Netuno\n")
		escreva("	8-Plutao\n")
		escreva("+++++++++++++++++++++++++++++++++\n")
		escreva("  Digite uma opção => ")
		leia(op)
		escreva("+++++++++++++++++++++++++++++++++\n")
		escolha (op) {
			caso 1:
			escreva("No planeta Mercurio seu peso seria ",peso*0.37,"Kg")
			pare
			caso 2:
			escreva("No planeta Venus seu peso seria ",peso*0.88,"Kg")
			pare 
			caso 3:
			escreva("No planeta Marte seu peso seria ",peso*0.38,"Kg")
			pare
			caso 4:
			escreva("No planeta Jupiter seu peso seria ",peso*2.64,"Kg")
			pare
			caso 5:
			escreva("No planeta Saturno seu peso seria ",peso*1.15,"Kg")
			pare
			caso 6:
			escreva("No planeta Urano seu peso seria ",peso*1.17,"Kg")
			pare
			caso 7:
			escreva("No planeta Netuno seu peso seria ",peso*1.18,"Kg")
			pare
			caso 8:
			escreva("No planeta Plutão seu peso seria ",peso*0.11,"Kg")
			pare
			caso contrario:
			escreva("Erro")
			pare
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 51; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {op, 6, 10, 2}-{peso, 6, 14, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */