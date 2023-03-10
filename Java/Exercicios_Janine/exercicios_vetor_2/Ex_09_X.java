/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_vetor_2;

import java.util.Random;

/**
 *
 * @author dxwen
 */
public class Ex_09_X {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pos=0,numero,pos2=0;
        Random n = new Random();
        int vetorNum[]= new int[6];
         for(pos=0;pos<6;pos++){
             numero=n.nextInt(60);
            for(pos2=0;pos2<6;pos2++){
              if(numero == vetorNum[pos2] && pos2 != pos){
                         numero = n.nextInt(60) ;
                   }else{
                       vetorNum[pos] = numero;
                   } 
            }

       }
                    for(pos=0;pos<6;pos++){
                System.out.println(vetorNum[pos]);  
            } 
    }
}
            //Estou tentando fazer o vetor com sorteio e converter int em Strin