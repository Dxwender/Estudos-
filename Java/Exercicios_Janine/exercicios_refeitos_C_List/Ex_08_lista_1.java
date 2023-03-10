/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_refeitos_C_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_08_lista_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner n= new Scanner (System.in);
        int pos=0,num=0;
        List Numeros=new ArrayList();
       for(pos=0;pos<5;pos++){
        System.out.println("Digite");
        num=n.nextInt();
        Numeros.add(num);
        
        }
        //Arrays.sort(Numeros);
        System.out.println(Numeros);
    }
}
                    //Nao consegui usar arays sort 