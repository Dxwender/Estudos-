/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_vetor;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int posi;
        
        int vetor []= new int[5];
        
        Scanner n = new Scanner (System.in);
        for(posi=0;posi<5;posi++){
            System.out.println("Digite os valores");
            vetor[posi]=n.nextInt();
        }
        //Arrays dar uma olhada
        Arrays.sort(vetor);
       
        for(posi=0;posi<5;posi++){
            System.out.print(vetor[posi]+",");
        }
        
    }
    
}
