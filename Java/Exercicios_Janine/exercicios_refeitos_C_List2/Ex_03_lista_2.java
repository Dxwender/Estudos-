/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_refeitos_C_List2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_03_lista_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner n = new Scanner (System.in);
     int pos=0,maior=0,menor=0;
     int vetor []= new int[5];
     
        //List mai= new ArrayList();
        //List men= new ArrayList();
        ArrayList<Integer> mai = new ArrayList<>();
        ArrayList<Integer> men = new ArrayList<>();
        
     for(pos=0;pos<5;pos++){
         System.out.println("Digite: ");
        vetor[pos]=n.nextInt();
     }
     for(pos=0;pos<5;pos++){
        if(vetor[pos]>maior){
           maior=vetor[pos];
            mai.add(vetor[pos]);
        }
       
        if(menor==0){
           menor=vetor[pos];
           men.add(vetor[pos]);
           
        }else if(vetor[pos]<menor){
                 menor=vetor[pos];
                  men.add(vetor[pos]);
                }   
       
     }
        int maximo= mai.get(0),minimo=men.get(0);
        for(pos=1;pos<mai.size();pos++){
            if(mai.get(pos)>maximo){
                maximo=mai.get(pos);
            }else{
                mai.remove(pos);
            } 
        }
        for(pos=1;pos<men.size();pos++){
           if(men.get(pos)<minimo){
                minimo=men.get(pos);
            }else{
               men.remove(pos);
           } 
        }
        System.out.println("Maiores: "+maximo);
        System.out.println(mai);
        System.out.println("Menores: "+minimo);
        System.out.println(men);
   }
}
                        //Feito