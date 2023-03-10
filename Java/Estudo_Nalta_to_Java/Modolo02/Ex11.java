/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modolo02;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float num,num2;
       Scanner ver = new Scanner (System.in);
       System.out.println("Ola digite o primeiro numero");
       num= ver.nextInt();
       System.out.println("Ola digite o segundo numero: ");
       num2= ver.nextInt();
       if(num<num2){
           System.out.println(num+" e "+num2);
            }else if(num>num2){
                System.out.println(num2+" e "+num);
                }else{
                    System.out.println("Iguais");
       }
    }
    
}
