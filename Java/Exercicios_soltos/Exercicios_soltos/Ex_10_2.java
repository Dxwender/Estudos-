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
public class Ex_10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota1=0,nota2=0,nota3=0,mp;
        int peso1=0,peso2=0,peso3=0;
        
        Scanner num = new Scanner (System.in);
        
        System.out.println("Digite a primeira nota: ");
        nota1= num.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2= num.nextFloat();
         System.out.println("Digite a terceira nota: ");
        nota3= num.nextFloat();
        System.out.println("Digite o seu  peso 1: ");
        peso1= num.nextInt();
        System.out.println("Digite o seu  peso 2: ");
        peso2= num.nextInt();
        System.out.println("Digite o seu  peso 3: ");
        peso3= num.nextInt();
        mp=(nota1*peso1+nota2*peso2+nota3*peso3)/(peso1+peso2+peso3);
        System.out.println("Mp e igual a "+mp);
    }
    
}
