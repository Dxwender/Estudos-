programa
{
	
	funcao inicio()
	{
		inteiro cand=0,cand1=0,cand2=0,cand3=0,cand4=0,nulo=0,branco=0,cont=0
		
		enquanto (cand!=7){
			escreva("Eleição\n")
			escreva("1- candidato numero 1\n")
			escreva("2- candidato numero 2\n")
			escreva("3- candidato numero 3\n")
			escreva("4- candidato numero 4\n")
			escreva("5- Branco\n")
			escreva("6- Nulo\n")
			escreva("7- Apuração\n")
			escreva("====================\n")
			escreva("Seu voto: ")
			leia(cand)
			escreva("====================\n")
			se(cand==1){
				cand1++
			}
			se(cand==2){
				cand2++
			}
			se(cand==3){
				cand3++
			}
			se(cand==4){
				cand4++
			}
			se(cand==5){
				branco++
			}
			se(cand==6){
				nulo++
			}	
		}
		escreva("Votos canditato 1: ",cand1,"\n")
		escreva("Votos canditato 2: ",cand2,"\n")
		escreva("Votos canditato 3: ",cand3,"\n")
		escreva("Votos canditato 4: ",cand4,"\n")
		escreva("Votos em Branco: ",branco,"\n")
		escreva("Votos em Nulo: ",nulo,"\n")
		escreva("Percentual de votos nulos: ",((cand1+cand2+cand3+cand4)*0.1-(nulo*0.1)),"\n")
		escreva("Percentual de votos em branco: ",(cand1+cand2+cand3+cand4)*0.1-(branco*0.1))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 694; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */