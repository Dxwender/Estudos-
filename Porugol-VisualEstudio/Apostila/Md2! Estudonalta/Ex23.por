programa
{
	inclua biblioteca Calendario -->c
	funcao inicio()
	{
		inteiro m_ano,ali
		escreva("Em que ano voce nasceu: Ano:")
		leia(m_ano)
		ali=c.ano_atual()-m_ano
		se(ali>18){escreva("Voce esta atrasado a: ",ali-18," anos(s)\n","Deveria ter se alistado em ",c.ano_atual()-(ali-18))}
		senao{se(ali==18){escreva("Voce completa 18 anos esse ano de ",c.ano_atual())
			 		  }senao{escreva("Voce ainda nao completou 18 anos. Vai acontecer em ",m_ano+18," anos(s)\n","Ainda faltam: ",((m_ano+18)-c.ano_atual())," ano(s)")
			 		  }	
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 528; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m_ano, 6, 10, 5}-{ali, 6, 16, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */