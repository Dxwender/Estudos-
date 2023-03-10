/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_vetor_2;
import java.util.Scanner;
/**
 * @author dxwen
 */
public class Ex_05_V_Mais_ou_menos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Definindo vetores    
      int pos=0,contPar=0,contImpar=0;
      int vetorNorm[]= new int[5];
      Scanner n = new Scanner (System.in);
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
              contImpar++;
               } 
        else if(vetorNorm[pos]%2==0){
              contPar++;
               }
      }
      int vetorImpa[]= new int[contImpar];
      int vetorPar[]= new int[contPar];
      
      for(pos=0;pos<5;pos++){
        if(vetorNorm[pos]%2==1){
           for(int posI=0;posI<contImpar;posI++){
              vetorImpa[posI]= vetorNorm[pos];
                 }
               } 
        /*else if(vetorNorm[pos]%2==0){
               for(int posP=0;posP<contPar;posP++){
                    vetorPar[posP]=vetorNorm[pos];
                }
            }*/
      }
    //Mostrando resultados  
    System.out.println("_-__-_");
    System.out.println("Vetor normal");  
     for(pos=0;pos<5;pos++){
      System.out.println(vetorNorm[pos]);  
                }
        System.out.println("_-__-_");
        System.out.println("Impares");
          for(pos=0;pos<contImpar;pos++){
          System.out.println(vetorImpa[pos]);
                                }
          System.out.println("_-__-_");
          System.out.println("Pares");
          for(pos=0;pos<contPar;pos++){
          System.out.println(vetorPar[pos]);
      
      }
       
   }
}