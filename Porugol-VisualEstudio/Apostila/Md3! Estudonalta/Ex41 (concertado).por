programa
{
	
	funcao inicio()
	{
		inteiro cont=0,idade=0,soma=0,ma_idade=0,me_idade=0
		cadeia nome="",velho="",novo=""
		 enquanto (verdadeiro){
		 	escreva("========Novo Amigo=========\n")
		 	escreva("-!Acabou! para parar.- \n")
			escreva("Nome: ")
			leia(nome)
			se(nome=="ACABOU" ou nome=="acabou"){
			pare
			}
			escreva("Idade: ")
			leia(idade)
			soma+=idade
			se(cont==0){
				ma_idade=idade
				me_idade=idade
				velho=nome
				novo=nome
				
			} senao{
				se(idade<me_idade){
				me_idade=idade
				novo=nome
			}
			se(idade>ma_idade){
				ma_idade=idade
				velho=nome
				}
			}
			cont++
		}
		escreva("Total de amigos cadastrados: ",cont,"\n")
		escreva("Seu amigo mais velho é ",velho," ,com ",ma_idade," anos.\n")
		escreva("Seu amigo mais novo é ",novo," ,com ",me_idade," anos.\n")
		escreva("A media de idade é: ",soma/cont)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 146; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */