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
public class Ex_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota=0,mp=0,pond1=0,pond2=0;
        String conf;
        Scanner num= new Scanner (System.in);
        Scanner let= new Scanner(System.in);
                   System.out.println("Para comessar aperte S");
        conf= let.nextLine();
        do{
         System.out.println("Digite uma nota: ");
         nota= num.nextFloat();
            System.out.println("Digite o peso");
            pond1= num.nextInt();
          pond2=pond2+pond1;
           mp=(nota*pond1)/pond2;
          System.out.println("Para continuar aperte S");
        conf= let.nextLine();
        }while("S".equals(conf) || "s".equals(conf));
        
        System.out.println("nota: "+nota);
        System.out.println(pond1);
        System.out.println(pond2);
        System.out.println("A media ponde e "+mp);
    }
    
}