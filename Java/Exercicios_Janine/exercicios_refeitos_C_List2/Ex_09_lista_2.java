/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_refeitos_C_List2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dxwen
 */
public class Ex_09_lista_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int pos=0,numero,pos2=0;
        Random n = new Random();
        ArrayList<Integer> vetorNum = new ArrayList<>();
        
         for(pos=0;pos<6;pos++){
             numero=n.nextInt(60);
            for(pos2=0;pos2<6;pos2++){
              if(numero == vetorNum.get(pos2) && vetorNum.get(pos2) != pos){
                         numero = n.nextInt(60) ;
                   }else{
                       //vetorNum.get(pos) = numero;
                   } 
            }

       }
                    for(pos=0;pos<6;pos++){
               //System.out.println(vetorNum[pos]);  
            }
    }
    
}                   //Nao consegui fazer