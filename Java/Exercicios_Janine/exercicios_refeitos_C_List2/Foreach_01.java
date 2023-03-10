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
public class Foreach_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner n = new Scanner (System.in);
     int contador=0,soma=0;
        List <Integer> numeros = new ArrayList();
        
        
        for(int pos=0;pos<5;pos++){
        System.out.println("Digite os numero");
        numeros.add(n.nextInt());
        }
        
        for(int lista :numeros){
            
            if(lista>=5){
                contador++; 
            }
           soma=lista+soma;
        }
        System.out.println("Soma: "+soma); 
       System.out.println("Contador :"+contador);
        System.out.println("List:"+numeros);
    }
    
}
