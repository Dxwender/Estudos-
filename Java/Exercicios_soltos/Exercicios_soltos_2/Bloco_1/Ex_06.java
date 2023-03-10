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
public class Ex_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float val_ho,ho_tra;
        Scanner n = new Scanner (System.in);
        
        System.out.println("Digite o valor da sua hora de trabalho: ");
        val_ho= n.nextFloat();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        ho_tra =n.nextFloat();
        
        System.out.println("O valor do seu salario sera: "+(ho_tra*val_ho));
    }
    
}
