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
public class Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade1,idade2;
        
        Scanner num = new Scanner (System.in);
        
        System.out.println("Digite a primeira idade: ");
        idade1= num.nextInt();
        
        System.out.println("Digite a segunda idade: ");
        idade2= num.nextInt();
        
        System.out.println("A soma de ambas sao: "+(idade1+idade2));
    }
    
}
