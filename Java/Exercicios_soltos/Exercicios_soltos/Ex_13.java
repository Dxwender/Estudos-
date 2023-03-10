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
public class Ex_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id1,id2;
        String n1,n2;
        
        Scanner num= new Scanner (System.in);
        Scanner let= new Scanner (System.in);
        
        System.out.println("Primeira pessoa digite o seu nome:");
        n1= let.nextLine();
        System.out.println("Primeira pessoa digite a sua idade:");
        id1= num.nextInt();
        
        System.out.println("Segunda pessoa digite o seu nome:");
        n2= let.nextLine();
        System.out.println("Segunda pessoa digite a sua idade:");
        id2= num.nextInt();  
        
        if(id1>=18 && id2<18){
            System.out.println(n1+" e maior de idade pois tem "+id1+"anos.");
            System.out.println(n2+" e menor de idade pois tem "+id2+"anos.");
                }else if (id1<18 && id2>=18){
                     System.out.println(n1+" e menor de idade pois tem "+id1+"anos.");
                     System.out.println(n2+" e maior de idade pois tem "+id2+"anos.");          
                     }else if (id1>=18 && id2>=18){
                             System.out.println(n1+" e "+n2+" sao maiores de idade.");
                             }else if(id1<18 && id2<18){
                                 System.out.println(n1+" e "+n2+" sao menores de idade.");  
                                }
        
        
        
    }
    
}
