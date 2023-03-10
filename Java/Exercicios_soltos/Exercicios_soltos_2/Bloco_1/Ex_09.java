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
public class Ex_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sal;
        Scanner n= new Scanner (System.in);
        System.out.println("Digite o seu salario");
        sal= n.nextFloat();
        System.out.println("Seu novo salario sera: "+(sal+(sal*0.15)));
    }
    
}
