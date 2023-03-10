/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos_2.Bloco_1.Bloco_2;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cod,qtd_CQ=0,qtd_BS=0,qtd_BO=0,qtd_HA=0,qtd_CH=0,qtd_RE=0;
        double pre_CQ=0,pre_BS=0,pre_BO=0,pre_HA=0,pre_CH=0,pre_RE=0;
        String cond;
        Scanner n= new Scanner(System.in);
        Scanner l= new Scanner(System.in);
        System.out.println("Voce deseja ver o cardapio? [S]-Sim/[N]-Nao");
        cond=l.nextLine();
        while("S".equals(cond) || "s".equals(cond)){
        System.out.println("================================================");    
        System.out.println("CARDAPIO:");
        System.out.println("  LANCHE                   CODIGO       VALOR\n" +
                            "Cachorro Quente             101          1,20\n" +
                            "Bauru Simples               102          1,30\n" +
                            "Bauru Com Ovo               103          1,50\n" +
                            "Hamburger                   104          1,20\n" +
                            "Cheeseburger                105          1,30\n" +
                            "Refrigerante                106          1,00");
        System.out.println("================================================");
        System.out.println("Digite o codigo: ");
        cod=n.nextInt();
            if(cod==101){
                System.out.println("================================================");
                System.out.println("Voce escolheu Cachorro Quente.");
                System.out.println("================================================");
                System.out.println("Digite a quantidade: ");
                qtd_CQ=n.nextInt();
                System.out.println("================================================");
                pre_CQ= qtd_CQ*1.20;
                
            }else if(cod==102){
                System.out.println("================================================");
                System.out.println("Voce escolheu Bauru Simples.");
                System.out.println("================================================");
                System.out.println("Digite a quantidade: ");
                qtd_BS=n.nextInt();
                System.out.println("================================================");
                pre_BS= qtd_BS*1.30;
                
            }else if(cod==103){
                System.out.println("================================================");
                System.out.println("Voce escolheu Bauru Com Ovo.");
                System.out.println("================================================");
                System.out.println("Digite a quantidade: ");
                qtd_BO=n.nextInt();
                System.out.println("================================================");
                pre_BO= qtd_BO*1.50;
                
            }else if(cod==104){
                System.out.println("================================================");
                System.out.println("Voce escolheu Hamburger.");
                System.out.println("================================================");
                System.out.println("Digite a quantidade: ");
                qtd_HA=n.nextInt();
                System.out.println("================================================");
                pre_HA= qtd_HA*1.20;
                
            }else if(cod==105){
                System.out.println("================================================");
                System.out.println("Voce escolheu Cheeseburger.");
                System.out.println("================================================");
                System.out.println("Digite a quantidade: ");
                qtd_CH=n.nextInt();
                System.out.println("================================================");
                pre_CH= qtd_CH*1.30;
                
            }else if(cod==106){
                System.out.println("================================================");
                System.out.println("Voce escolheu Refrigerante.");
                System.out.println("================================================");
                System.out.println("Digite a quantidade: ");
                qtd_RE=n.nextInt();
                System.out.println("================================================");
                pre_RE= qtd_RE*1;
                
            }else{
                System.out.println("================================================");
                System.out.println("Error");
                System.out.println("================================================");
            }
        System.out.println("Voce deseja continuar o pedido?? [S]-Sim/[N]-Nao");
        cond=l.nextLine();    
        }
        System.out.println("================================================");
        System.out.println("Do cardapio voce peidiu: ");
        System.out.println("  LANCHE                   CODIGO       VALOR  QTD  VALOR" );
        System.out.println(                    "Cachorro Quente             101          1,20 X "+qtd_CQ+" = "+pre_CQ);
        System.out.println(                    "Bauru Simples               102          1,30 X "+qtd_BS+" = "+pre_BS);
        System.out.println(                    "Bauru Com Ovo               103          1,50 X "+qtd_BO+" = "+pre_BO);
        System.out.println(                    "Hamburger                   104          1,20 X "+qtd_HA+" = "+pre_HA);
        System.out.println(                    "Cheeseburger                105          1,30 X "+qtd_CH+" = "+pre_CH);
        System.out.println(                    "Refrigerante                106          1,00 X "+qtd_RE+" = "+pre_RE);
        System.out.println("================================================");
        System.out.println("Total: R$"+(pre_CQ+pre_BS+pre_BO+pre_HA+pre_CH+pre_RE));
    }   
}
