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
public class Ex_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num;
        Scanner med = new Scanner (System.in);
        
        System.out.println("Digite em quilometros: ");
        num= med.nextFloat();
        
        System.out.println(num+"Km em M sao: "+(num*1000));
    }
    
}
