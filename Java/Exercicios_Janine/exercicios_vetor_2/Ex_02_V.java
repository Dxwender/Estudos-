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
public class Ex_02_V {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Definindo variaveis    
        int pos=0,contImpar=0,contPar=0;
        int vetor []= new int [5];
    //Colhendo os dados    
        Scanner n = new Scanner (System.in);
        for(pos=0;pos<5;pos++){
        System.out.println("Digite os numeros: ");
        vetor[pos]=n.nextByte();
        }
    //Separando dados e mostrando resultados    
        System.out.println("_-_-_-");
        for(pos=0;pos<5;pos++){
        if(vetor[pos]%2==0){
            contPar++;
            }else if(vetor[pos]%2==1){
            contImpar++;
            }
        }
        System.out.println("Pares: "+contPar);
        System.out.println("Impares: "+contImpar);
    }
}
