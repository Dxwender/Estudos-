programa
{
	
	funcao inicio()
	{
		inteiro idade=0,cont=1, menor_m=0,maior_m=0,  menor_f=0,maior_f=0 ,  contf=0,contm=0
		cadeia nome,    velho_m="",novo_m="",    velho_f="",novo_f=""
		caracter sx
		enquanto (cont<=2){
			escreva("------------------\n")
			escreva(cont,"ª Pessoa\n")
			escreva("NOME: ")
			leia(nome)
			escreva("SEXO: [M/F]")
			leia(sx)
			escreva("IDADE: ")
			leia(idade)
			se(sx=='M'ou sx=='m'){
				contm++
				se(idade>maior_m){
						velho_m=nome
						maior_m=idade
					}
					se(menor_m==0){
						novo_m=nome
						menor_m=idade
					} senao{
						se(idade<menor_m){
							novo_m=nome
							menor_m=idade
						}
					}
			}senao se(sx=='F' ou sx=='f'){
				contf++
				se(idade>maior_f){
						velho_f=nome
						maior_f=idade
					}
					se(menor_f==0){
						novo_f=nome
						menor_f=idade
						
					} senao{
						se(idade<menor_f){
							novo_f=nome
							menor_f=idade
						}
					}
				}
		cont++	
		}
		escreva("------------------\n")
		escreva("O homem mais jovem e ",novo_m," e tem a idade de ",menor_m,"\n")
		escreva("O homem mais velho e ",velho_m," e tem a idade de ",maior_m,"\n")
		escreva("A mulher mais jovem e ",novo_f," e tem a idade de ",menor_f,"\n")
		escreva("A mulher mais velha e ",velho_f," e tem a idade de ",maior_f,"\n")
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 983; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */