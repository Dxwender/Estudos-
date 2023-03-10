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
public class Ex_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1,n2,n3;
    Scanner num= new Scanner (System.in);
    
        System.out.println("Digite o primeiro numero: ");
        n1=num.nextFloat();
        System.out.println("Digite o segundo numero: ");
        n2=num.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        n3=num.nextFloat();
        
    if(n1>n2 && n1>n3){
        System.out.println("O primeiro numero e maior.");
    }else if (n2>n1 && n2>n3){
        System.out.println("O segundo numero e maior.");
    }else{
        System.out.println("O terceiro numero e maior.");
    }    
        
        
        
        
        
        
    }
    
}
