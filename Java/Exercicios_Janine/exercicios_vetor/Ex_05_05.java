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
public class Ex_05_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pos=0,qtd;
        Scanner n = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores");
        qtd= n.nextInt();
        int vetor[]= new int[qtd];
        for(pos=0;pos<qtd;pos++){
            System.out.println("Digite os valores: ");
            vetor[pos]=n.nextInt();
        }
        System.out.println("====");
        for(pos=qtd-1;pos>=0;pos--){
            System.out.println(vetor[pos]);
        }
    }
    
}
