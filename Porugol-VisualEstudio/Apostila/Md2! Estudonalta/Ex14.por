programa
{
	
	funcao inicio()
	{
		real val
		escreva("Olá qual e o seu valor em compras: R$")
		leia(val)
		escreva("==========================================","\n")
		
		se (val>=500){escreva("Voce comprou R$",val," na nossa loja. Obrigado!!!","\n")
				    escreva("++++++++Atenção++++++++","\n")
				    escreva("Por fazer mais de R$500, voce vai receber ",val*0.1," de desconto","\n")
				    escreva("E vai pagar R$",val-(val*0.1)," volte sempre")
				    }senao{
						  escreva("Voce comprou R$",val," na nossa loja! Obrigado!") 
					      } 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 427; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */