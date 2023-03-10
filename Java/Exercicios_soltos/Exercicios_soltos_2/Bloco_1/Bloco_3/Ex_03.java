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
public class Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,sum=0,cont=0;
        Scanner n=new Scanner(System.in);
        System.out.println("Type the number: ");
        num=n.nextInt();
        System.out.println("===================================");
        System.out.println("Table of: "+num+"is :");
        while(cont<=10){
            sum=num+sum;
            System.out.println(sum+" / "+ num +" = "+(sum/num));
            cont++;
        }
    } 
}