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
public class Ex_06_V {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pos=0,pos2=0;
        Scanner n = new Scanner (System.in);
        String vetor[]= new String[10];
        for(pos=0;pos<10;pos++){
            System.out.println("Digite");
            vetor[pos]=n.nextLine();
        }
         
        System.out.println("==Vetor==");
            for(pos=0;pos<10;pos++){
            System.out.println(vetor[pos]);
            
        }
        System.out.println("=====");
        for(pos=0;pos<10;pos++){
            for(pos2 = pos+1; pos2 < 10; pos2++){
              while (vetor[pos].equals(vetor[pos2])) {
                  //vetor[pos]="";
                  System.out.println("Digite novamente");
                  vetor[pos]=n.nextLine();
              } 
           }
        }
                System.out.println("==Vetor==");
            for(pos=0;pos<10;pos++){
            System.out.println(vetor[pos]);
            
        }
    }
    
}
