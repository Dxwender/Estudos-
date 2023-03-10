/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos_2.Bloco_1;

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
        float med;
        Scanner n = new Scanner (System.in);
        System.out.println("Digite em metros");
        med= n.nextFloat();
        System.out.println("A medida em centimetro sera "+(med*100));
        
    }
    
}
