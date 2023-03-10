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
public class Ex_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float polp=0;
        Scanner n = new Scanner (System.in);
        System.out.println("Digite o valor do deposito");
        polp= n.nextFloat();
        System.out.println("Apos 1 mes com reajuste sera"+(polp+(polp*0.05)));
    }
    
}
