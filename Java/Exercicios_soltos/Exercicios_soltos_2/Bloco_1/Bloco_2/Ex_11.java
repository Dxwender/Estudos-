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
public class Ex_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double op,pre;
        Scanner n = new Scanner (System.in);
        System.out.println("Digite o codigo do produto: ");
        op= n.nextInt();
         System.out.println("==============================");  
        while(op>=1 && op<=6){
            System.out.println("Tabela\n"+
                               "1 _ regiao norte com desconto de 5%\n" +
                               "2 _ regiao sul com desconto de 15%\n" +
                               "3 _ regiao sudeste com desconto de 7%\n" +
                               "4 _ regiao nordeste com desconto de 12%\n"+
                               "5 _ regiao centro-oeste com desconto de 20%\n"+
                               "6 _ regiao internacional.");
            System.out.println("==============================");
            System.out.println("Digite o valor do produto:");
            pre= n.nextInt();
            if(op==1){
               pre=pre+(pre*0.05); 
                System.out.println("O novo preso: "+pre);        
            }else if(op==2){
                pre=pre+(pre*1.5); 
                System.out.println("O novo preso: "+pre); 
            }else if(op==3){
                pre=pre+(pre*0.07); 
                System.out.println("O novo preso: "+pre); 
            }else if(op==4){
                pre=pre+(pre*1.2); 
                System.out.println("O novo preso: "+pre); 
            }else if(op==5){
                pre=pre+(pre*2.0); 
                System.out.println("O novo preso: "+pre); 
            }else{
                System.out.println("Produto internacional taxasao difente.");  
            }
        System.out.println("==============================");    
        System.out.println("Digite o codigo 0 para parar: ");
        op= n.nextInt();
        System.out.println("=============================="); 
        }
    }
}
