/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_vetor_2;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_08_Duvida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pos;
        double soma=0,media=0,maior=0,menor=0;
        double vetor[]= new double[7];
        
        Scanner n = new Scanner(System.in);
        for(pos=0;pos<7;pos++){
            System.out.println("Digite em (MM) o quanto choveu em 24H no dia : "+(pos+1));
            vetor[pos]=n.nextDouble();
            soma=soma+vetor[pos];
            media=soma/7;
        }
        System.out.println("___________");
        System.out.println("Levantemento da semana: ");
        for(pos=0;pos<7;pos++){
            System.out.println("Dia "+(pos+1)+": "+vetor[pos]+" (MM) ");
        }
        System.out.println("___________");
        System.out.println("A soma da semana foi: "+soma+" (MM)");
        System.out.println("A media por dia foi de : "+media+" (MM)");
        
        System.out.println("___________");
         for(pos=0;pos<7;pos++){
            if(vetor[pos]>maior){
                maior=vetor[pos];
            }
            if(menor==0){
               menor=vetor[pos]; 
            }else if(vetor[pos]<menor){
                     menor=vetor[pos];   
            }
        }
         
      System.out.println("O menor volume foi :"+menor);
      System.out.println("O maior volume foi "+maior);
        
    }
    
}
            //Nao conseguir mostrar o vetor :(