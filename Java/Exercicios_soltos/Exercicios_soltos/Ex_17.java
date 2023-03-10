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
public class Ex_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num,cont=1,cont_posi=0,cont_neg=0,zero=0;
        Scanner n = new Scanner(System.in);

     while (cont<=20){
         System.out.println("Digite um numero");
         num = n.nextFloat();
         if(num<0){
             cont_neg++;
         }else if (num>0){
             cont_posi++;
         }else{
             zero++;
         }
     cont++;    
     }   
        System.out.println("Numeros negativos: "+cont_neg);
        System.out.println("Numeros positivos: "+cont_posi);
        System.out.println("Numero zero: "+zero);
    }
    
}
