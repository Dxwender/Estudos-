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
public class Ex_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1,n2,n3,n4;
        Scanner n= new Scanner (System.in);
        System.out.println("Digite a primeira nota:");
        n1=n.nextFloat();
        System.out.println("Digite a segunda nota:");
        n2=n.nextFloat();
        System.out.println("Digite a terceira nota:");
        n3=n.nextFloat();
        System.out.println("Digite a quarta nota:");
        n4=n.nextFloat();
        System.out.println("A media e:"+(n1+n2+n3+n4)/4);
    }
    
}
