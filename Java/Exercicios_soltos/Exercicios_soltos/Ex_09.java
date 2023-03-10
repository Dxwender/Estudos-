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
public class Ex_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float cont=0,op,la=0,ba=0,ma=0;
        String conf;
        Scanner txt = new Scanner(System.in);
        Scanner num= new Scanner(System.in);
        
        System.out.println("Menu em unidade");
        System.out.println("1-Laranja - R$ 1");
        System.out.println("2-Banana - R$ 2");
        System.out.println("3-Maca - R$ 3");
        
        System.out.println("Para comecar digite S");
        conf= txt.nextLine();
        do{
            System.out.println("Digite uma opcao: ");
            op = num.nextInt();
            if(op==1){
                System.out.println("Digite a quantidade de laranjas: ");
                la= num.nextInt();
            }else if(op==2){
                System.out.println("Digite a quantidade de bananas:");
                ba= num.nextInt();
            }else if(op==3){
                System.out.println("Digite a quantidade de maca's: ");
                ma= num.nextInt();
            }else{
                System.out.println("Error");
            }
        System.out.println("Para continuar digite S");
        conf= txt.nextLine();   
       
        }while("S".equals(conf) || "s".equals(conf));
        System.out.println("Voce comprou: ");
        System.out.println(la+" laranjas e vai pagar :R$ "+(la)+" reais.");
        System.out.println(ba+" bananas e vai pagar :R$ "+(ba*2)+" reais.");
        System.out.println(ma+" macas e vai pagar :R$ "+(ma*3)+" reais.");
        
    }
    
}
