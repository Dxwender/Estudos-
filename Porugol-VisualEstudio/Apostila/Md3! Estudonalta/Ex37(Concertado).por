programa
{
	
	funcao inicio()
	{
		inteiro idade=0,cont=1,maior=0,menor=0
		cadeia nome , velho="", novo=""
		enquanto(cont<=2){
			escreva("==============\n")
			escreva(cont,"ª PESSOA\n")
			escreva("==============\n")
			escreva("Nome: ")
			leia(nome)
			escreva("Idade: ")
			leia(idade)
			se(cont==1){
				menor=idade
				maior=idade
				velho=nome
				novo=nome
			}senao{
			  se(idade<menor){
				menor=idade  	
				novo=nome
			} 
			  se(idade>maior){
				maior=idade
				velho=nome
				}
			}
			
		cont++	
		}
		escreva("A pessoa mais jovem é: ",novo," ,que tem ",menor," de idade.\n")
		escreva("A pessoa mais velha é: ",velho," ,que tem ",maior," de idade.\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 499; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */