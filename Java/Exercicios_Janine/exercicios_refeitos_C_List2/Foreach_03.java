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
public class Foreach_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner n = new Scanner (System.in);
      int soma=0;
      List <Integer> ns = new ArrayList();
      for(int pos=0;pos<5;pos++){
          System.out.println("Digite");
          ns.add(n.nextInt());
      }
      for(Integer lista: ns){
         soma=soma+lista; 
      }
        System.out.println("Lista: "+ns);
        System.out.println("Soma: "+soma);
    }
    
}
