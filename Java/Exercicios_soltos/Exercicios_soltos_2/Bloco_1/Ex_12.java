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
public class Ex_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float ali;
        Scanner n = new Scanner (System.in);
        System.out.println("Digite a quantidade de alimento en KG: ");
        ali= n.nextFloat();
        System.out.println("Esse alimento ira durar cerca de "+(ali/0.5)+" dias.");
        
    }
    
}
