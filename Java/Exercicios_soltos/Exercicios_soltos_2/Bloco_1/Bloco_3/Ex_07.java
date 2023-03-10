/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos_2.Bloco_1.Bloco_3;

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
        double L1,L2,Are;
        Scanner n= new Scanner (System.in);
       do{
        System.out.println("Digite a medidia de um lado do terreno em |Metros|: ");
        L1=n.nextDouble();
        System.out.println("Digite a medidia do outro lado do terreno em |Metros|: ");
        L2=n.nextDouble();
        Are=L1*L2;
        System.out.println("==========================================");
        System.out.println("A area do terreno e: "+Are+" metros quadrados.");
        System.out.println("==========================================");
       } while(Are>100);
        System.out.println("Fim!");
    }
}
