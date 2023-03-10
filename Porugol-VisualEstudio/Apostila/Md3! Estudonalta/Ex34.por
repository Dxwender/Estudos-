programa
{
	
	funcao inicio()
	{
		inteiro cont=0,cont2=1,num=0,par_cont=0,impar_cont=0,som_par=0,som_impar=0,tot_par=0,tot_impar=0
		enquanto(cont<=4){
			escreva("Digite o :",cont2,"º valor: ")
			leia(num)
			se(num%2==0){
				par_cont++
				som_par=som_par+num
				tot_par=som_par/par_cont
				
			}senao se(num%2==1){
				impar_cont++
				som_impar=som_impar+num
				tot_impar=som_impar/impar_cont
				 
			}
		cont2++
		cont++	
		}
	escreva("Voce digitou :",par_cont," numeros pares e a media e: ",tot_par,"\n")
	escreva("Voce digitou :",impar_cont," numeros impares e a media e: ",tot_impar)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 407; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */