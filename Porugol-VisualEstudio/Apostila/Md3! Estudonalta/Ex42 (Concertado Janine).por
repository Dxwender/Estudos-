programa
{
	
	funcao inicio()
	{
	
		inteiro cont=1,sal=0,cont_m=0,cont_f=0,soma=0,media=0,contsal_f=0,maiorsalm=0,menorsalm=0
		cadeia conf="",nome="",sx=""
		enquanto(verdadeiro){
			escreva("Digite o nome: ")
			leia(nome)
			escreva("Digite o Sexo [M/F]: ")
			leia(sx)
			escreva("Digite o seu salario R$: ")
			leia(sal)
			escreva("Quer continuar? [S/N]: ")
			leia(conf)
			escreva("===========================\n")
			se(sx=="M" ou sx=="m"){
				cont_m++
				soma+=sal
				media=soma/cont_m
					se(sal>maiorsalm){
						maiorsalm=sal
					}
					se(menorsalm==0){
						menorsalm=sal
					} senao{
						se(sal<menorsalm){
							menorsalm=sal
						}
					}					
			}senao se (sx=="F" ou sx=="f"){
				se(sal>=1000){
					contsal_f++
				}
				cont_f++
			}
			se(conf=="N" ou conf=="n"){
				pare	
			}
			cont++
		}
		escreva("Total de pessoas cadastradas: ",cont,"\n")
		escreva("Total de homens cadastrados: ",cont_m,"\n")
		escreva("Total de mulheres cadastradas: ",cont_f,"\n")
		escreva("A media salarial dos homens sao: R$:",media,"\n")
		escreva("Total de mulheres que ganhao mais de R$1000 são: ",contsal_f,"\n")
		escreva("O menor salario dos homens cadastrados: ",menorsalm,"\n")
		escreva("O maior salario dos homens cadastrados: ",maiorsalm,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 498; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {maiorsalm, 7, 68, 9}-{menorsalm, 7, 80, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */