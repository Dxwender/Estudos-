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
public class Ex_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float met;
        Scanner n= new Scanner (System.in);
        System.out.println("Digite em milhas: ");
        met= n.nextFloat();
        System.out.println(met+" em metros e: "+met*0.6214);
    }
    
}
