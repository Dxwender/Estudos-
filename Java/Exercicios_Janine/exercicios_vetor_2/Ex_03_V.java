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
public class Ex_03_V {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Defindo variaveis e vetor    
        int pos,maior=0,menor=0;
        int vetor []= new int [5];
    //Colhendo dados    
        Scanner n = new Scanner (System.in);
        for(pos=0;pos<5;pos++){
            System.out.println("Digite o numero ");
            vetor[pos]=n.nextInt();
        }
    //Validando dados    
        for(pos=0;pos<5;pos++){
            if(vetor[pos]>maior){
                maior=vetor[pos];
            } 
            if(menor==0){
               menor=vetor[pos];
            }else if(vetor[pos]<menor){
                     menor=vetor[pos];
            }
        }
    //Mostrando Resultados    
        System.out.println("Maior: "+maior);
        System.out.println("Maior: "+menor);
    }
}