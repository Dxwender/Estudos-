programa
{
	
	funcao inicio()
	{
		inteiro cont=0,cont2=1,num=0,cont_p=0,maiorimp=0,menorimp=0
		caracter conf
		faca{
			escreva("Digite o ",cont2,"º numero: ")
			leia(num)
			cont++
			cont2++
			se(num%2==0){
				cont_p++
			} senao {
			 se(cont==1){
			 	maiorimp=num
			 	menorimp=num
			 } senao{
				se(num>maiorimp){
				   maiorimp=num
				}
				se(num<menorimp){
				   menorimp=num
				}	 	
			 }
		  }	
			escreva("Quer continuar ?: [S/N] :")
			leia(conf)
		}enquanto(conf=='S' ou conf=='s')
		escreva("Voce digitou: ",cont," numero(s).\n")
		escreva("Voce digitou: ",cont_p," numero(s) pares.\n")
		escreva("O valor ",menorimp," foi o menor numero IMPAR digitado.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 607; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {maiorimp, 6, 40, 8}-{menorimp, 6, 51, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */