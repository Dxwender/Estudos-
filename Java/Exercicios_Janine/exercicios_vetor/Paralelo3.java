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
public class Paralelo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int posi;
        int vetor[]= new int [5];
        Scanner n = new Scanner (System.in);
        for(posi=0;posi<5;posi++){
            vetor[posi]=n.nextInt();
        }
        System.out.println("====");
        for(posi=0;posi<5;posi++){
            System.out.println(vetor[posi]);
        }
    }
    
}
