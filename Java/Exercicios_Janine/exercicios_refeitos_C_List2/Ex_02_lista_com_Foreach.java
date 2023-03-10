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
public class Ex_02_lista_com_Foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner n = new Scanner (System.in);
      int pos=0;
      List <Integer> par = new ArrayList();
      List <Integer> impar = new ArrayList();
     for(pos=0;pos<5;pos++){
         System.out.println("Digite: ");
          if(pos%2==0){
           par.add(n.nextInt());   
          }else{
           impar.add(n.nextInt());   
          }  
       }
        System.out.println("Par: "+par);
        System.out.println("Impar: "+impar);
    } 
}
                        //Feito