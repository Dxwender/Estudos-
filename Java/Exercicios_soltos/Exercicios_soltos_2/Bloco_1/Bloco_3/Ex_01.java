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
public class Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,som=0,cont=1;
        Scanner n=new Scanner(System.in);
        while(cont<=10){
            System.out.println("Digite o numero "+cont);
            num=n.nextInt();
            som=num+som;
            cont++;
        }
        System.out.println("O total e: "+som);
    } 
}