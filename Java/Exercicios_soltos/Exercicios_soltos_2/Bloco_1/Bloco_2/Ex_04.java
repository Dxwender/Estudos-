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
public class Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        Scanner n = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        a = n.nextInt();
        System.out.println("Digite o valor de B: ");
        b= n.nextInt();

        System.out.println("O valor de A e: "+a);
        System.out.println("O valor de B e: "+b);
        c=a;
        a=b;
        b=c;
        
        System.out.println("O novo valor de A e: "+a);
        System.out.println("O novo valor de B e: "+b);
    }
    
}
