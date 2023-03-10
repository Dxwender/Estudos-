/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_refeitos_C_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_02_lista_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new  Scanner (System.in);
      //Variveis,Vetores e List's
        int pos=0,qtd=0,media=0,soma=0;
         List listaMaior = new ArrayList();
         List listaMenor = new ArrayList();
        System.out.println("Digite a quantidade de notas :");
        qtd=n.nextInt();
        System.out.println("====");
        int vetorNotas[]=new int[qtd];
      //Digitando informaçoes e processando dados
        for(pos=0;pos<qtd;pos++){
            System.out.println("Digite as notas: ");
            vetorNotas[pos]=n.nextInt();
            soma=soma+vetorNotas[pos];
            media=soma/qtd;
        }
      //Mostrando vetor e comparando dados ja processados  
        for(pos=0;pos<qtd;pos++){
            System.out.println("Notas digitadas");
            System.out.println(vetorNotas[pos]);
        }
        for(pos=0;pos<qtd;pos++){
            if(vetorNotas[pos]<media){
                listaMenor.add(vetorNotas[pos]);
            } else if(vetorNotas[pos]>media){
                listaMaior.add(vetorNotas[pos]);
            }
            
        }
      //Mostrando resultados ja processados  
        System.out.println("======");
        System.out.println("A media da turma e: ");
        System.out.println(media);
        System.out.println("As notas acima da media da turma sao: ");
        System.out.println(listaMaior);
        System.out.println("As notas abaixo da media da turma sao: ");
        System.out.println(listaMenor);
        
    }
    
}
