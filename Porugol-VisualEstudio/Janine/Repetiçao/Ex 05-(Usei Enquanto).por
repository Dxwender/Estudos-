programa
{
	
	funcao inicio()
	{
		real cod=0,qtd=0,som_CQ=0,som_Ham=0,som_Che=0,som_Ref=0,tot=0
		cadeia op_cp=""
		escreva("=======================Menu==========================\n")
		escreva("Produto===============Codigo====================Preço\n")
		escreva("Cachorro quente========100=====================R$1,20\n")
		escreva("Hamburguér=============103=====================R$1,20\n")
		escreva("Cheeseburguer==========104=====================R$1,30\n")
		escreva("Refrigerante===========105=====================R$1,00\n")
		escreva("=====================================================\n")
		escreva("Digite: S-para comesar o pedido. \n \tN-Fechar o pedido.\n \tOpção: ")
			   leia(op_cp)
		escreva("=====================================================\n")
		enquanto(op_cp=="S" ou op_cp=="s"){
				escreva("=====================================================\n")
				escreva("Digite o codigo de pedido: ")
				leia(cod)
				
			se(cod==100){
				escreva("=====================================================\n")
				escreva("Qual quantidade de Cachorros quentes? :")
				leia(qtd)
				som_CQ=qtd*1.20
			}
			se(cod==103){
				escreva("=====================================================\n")
				escreva("Qual quantidade de Hamburguér's :")
				leia(qtd)
				som_Ham=qtd*1.20
			}
			se(cod==104){
				escreva("=====================================================\n")
				escreva("Qual quantidade de Cheeseburguer's :")
				leia(qtd)
				som_Che=qtd*1.30
			}
			se(cod==105){
				escreva("=====================================================\n")
				escreva("Qual quantidade de Refrigerantes :")
				leia(qtd)
				som_Ref=qtd*1
			}
			escreva("Digite: S-para continuar o pedido. \n \tN-Fechar o pedido.\n \tOpção: ")
			leia(op_cp)
		
		}
		tot=som_CQ+som_Ham+som_Che+som_Ref
		escreva("=======================Valor total========================\n")
		escreva("Valor de Cachorro quente :R$",som_CQ,"\n")
		escreva("Valor de Hamburguers :R$",som_CQ,"\n")
		escreva("Valor de Cheasecake :R$",som_Che,"\n")
		escreva("Valor de Refrigerante :R$",som_Ref,"\n")
		escreva("Valor total :R$",tot,"\n")
		escreva("============================================================\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */