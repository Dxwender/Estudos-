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
public class Ex_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner num = new Scanner (System.in);
        
        System.out.println("Digite o primeiro numero");
        n1= num.nextInt();
        System.out.println("Digite o segundo numero");
        n2= num.nextInt();
        System.out.println("Digite o terceiro numero");
        n3= num.nextInt();
         
        if(n1<=n2 && n1<=n3 && n2<=n3){
            System.out.println(n1+","+n2+","+n3);    
        }
        if(n1<=n2 && n1<=n3 && n3<=n2){
            System.out.println(n1+","+n3+","+n2);
        }
        if(n2<=n1 && n2<=n3 && n1<=n3){
            System.out.println(n2+","+n1+","+n3);
        }
        if(n2<=n1 && n2<=n3 && n3<=n1){
            System.out.println(n2+","+n3+","+n1);
        }
        if(n3<=n2 && n3<=n1 && n2<=n1){
            System.out.println(n3+","+n2+","+n1);
        }
        if(n3<=n2 && n3<=n1 && n1<=n2){
            System.out.println(n3+","+n1+","+n2);
        }
    }
}
