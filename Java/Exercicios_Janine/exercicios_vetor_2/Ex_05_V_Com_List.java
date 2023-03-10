/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_vetor_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author dxwen
 */
public class Ex_05_V_Com_List {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
      //Definindo vetores/list    
      int pos=0;
      int vetorNorm[]= new int[5];
      
      List listaImpar = new ArrayList();
      List listaPar = new ArrayList();
      
      
    //Colhendo e validando dados  
      for(pos=0;pos<5;pos++){
          System.out.println("Digite");
          vetorNorm[pos]=n.nextInt(); 
        while (vetorNorm[pos]>50){
            System.out.println("Digite novamente");
            vetorNorm[pos]=n.nextInt(); 
        }
      }

      for(pos=0;pos<5;pos++){
       if(vetorNorm[pos]%2==1){
              listaImpar.add(vetorNorm[pos]);
               } 
        else if(vetorNorm[pos]%2==0){
              listaPar.add(vetorNorm[pos]);
               }
      }
      

    //Mostrando resultados  
    System.out.println("_-__-_");
    System.out.println("Vetor normal");  
     for(pos=0;pos<5;pos++){
      System.out.println(vetorNorm[pos]);  
                }
        System.out.println("==========");
        System.out.println("Os numeros impares sao: ");
        System.out.println(listaImpar);
        System.out.println("Os numeros pares sao: ");
        System.out.println(listaPar);
        System.out.println("=====================");
       
   }
}