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
public class Ex_05_lista_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner n = new Scanner (System.in);   
        int pos=0;
        List impar= new ArrayList();
        List par= new ArrayList();
    for(pos=0;pos<10;pos++){
      pos=n.nextInt();
      if(pos%2==0){
         par.add(pos); 
      }else if(pos%2==1){
          impar.add(pos);
      }else{
          System.out.println("Error");
             }
        }
        System.out.println("Par: "+par);
        System.out.println("Impar: "+impar);
    }
    
}
            //Feito