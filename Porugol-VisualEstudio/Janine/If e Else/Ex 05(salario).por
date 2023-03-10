programa
{
	inclua biblioteca Matematica -->m
	funcao inicio()
	{
		real val_h,qtd_h,sal_b,sal_l,sind,inss,fgts,ir,desc
		escreva("Olá digite o valor de suas horas trabalhadas: ")
		leia(val_h)
		escreva("Agora digite quantidade de horas trabalhadas: ")
		leia(qtd_h)
		
		sal_b=val_h*qtd_h
		sind=sal_b*0.03
		inss=sal_b*0.1
		fgts=sal_b*0.11
		ir=sal_b*0.05
		desc=inss+ir
		sal_l=sal_b-(sind+inss+ir)
		
		se (sal_b<=900){
				escreva("\nSalario bruto: ",m.arredondar(sal_b, 3))
				escreva("\nImposto de renda: Insento")
				escreva("\nSindicato: ",m.arredondar(sind, 3))
				escreva("\nInss: ",m.arredondar(inss, 3))
				escreva("\nFgts: ",m.arredondar(fgts, 3))
				escreva("\nTotal de desconto: ",m.arredondar(desc, 3))
				escreva("\nSalario liquido: ",m.arredondar(sal_l, 3))
		}senao se (sal_b>900 e sal_b<=1500){
					escreva("\nSalario bruto: ",m.arredondar(sal_b, 3))
					escreva("\nImposto de renda: ",m.arredondar(ir,3))
					escreva("\nSindicato: ",m.arredondar(sind,3))
					escreva("\nInss: ",m.arredondar(inss,3))
					escreva("\nFgts: ",m.arredondar(fgts, 3))
					escreva("\nTotal de desconto: ",m.arredondar(desc, 3))
					escreva("\nSalario liquido: ",m.arredondar(sal_l, 3))
		} senao { se (sal_b>1500 e sal_b<=2500){
							escreva("\nSalario bruto: ",m.arredondar(sal_b, 3))
							escreva("\nImposto de renda: ",m.arredondar(ir,3))
							escreva("\nSindicato: ",m.arredondar(sind,3))
							escreva("\nInss: ",m.arredondar(inss,3))
							escreva("\nFgts: ",m.arredondar(fgts, 3))
							escreva("\nTotal de desconto: ",m.arredondar(desc, 3))
							escreva("\nSalario liquido: ",m.arredondar(sal_l, 3))
			} senao{ 				escreva("\nSalario bruto: ",m.arredondar(sal_b, 3))
								escreva("\nImposto de renda: ",m.arredondar(ir,3))
								escreva("\nSindicato: ",m.arredondar(sind,3))
								escreva("\nInss: ",m.arredondar(inss,3))
								escreva("\nFgts: ",m.arredondar(fgts, 3))
								escreva("\nTotal de desconto: ",m.arredondar(desc, 3))
								escreva("\nSalario liquido: ",m.arredondar(sal_l, 3))
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */