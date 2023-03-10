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
public class Ex_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float num = 0,cont=-1,soma=0;
        Scanner dig= new Scanner(System.in);
      
        do{
            cont++;
           System.out.println("Digite um numero");
            num= dig.nextFloat();
            soma=num+soma;   
        } while(num!=0);
        System.out.println("A media e "+(soma/cont));
    }
    
}
