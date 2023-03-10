/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos;

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
        float dist,comb,cons_med;
        Scanner num= new Scanner (System.in);
        
        System.out.println("Digite a distancia: ");
        dist= num.nextFloat();
        
        System.out.println("Digite a quantidade de combustivel em L: ");
        comb= num.nextFloat();
        
        System.out.println("O consumo medie e :"+(dist/comb)+" L/Km");
        
    }
    
}
