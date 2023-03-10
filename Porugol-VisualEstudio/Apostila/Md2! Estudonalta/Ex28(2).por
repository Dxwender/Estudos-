programa
{
	
	funcao inicio()
	{
		real pre
		inteiro op
		escreva("Olá digite o preço do produto: ")
		leia(pre)
		escreva("====================================\n")
		escreva("========Reajustador de preços=======\n")
		escreva("====================================\n")
		escreva("1-\tCarnaval\t\t[+10%]\n")
		escreva("2-\tFerias escolares\t[+20%]\n")
		escreva("3-\tDias das Crianças\t[+5%]\n")
		escreva("4-\tBlack Friday\t\t[-30%]\n")
		escreva("5-\tNatal\t\t\t[-5%]\n")
		escreva("====================================\n")
		escreva("Digite uma opçao: ")
		leia(op)
		escreva("====================================\n")
		escolha(op){
			caso 1:
			escreva("No Carnaval o preço aumenta para : ",pre+(pre*0.1))
			pare
			caso 2:
			escreva("Nas Ferias escolares o preço aumenta para : ",pre+(pre*0.2)) 
			pare
			caso 3: 
			escreva("No Dia das Crianças o preço aumenta para : ",pre+(pre*0.05))
			pare
			caso 4: 
			escreva("Na Black Fraude o preço diminui para : ",pre-(pre*0.3))
			pare
			caso 5: 
			escreva("No Natal o preço diminui para : ",pre-(pre*0.05))
			pare
			caso contrario:
			escreva ("erro") 
			pare
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1055; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */