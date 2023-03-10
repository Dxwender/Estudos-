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
public class Ex_02_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int notas,qtdNotas,soma=0,media;
       String maiorNotas ="";
       
       Scanner n= new Scanner (System.in);
       
        System.out.println("Digite a quantidade de notas");
        qtdNotas=n.nextInt();
        int vetor []= new int [qtdNotas];
     
       for(notas=0;notas<qtdNotas;notas++){
           System.out.println("Digite a nota "+notas+" de "+qtdNotas);
           vetor[notas]=n.nextInt();
           soma=soma+vetor[notas];
       }
        System.out.println("===");
        System.out.println("A soma de todas as  notas foi: ");
        System.out.println(soma);
        System.out.println("===");
        System.out.println("A media de todas as  notas foi: ");
        media= soma/qtdNotas;
        System.out.println(media);
        System.out.println("===");
        System.out.println("As menores notas foram: ");
        for(notas=0;notas<qtdNotas;notas++){
                     for(notas=0;notas<qtdNotas;notas++){
            if(vetor[notas]>=media){
                maiorNotas=maiorNotas+vetor[notas]+",";
            } 
        }
        System.out.println(maiorNotas+"");
        }
    }
}