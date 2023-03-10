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
public class Ex_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id;
       Scanner num= new Scanner (System.in);
       
        System.out.println("Digite a sua idade:");
        id = num.nextInt();
        
        if(id>=18){
            System.out.println("Maior de  idade.");
             } else if(id>0 && id<18){
                 System.out.println("Menor de  idade.");
             }else {
                 System.out.println("Felizmente ainda nao existe.");
             }
       
    }
    
}
