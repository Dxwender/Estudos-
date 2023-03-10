/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos_2.Bloco_1.Bloco_3;

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
        int num,cont=0;
        Scanner n=new Scanner(System.in);
        System.out.println("Digite o numero da taboada: ");
        num=n.nextInt();
        System.out.println("===================================");
        System.out.println("Taboada de: "+num);
        while(cont<=10){
            System.out.println(cont+" X "+ num +" = "+(num*cont));
            
 
            cont++;
        }
    } 
}