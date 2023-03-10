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
public class Ex_03_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota=0,qtd,soma=0,media=0;
        Scanner n = new Scanner (System.in);
        Scanner nom= new Scanner (System.in);
        System.out.println("Digite a quantidade de nomes: ");
        qtd=n.nextInt();
        int vetorNot []= new int [qtd];
        String vetorNom []= new String [qtd];
        System.out.println("-----");
        for(nota=0;nota<qtd;nota++){
            System.out.println("Digite o nome : ");
            vetorNom[nota]=nom.nextLine();
            System.out.println("Digite a nota : ");
            vetorNot[nota]=n.nextInt();
            soma=soma+vetorNot[nota];
        }
        media=soma/qtd;
        System.out.println("-----");
        System.out.println("Notas e nomes cadastrados:");
        for(nota=0;nota<qtd;nota++){
            System.out.print( vetorNom[nota]+"-");
            System.out.print( vetorNot[nota]+" ");
            System.out.println("/");
        }
        System.out.println("-----");
        System.out.println("Soma notas de todas as notas e : "+soma);
        System.out.println("A media da turma e : "+media);
        System.out.println("-----");
        for(nota=0;nota<qtd;nota++){
            if(vetorNot[nota]>media){
                System.out.print( vetorNom[nota]+"-");
                System.out.print( vetorNot[nota]+" ");
            }
        }
    }
}