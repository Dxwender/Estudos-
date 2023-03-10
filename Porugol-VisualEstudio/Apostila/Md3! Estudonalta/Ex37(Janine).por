programa
{
	
	funcao inicio()
	{
		real idade=0,cont=0,maior=0,menor=0
		cadeia nome , velho="", novo=""
		enquanto(cont<=2){
			escreva("=============\n")
			escreva("Digite nome: ")
			leia(nome)
			escreva("Digite sua idade: ")
			leia(idade)
				se (idade>maior){
					velho=nome
					maior=idade
				}
				se (menor==0){
					menor=idade
				}senao{
					se(idade<menor){
						novo=nome
						menor=idade
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
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */