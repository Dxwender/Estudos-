/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_vetor_2;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int pos,num=0;
     String vetor []= new String[5];
     Scanner n = new Scanner (System.in);
     for(pos=0;pos<5;pos++){
         System.out.println("Type");
         vetor[pos]=n.nextLine();  
     }
     for(pos=0;pos<5;pos++){
         if(vetor[pos].equals(0)){
           
           vetor[pos]=vetor[pos-1];
                      
          }
     }
        System.out.println("=_=_=");
    for(pos=0;pos<5;pos++){
       System.out.println(vetor[pos]);
       }   
   }
}
