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
public class Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,cont=0;
        Scanner n =new Scanner (System.in);
        System.out.println("Digite um numero");
        num=n.nextInt();
        num=num+1;
        System.out.println("==");
        System.out.println("Numero---Dobro---Triplo");
        while(cont<=num && num!=0){   
        num=num-1;   
            System.out.println(num+"--------"+(num*2)+"--------"+(num*3));    
        }
    }
}
