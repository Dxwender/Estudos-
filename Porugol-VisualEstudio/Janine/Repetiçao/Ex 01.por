programa
{
	
	funcao inicio()
	{
		inteiro cont=0,id,id1=0,id2=0,id3=0,id4=0,id5=0
		enquanto(cont<=15
		){
			escreva("Digite usa idade")
			leia(id)
			se(id<=15){
					id1++
				}senao se (id>=16 e id<=30){
									id2++
						}senao se (id>=31 e id<=45) {
											id3++
							}senao se(id>=46 e id<=60){
												id4++
									} senao{
												id5++
									}
		cont++
		}
		escreva("menor 15: ", id1,"\n")
		escreva("de 16 a 30: ", id2,"\n")
		escreva("de 31 a 45: ", id3,"\n")
		escreva("de 45 a 60: ", id4,"\n")
		escreva("acima de  60: ", id5,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {cont, 6, 10, 4}-{id, 6, 17, 2}-{id1, 6, 20, 3}-{id2, 6, 26, 3}-{id3, 6, 32, 3}-{id4, 6, 38, 3}-{id5, 6, 44, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */