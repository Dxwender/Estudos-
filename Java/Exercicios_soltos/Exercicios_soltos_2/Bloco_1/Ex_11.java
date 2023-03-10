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
public class Ex_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float alga,rest;
        Scanner n= new Scanner(System.in);
        System.out.println("Digite o quociente");
        alga= n.nextInt();
        rest=alga/3;
        System.out.println("O quaciente e "+ alga);
        System.out.println("O resultado e: "+rest);
    }
    
}
