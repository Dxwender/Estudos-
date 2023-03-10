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
public class Ex_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float num1,num2;
       Scanner n= new Scanner (System.in);
        System.out.println("Digite o primeiro numero: ");
        num1= n.nextFloat();
        System.out.println("Digite o segundo numero: ");
        num2= n.nextFloat();
        
        if(num1%num2==0){
            System.out.println("sim");
        }else {
            System.out.println("nao");
        }
    }
    
}
