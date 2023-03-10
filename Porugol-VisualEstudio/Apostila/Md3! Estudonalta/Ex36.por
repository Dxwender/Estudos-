programa
{
	
	inclua biblioteca Util-->u
	funcao inicio()
	{

	 inteiro cont=0,num=0,cont_maior=0,cont_div=0,sort=1

	 escreva("Quantos numeros vou sortear: ")
	 leia(num)
	 escreva("Sorteando: " ,num)
	 
	 enquanto(cont<=num){
	 	u.aguarde(2000)
	 	sort=u.sorteia(0,num)
	 	escreva("...",sort)
	 		se(sort>5){
	 			cont_maior++
	 		}senao se(sort%3==0){
	 				cont_div++	
	 		}
	 cont++	
    }
    escreva("\n")
    escreva("Dos ",num," numeros sorteados.\n")
    escreva(cont_maior," sao numeros maiores que 5.\n")
    escreva(cont_div," sao numeros divisiveis por 3.\n")	
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 475; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */