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
public class Ex_04_lista_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        int pos=0,pos2=0;
        String num="";
        
        List <Integer> numeros= new ArrayList();
        List <Integer> numeros2 = new ArrayList();
        
        for(pos=0;pos<6;pos++){
            System.out.println("Digite: ");
            numeros.add(n.nextInt());
        }
        for(pos=0;pos<numeros.size();pos++){
            if(!numeros2.contains(numeros.get(pos))){
                numeros2.add(numeros.get(pos));
            }
        }
        System.out.println(numeros);
        System.out.println("Segunda lista"+numeros2);
    }
}
                            //Debugar
                            // ! = negação