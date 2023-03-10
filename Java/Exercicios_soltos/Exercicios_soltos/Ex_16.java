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
public class Ex_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float prod,desc;
       Scanner num = new Scanner (System.in);
       
        System.out.println("Digite o valor do produto: ");
        prod =num.nextFloat();
        System.out.println("Digite o valor do desconto: (%)");
        desc=num.nextFloat();
        
        System.out.println("O novo valor e: ");
        System.out.println(prod-(prod*(desc/100)));
    }
    
}
