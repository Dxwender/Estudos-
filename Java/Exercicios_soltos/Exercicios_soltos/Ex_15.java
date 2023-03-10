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
public class Ex_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float alu,reaj;
      Scanner num = new Scanner(System.in);
      
        System.out.println("Digite o valor do aluguel: ");
        alu= num.nextFloat();
        System.out.println("Valor do reajusto (%): ");
        reaj= num.nextFloat();
        
        System.out.println("O valor do reajuste e: "+(alu+(alu*(reaj/100)))); 
    }
    
}
