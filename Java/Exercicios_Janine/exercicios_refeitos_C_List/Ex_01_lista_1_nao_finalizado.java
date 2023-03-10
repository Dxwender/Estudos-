/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_refeitos_C_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_01_lista_1_nao_finalizado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner n = new Scanner (System.in);
    //Variveis,Vetores e List's
    
      int pos=0,pos1=0,pos2=0,pos3=0;
      int vetor []= new int[3];
      int vetor2 []= new int[3];
      int vetor3 []= new int[3];
      ArrayList<Integer> listaResp = new ArrayList<>();
      
      /*ArrayList<Integer> lista1Num = new ArrayList<>();
      ArrayList<Integer> lista2Num = new ArrayList<>();
      ArrayList<Integer> listaResp = new ArrayList<>();
        List lista1Num = new ArrayList();
        List lista2Num = new ArrayList();
        List resp = new ArrayList();
        */
   
    //Digitando informaçoes
      for(pos1=0;pos1<3;pos1++){
        System.out.println("Type to list 1: ");
        vetor[pos1]=n.nextInt();
        
    }
        System.out.println("=-=-=-=-=-=-=-=");
    for(pos2=0;pos2<3;pos2++){
        System.out.println("Type to list 2: ");
        vetor2[pos2]=n.nextInt();
        
    }
   //Processando dados
   
    for(pos3=0;pos3<3;pos3++){ 
        vetor3 [pos3]=vetor[pos3]*vetor2[pos3];
        }
  //Mostrando resultados ja processados

        System.out.println(vetor3[pos3]);
        
  }
}
                //Nao consigo miltiplicar uma list pela outro