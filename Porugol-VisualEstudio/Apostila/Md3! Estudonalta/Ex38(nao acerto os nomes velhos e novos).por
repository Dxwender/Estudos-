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
			escreva("SEXO [M/F]: ")
			leia(sx)
			escreva("IDADE: ")
			leia(idade)
			se(sx=='M'ou sx=='m'){
				contm++
				se(cont==1){
					menor_m=idade
					maior_m=idade
					novo_m=nome
					velho_m=nome
				}senao{
				se(idade<menor_m)
					   menor_m=idade
					   novo_m=nome
					}
				se(idade>maior_m){
					   maior_m=idade
					   velho_m=nome
					}
			}senao se(sx=='F' ou sx=='f'){
				contf++
				se(cont==1){
						maior_f=idade
						menor_f=idade
					     novo_f=nome
					     velho_f=nome
					}senao{
				se(idade<menor_f)
					   menor_f=idade
					   novo_f=nome
						}
				se(idade>maior_f){
					   maior_f=idade
					   velho_f=nome
					}
				}
		cont++	
		}
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
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {idade, 6, 10, 5}-{menor_f, 6, 48, 7}-{maior_f, 6, 58, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */