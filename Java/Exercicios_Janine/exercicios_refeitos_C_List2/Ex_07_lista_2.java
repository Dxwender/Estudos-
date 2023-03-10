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
public class Ex_07_lista_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        List numeros = new ArrayList();
        int pos=0;
        String num="",busc="";
      for(pos=0;pos<3;pos++){
          System.out.println("Digite o numero: ");
          num=n.nextLine();
          numeros.add(num);
      }
        System.out.println(numeros);
        System.out.println("Digite o numero que deseja buscar: ");
        busc=n.nextLine();   
      for(pos=0;pos<3;pos++){
          if(numeros.get(pos).equals(busc)){
          System.out.println("O numero pesquisado foi: "+numeros.get(pos));  
          }   
        }  
    } 
}
