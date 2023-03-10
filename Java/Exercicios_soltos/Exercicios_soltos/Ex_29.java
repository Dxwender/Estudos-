/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num_ini=0,cont;
        Scanner n= new Scanner (System.in);
        System.out.println("Digite o primeiro numero da taboada");
        num_ini= n.nextInt();
        for(cont=1;cont<=10;cont++){
            System.out.println(num_ini+"X"+cont+"="+num_ini*cont);
        }
        
        
        
    }
    
}
