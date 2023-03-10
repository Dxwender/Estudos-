/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_repeticao;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_05_duvida_numero_com_virgula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int cod=0,qtd=0,som_CQ=0,som_Ham=0,som_Che=0,som_Ref=0,tot=0;
            String op_cp;
            
            Scanner op= new Scanner(System.in);
            Scanner codigo= new Scanner (System.in);
            Scanner quantidade= new Scanner (System.in);
            
                System.out.println("=======================Menu==========================\n");
		System.out.println("Produto===============Codigo====================Preco\n");
		System.out.println("Cachorro quente========100=====================R$1,20\n");
		System.out.println("Hamburguér=============103=====================R$1,20\n");
		System.out.println("Cheeseburguer==========104=====================R$1,30\n");
		System.out.println("Refrigerante===========105=====================R$1,00\n");
		System.out.println("=====================================================\n");
		System.out.println("Digite: S-para comesar o pedido. \n \tN-Fechar o pedido.\n \tOpcao: ");
                op_cp= op.nextLine();
                
                
                System.out.println("=====================================================\n");
		while ("S".equals(op_cp) || "s".equals(op_cp)){
				System.out.println("=====================================================\n");
				System.out.println("Digite o codigo de pedido: ");
				cod=codigo.nextInt();
				
			if(cod==100){
				System.out.println("=====================================================\n");
				System.out.println("Qual quantidade de Cachorros quentes? :");
				qtd=quantidade.nextInt();
				som_CQ = qtd*(100/120);
			}
			if(cod==103){
                    	System.out.println("=====================================================\n");
			System.out.println("Qual quantidade de Hamburguér's? :");
			qtd=quantidade.nextInt();
                 	som_Ham=qtd*(100/120);
			}
			if(cod==104){
                    	System.out.println("=====================================================\n");
			System.out.println("Qual quantidade de Cheeseburguer's? :");
			qtd=quantidade.nextInt();
			som_Che=qtd*(100/130);
			}
			if(cod==105){
                        System.out.println("=====================================================\n");
			System.out.println("Qual quantidade de Refrigerantes? :");
			qtd=quantidade.nextInt();
                        som_Ref=qtd*1;
			}
			System.out.println("Digite: S-para continuar o pedido. \n \tN-Fechar o pedido.\n \tOpção: ");
			op_cp= op.nextLine();
		
		}
		tot=som_CQ+som_Ham+som_Che+som_Ref;
		System.out.println("=======================Valor total========================\n");
		System.out.println("Valor de Cachorro quente :R$"+som_CQ+"\n");
		System.out.println("Valor de Hamburguers :R$"+som_CQ+"\n");
		System.out.println("Valor de Cheasecake :R$"+som_Che+"\n");
		System.out.println("Valor de Refrigerante :R$"+som_Ref+"\n");
		System.out.println("Valor total :R$"+tot+"\n");
		System.out.println("============================================================\n");
                
            }
    }