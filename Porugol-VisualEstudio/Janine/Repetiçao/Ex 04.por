programa
{
	inclua biblioteca Matematica-->m
	funcao inicio()
	{
	inteiro cont=0,id=0,med_m=0,med_f=0,f=0,m=0,tot_f=0,tot_m=0
	cadeia s
		enquanto (cont<=3){
			escreva("Olá digite F para feminino e M para Masculino: ")
			leia(s)
			se (s=="F" ou s=="f"){
					escreva("Digite a  sua  idade: ")
					leia(id)
					med_f=med_f+id
					f++
					tot_f=med_f/f
				}senao se (s=="M" ou s=="m"){
						escreva("Digite a  sua  idade: ")
						leia(id)
						med_m=med_m+id
						m++	
						tot_m=med_m/m		
					} senao {
						escreva ("erro")
			}
			cont++
		}
		escreva("\nA media de idade do grupo e : ",((tot_f+tot_m)/(f+m)))
		escreva("\nA media de idade das mulheres e : ",tot_f)
		escreva("\nA media de idade dos homens e : ",tot_m)
		escreva("\nA menor idade informada foi : ",m.menor_numero(id,id))
		escreva("\nA maior idade informada foi : ",m.maior_numero(id,id))
		//so consegui fazer a menor idade :(
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 910; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */