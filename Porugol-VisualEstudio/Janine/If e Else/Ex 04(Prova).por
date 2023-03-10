programa
{
	
	funcao inicio()
	{
		inteiro cont_acert=0,cont_erro=0
		cadeia resp=""
		escreva("Prova:\n")
		escreva("========================================\n")
		escreva("1-Qual o item que aumenta o tamanho dos personagens no unvirso de Mario?\n")
		escreva("A-Cogumelo Vermelho\n","B-Flor\n","C-Folha\n","D-Pena\n")
		escreva("Digite a sua resposta:")
		leia(resp)
		se(resp=="A" ou resp=="a"){
			cont_acert++
		}senao{
			cont_erro++
		}
		escreva("========================================\n")
		escreva("2-Que especie de animal Sonic pertence?\n")
		escreva("A-Porco\n","B-Gato\n","C-Ouriço\n","D-Canguru\n")
		escreva("Digite a sua resposta:")
		leia(resp)
		se(resp=="C" ou resp=="c"){
			cont_acert++
		}senao{
			cont_erro++
		}
		escreva("========================================\n")
		escreva("3-Qual empresa e a mais antiga nos ramo de consoles?\n")
		escreva("A-Microsoft\n","B-Nintendo\n","C-Sony\n","D-Sega\n")
		escreva("Digite a sua resposta:")
		leia(resp)
		se(resp=="B" ou resp=="b"){
			cont_acert++
		}senao{
			cont_erro++
		}
		escreva("========================================\n")
		escreva("4-Qual o ano de lançamento do primeiro Xbox\n")
		escreva("A-2003\n","B-2000\n","C-2002\n","D-2001\n")
		escreva("Digite a sua resposta:")
		leia(resp)
		se(resp=="D" ou resp=="d"){
			cont_acert++
		}senao{
			cont_erro++
		}
		escreva("========================================\n")
		escreva("5-Qual primeiro DualShock a ter sensor de movimento?\n")
		escreva("A-4\n","B-2\n","C-1\n","D-3\n")
		escreva("Digite a sua resposta:")
		leia(resp)
		se(resp=="C" ou resp=="c"){
			cont_acert++
		}senao{
			cont_erro++
		}
		escreva("===================Resultado=====================\n")
		escreva("Voce acertou: ",cont_acert,"\n",
			   "Voce errou: a",cont_erro,"\n",
			   "Seu percentual de acertos foram: ",cont_acert/5,"%\n",
			   "Seu percentual de erros foram: ",cont_erro/5,"%\n")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1896; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */