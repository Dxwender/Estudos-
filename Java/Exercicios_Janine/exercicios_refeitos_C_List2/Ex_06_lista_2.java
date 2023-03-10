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
public class Ex_06_lista_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pos=0,pos2=0,busc=0;
        Scanner n = new Scanner (System.in);
        List <Integer> numero= new ArrayList();
        for(pos=0;pos<4;pos++){
            System.out.println("Digite");
            numero.add(n.nextInt());
        }
         
        System.out.println("==Lista=="+numero);
        System.out.println("=====");
        for(pos=0;pos<numero.size();pos++){
            for(pos2 = pos+1; pos2 < numero.size(); pos2++){
              while (numero.get(pos).equals (numero.get(pos2))) {
                  //vetor[pos]="";
                  System.out.println("Digite novamente");
                  //busc=n.nextInt();
                  numero.set(pos, n.nextInt());
              } 
           }
        }
                System.out.println("==Lista final=="+numero);
    }
}
