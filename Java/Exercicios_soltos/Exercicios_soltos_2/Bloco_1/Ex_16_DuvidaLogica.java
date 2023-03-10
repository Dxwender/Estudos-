/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos_2.Bloco_1;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_16_DuvidaLogica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1=1738,rest;
        Scanner n = new Scanner (System.in);
        
        rest= n1%1000;
        n1 /= n1;
        System.out.println(n1+" possui "+n1+" milhares" );
        n1=rest;
        rest= n1%100;
        n1 /= 100;
        System.out.println(n1+" possui "+n1+" centenass" );
        n1=rest;
        rest= n1%10;
        n1 /= 10;
        System.out.println(n1+" possui "+n1+" dezenas" );
        n1=rest;
        rest= n1%1;
        n1 /= 1;
        System.out.println(n1+" possui "+n1+" unidades" );
        
    }
    
}
