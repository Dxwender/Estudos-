programa
{
	inclua biblioteca Matematica-->M 
	funcao inicio()
	{	
		real comp
		escreva("Olá escreva o valor da sua Compra: ")
		leia(comp)
		se(comp>=500){escreva("Voce comprou ",comp," nessa loja. Obrigado!") 
				    escreva("\n=======Atenção=======")
				    escreva("\nPor fazer mais de R$500,00 em compras,")
				    escreva("\nvoce vai receber: R$:",M.arredondar(comp*0.10,2)," de desconto.")
				    escreva("\nO valor a ser pago será: R$:",M.arredondar(comp-(comp*0.1),2))
				    }
					senao{
						escreva("Voce comprou R$:",comp," nessa loja  obrigado")}
			}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 567; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */