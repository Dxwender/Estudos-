programa
{
	
	funcao inicio()
	{
		real ang1,ang2,ang3
		escreva("Olá digite o priemro angulo")
		leia(ang1)
		escreva("Olá digite o segundo angulo")
		leia(ang2)
		escreva("Olá digite o terceiro angulo")
		leia(ang3)
		se (ang1==90 ou ang2==90 ou ang3==90){
			escreva("Retângulo")
		} senao se(ang1>90 ou ang2>90 ou ang3>90){
					escreva("Obtusângulo:")
		}senao{escreva("Acutângulo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */