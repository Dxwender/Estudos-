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
public class Ex_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anoat,anonasc;
        Scanner num = new Scanner(System.in);
        
        System.out.println("Digite o ano atual: ");
        anoat= num.nextInt();
        System.out.println("Digite o seu ano de nascimento: ");
        anonasc= num.nextInt();
        
        System.out.println("Sua idade e: "+(anoat-anonasc));
        
    }
    
}
