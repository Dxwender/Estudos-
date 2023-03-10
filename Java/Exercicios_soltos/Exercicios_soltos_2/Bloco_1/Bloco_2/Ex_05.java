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
public class Ex_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double op,n1,n2;
        Scanner n= new Scanner (System.in);
        System.out.println("Digite 1.Adicao, 2.Subtracao, 3.Divisao, 4.Multiplicacao");
        op= n.nextInt();
        
        if(op==1){
            
            System.out.println("Soma");
            System.out.println("Digite o prieiro numero: ");
            n1= n.nextDouble();
            System.out.println("Digite o segundo numero: ");
            n2= n.nextDouble();
            System.out.println("O resustado da soma sera: "+(n1+n2));
            
        }else if(op==2){
            
            System.out.println("Subtacao");
            System.out.println("Digite o prieiro numero: ");
            n1= n.nextDouble();
            System.out.println("Digite o segundo numero: ");
            n2= n.nextDouble();
            System.out.println("O resustado da subtracao sera: "+(n1-n2));
            
        }else if(op==3){
            
            System.out.println("Divizao");
            System.out.println("Digite o prieiro numero: ");
            n1= n.nextDouble();
            System.out.println("Digite o segundo numero: ");
            n2= n.nextDouble();
            System.out.println("O resustado da divizao sera: "+(n1/n2));
            
        }else if(op==4){
            
            System.out.println("Multiplicacao");
            System.out.println("Digite o prieiro numero: ");
            n1= n.nextDouble();
            System.out.println("Digite o segundo numero: ");
            n2= n.nextDouble();
            System.out.println("O resustado da multiplicacao sera: "+(n1*n2));
            
        }else if(op<1 || op>4){
            System.out.println("Error");
        }
    }
    
}
