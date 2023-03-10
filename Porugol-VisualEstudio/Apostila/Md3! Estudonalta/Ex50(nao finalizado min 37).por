programa
{
	
	funcao inicio()
	{
		inteiro x,num_ini,y,num_fim
		escreva ("Inicial:")
		leia (num_ini)
		escreva("Final")
		leia(num_fim)
		para(x=1;x<=10;x++){
			escreva(num_ini,"x",x,"=",x*num_fim,"\n")
			para(y=1;y==x;y++){
				//escreva(num_ini,"x",y,"=",y*num_fim,"\n")
				//escreva("==\n")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */