programa
{
	inclua biblioteca Matematica-->m
	funcao inicio()
	{
		inteiro peso,op
		
		escreva("Olá qual é o seu peso? (KG):")
		leia(peso)
		escreva("===============================\n")
		escreva("Escolha o planeta\n")
		escreva("===============================\n")
		escreva("1-Mercúrio\n")
		escreva("2-Vênus\n")
		escreva("3-Marte\n")
		escreva("4-Júpiter\n")
		escreva("5-Saturno\n")
		escreva("6-Urano\n")
		escreva("7-Netuno\n")
		escreva("8-Plutão\n")
		escreva("===============================\n")
		escreva("Digite a opçao: ")
		leia(op)
		escreva("===============================\n")
		escolha (op){
			caso 1:
				escreva("No planeta Mercurio ")
				escreva("o seu peso seria:",peso*0.37)
			pare
			caso 2:
				escreva("No planeta Venus ")
				escreva("o seu peso seria:",peso*0.88)
			pare 
			caso 3:
				escreva("No planeta Marte ")
				escreva("o seu peso seria:",peso*0.38)
			pare
			caso 4:
				escreva("No planeta Jupiter ")
				escreva("o seu peso seria:",peso*2.64)
			pare
			caso 5:
				escreva("No planeta Saturno ")
				escreva("o seu peso seria:",peso*1.15)
			pare
			caso 6:
				escreva("No planeta Urano ")
				escreva("o seu peso seria:",peso*1.17)
			pare
			caso 7:
				escreva("No planeta Netuno ")
				escreva("o seu peso seria:",peso*1.18)
			pare
			caso 8:
				escreva("No planeta Plutao ")
				escreva("o seu peso seria:",peso*0.06)
			pare
			caso contrario:
				escreva("Fora do sistema solar")
			pare
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */