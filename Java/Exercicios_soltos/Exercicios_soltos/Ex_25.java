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
public class Ex_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia,mes;
        Scanner n= new Scanner(System.in);
        System.out.println("Digite o dia do seu nacimento: ");
        dia= n.nextInt();
        System.out.println("Digite o mes do seu nacimento: ");
        mes= n.nextInt();
        System.out.println("Digite o ano do seu nacimento: ");
        dia= n.nextInt();
        if(dia>=1 && dia <=30 || mes>=1 && mes<=12){
            System.out.println("Sua data de nascimento e valida.");
        }else{
         System.out.println("Sua  data de  nascimento nao e valida. ");   
        }
        
        
        
        
    }
    
}
