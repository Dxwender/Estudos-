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
public class Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1,n2;
        Scanner n= new Scanner (System.in);
        
        System.out.println("Digite o primeiro numero");
        n1= n.nextFloat();
        System.out.println("Digite o segundo numero");
        n2= n.nextFloat();
        System.out.println("A soma e igual: "+(n1+n2));
        
    }
    
}
