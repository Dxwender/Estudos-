/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float fim_pla,val_ven,ipva=0;
        String vei;
        Scanner n= new Scanner (System.in);
        Scanner txt= new Scanner (System.in);
        System.out.println("Digite M para moto ou C para carro");
        vei= n.nextLine();
        if("C".equals(vei)|| "c".equals(vei)){
            System.out.println("Digite o valor do ultimo digito da sua placa do carro:");
            fim_pla= n.nextFloat();
            System.out.println("Digite o valor venal do carro: ");
            val_ven =n.nextFloat();
            
            ipva=(val_ven*3)/100;
            
            if(fim_pla==0){
                System.out.println("Voce tem ate 30/04/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla==1){
                System.out.println("Voce tem ate 31/05/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla==2){
                System.out.println("Voce tem ate 30/06/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla==3){
                System.out.println("Voce tem ate 30/07/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla==4){
                System.out.println("Voce tem ate 30/08/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla==5){
                System.out.println("Voce tem ate 30/09/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla>=6 && fim_pla<=7){
                System.out.println("Voce tem ate 30/11/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla>=8 && fim_pla<=9){
                System.out.println("Voce tem ate 30/12/23 para pagar a quantia de : R$"+ipva);
            }
   
        }else if("M".equals(vei) || "m".equals(vei)){
            System.out.println("Digite o valor do ultimo digito da sua placa da moto:");
            fim_pla= n.nextFloat();
            System.out.println("Digite o valor venal da moto: ");
            val_ven =n.nextFloat();
            
            ipva=(val_ven*4)/100;
            
            if(fim_pla==0){
                System.out.println("Voce tem ate 30/04/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla==1){
                System.out.println("Voce tem ate 31/05/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla==2){
                System.out.println("Voce tem ate 30/06/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla==3){
                System.out.println("Voce tem ate 30/07/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla==4){
                System.out.println("Voce tem ate 30/08/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla==5){
                System.out.println("Voce tem ate 30/09/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla>=6 && fim_pla<=7){
                System.out.println("Voce tem ate 30/11/23 para pagar a quantia de : R$"+ipva);
            }else if (fim_pla>=8 && fim_pla<=9){
                System.out.println("Voce tem ate 30/12/23 para pagar a quantia de : R$"+ipva);
            }
            
        }else{
            System.out.println("Error");
        }
    }
    
}
