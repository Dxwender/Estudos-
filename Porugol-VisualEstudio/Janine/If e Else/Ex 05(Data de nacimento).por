programa
{
	
	funcao inicio()
	{	
		inteiro dia,mes,ano
		escreva("Olá Digite o dia do seu aniversaio: ")
		leia(dia)
		escreva("Olá Digite o mes do seu aniversaio: ")
		leia(mes)
		escreva("Olá Digite o ano do seu aniversaio: ")
		leia(ano)
		se(dia<31 e mes<12 e ano<2022){
			escreva("Sua data de nacimento é ","Dia: ",dia," Mes: ",mes," Ano: ",ano )
			}senao {escreva("invalido")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */