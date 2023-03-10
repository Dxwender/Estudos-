/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_vetor_2;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author dxwen
 */
public class Ex_04_Com_ajuda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int pos=0,pos2=0;
       String vetor []=new String[4];
       Scanner n= new Scanner (System.in);
        for(pos=0;pos<4;pos++){
            System.out.println("Digite ");
            vetor[pos]=n.nextLine();
        }
        System.out.println("=====");
        for(pos=0;pos<4;pos++){
            for(pos2 = pos+1; pos2 < 4; pos2++){
              if (vetor[pos].equals(vetor[pos2])) {
                  vetor[pos]=""; 
              } 
           }
        }
        for(pos=0;pos<4;pos++){
          if(!vetor[pos].equals("")){
            System.out.println(vetor[pos]);  
            }
        }
    }
}