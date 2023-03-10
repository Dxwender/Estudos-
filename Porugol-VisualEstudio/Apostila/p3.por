programa
{
	funcao inicio()
	{
		inteiro i
		inteiro i2
		escreva("\nDigite i")
			leia(i)
		escreva("\nDigite i2")
			leia(i2)
		inteiro i3=i+i2
		inteiro i4=i-i2
		inteiro i5=i/i2
		inteiro i6=i*i2
		se (i3>5) { escreva ("\nResiltado soma=",i3,"\n|Condiçao=    Liberado") 	} 
			senao { escreva ("\nResiltado soma=",i3,"\n|Condiçao=Bloqueado  /")}
		se (i4>5) { escreva ("\nResiltado subtraçao=",i4,"\n|Condiçao=    Liberado") 	} 
			senao { escreva ("\nResiltado subtraçao=",i4,"\n|Condiçao=Bloqueado  /")}
		se (i5>5) { escreva ("\nResiltado divisao=",i5,"\n|Condiçao=    Liberado") 	} 
			senao { escreva ("\nResiltado divisao=",i5,"\n|Condiçao=Bloqueado  /")}
		se (i6>5){ escreva ("\nResiltado multiplicaçao=",i6,"\n|Condiçao=    Liberado") 	} 
			senao { escreva ("\nResiltado multiplicaçao=",i6,"\n|Condiçao=Bloqueado")}

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 775; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */