programa
{
	funcao inicio()
	{

		inteiro a=5, b=8, c=10 , d=2
		
		logico k = (b<a*2) e (d<c-b)
				 (8<5*2) e (2<10-8)
				 (8<10)  e (2<2)
				 verdadeiro e falso 
				 falso		
				 		
		logico x = (a>b) ou nao (c%2==0)
				 (5>8) ou nao (10%2==0)
				 falso ou nao (0==0)
				 falso ou nao verdadeiro
				 falso ou falso
				 falso
		
		logico y = x ou nao (c<a+b/d)
				falso ou  (10<5+8/2)
				falso ou 	falso
				falso
				
		
		logico z = nao x e falso ou (d+a<=b+d)
				 nao falso e falso ou (2+5<=8+2)
				 nao falso e falso ou falso
				 verdadeiro e falso ou falso 
				 verdadeiro e falso 
				 falso
					
		
		k= falso, x=falso,y=falso , z=falso



		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */