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
public class Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num;
        Scanner dig = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        num = dig.nextFloat();
        
        System.out.println("O seu sussesor e: "+(num+1));
        System.out.println("O seu antecessor e: "+(num-1));
    }
    
}
