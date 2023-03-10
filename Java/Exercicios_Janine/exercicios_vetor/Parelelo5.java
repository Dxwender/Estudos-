/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_vetor;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Parelelo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int pos;
       int vetor [] = new int [5];
       Scanner n = new Scanner (System.in);
       for(pos=0;pos<5;pos++){
           vetor[pos]=n.nextInt();
       }
       System.out.println("====");
       for(pos=0;pos<5;pos++){
           System.out.println(vetor[pos]);      
       }
    }
    
}
