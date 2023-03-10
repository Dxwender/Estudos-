programa
{
	
	funcao inicio()
	{
	inteiro cont=1,pes_cad=1,peso_ref=0,peso_pes=0,cont_f=0,cont_m=0
	caracter sexo
	
	escreva("Quantas pessoas serao cadastradas: ")
	leia(pes_cad)
	escreva("Qual e o peso de ferencia: ")
	leia(peso_ref)

	enquanto(cont<=pes_cad){
		escreva("===================================\n")
		escreva("Pessoa ",cont," de ",pes_cad, "\n")
		escreva("Digite seu peso: ")
		leia(peso_pes)
		escreva("Digite seu sexo: ")
		leia(sexo)
		se(sexo=='F'ou sexo=='f'e peso_pes>=peso_ref){
			 escreva("PESO ACIMA DO LIMITE DE (",peso_ref,")kg\n")
			 cont_f++
		} senao se(sexo=='M'ou sexo=='m' e peso_pes>=peso_ref){
			 escreva("PESO ACIMA DO LIMITE DE (",peso_ref,")kg\n")
			 cont_m++
		}senao{
			escreva("PESO DENTRO DO LIMITE DE (",peso_ref,")kg\n")
		}		
		cont++
		}
		escreva("===================================\n")
		escreva("Ao todo, temos ",cont_m+cont_f," pessoas acima do limite de ",peso_ref,"\n")
		escreva("E dessas pessoas, ",cont_m," sao Homens e ,",cont_f," sao mulheres.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 841; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */