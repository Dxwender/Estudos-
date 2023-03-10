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
public class Ex_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1=0,n2=0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o numerador");
        n1= num.nextInt();
        System.out.println("Digite o denominador ");
        n2= num.nextInt();
        if (n2==0){
            System.out.println("O denominador e invalido");
        }else {
            System.out.println("O valor da  divisao e: "+(n1/n2));
        }
    }
    
}
