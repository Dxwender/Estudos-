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
public class Ex_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float l1,l2;
        Scanner n = new Scanner (System.in);
        System.out.println("Digite o primeiro lado: ");
        l1= n.nextFloat();
        System.out.println("Digite o segundo lado: ");
        l2= n.nextFloat();
        System.out.println("A sua area e: "+(l1*l2));
        System.out.println("O dobro da sua area e "+((l1*l2)+(l1*l2)));
    }
    
}
