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
public class Ex_06_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pos=0,qtd,busc;
        Scanner n = new Scanner (System.in);
        Scanner n2 = new Scanner (System.in);
        System.out.println("Digite a quandidade de nomes a serem cadastrados");
        qtd=n.nextInt();
        String vetor[]= new String[qtd];
        for(pos=0;pos<qtd;pos++){
            System.out.println("Digite o nome: ");
            vetor[pos]=n2.nextLine();
        }
        System.out.println("====");
        for(pos=0;pos<qtd;pos++){
            System.out.println(pos +" "+vetor[pos]);
        }
        System.out.println("=====");
        System.out.println("Qual nome querbuscar? :");
        busc= n.nextInt();
        System.out.println("====");
        System.out.println(vetor[busc]);
    }
    
}
