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
public class Ex_07_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int qtd,nomes;
        Scanner numer = new Scanner(System.in);
        Scanner nome = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros: ");
        qtd=numer.nextInt();
        String vetorNome[]= new String[qtd];
        int vetorNumr[]= new int[qtd];
        System.out.println("===");
        for(nomes=0;nomes<qtd;nomes++){
            System.out.print("Digite o nome: ");
            vetorNome[nomes]=nome.nextLine();
            System.out.print("Digite o numero: ");
            vetorNumr[nomes]=numer.nextInt();
            System.out.println("====");
        }
            System.out.println("Little database: ");
            System.out.println("Posicao  "+"Nome  "+"Numero  ");
            for(nomes=0;nomes<qtd;nomes++){
            System.out.println(nomes+"        "+vetorNome[nomes]+"     "+vetorNumr[nomes]);
        }
            System.out.println("===");
            System.out.println("Digite o nome para busca: ");
            
    }   
}
