/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modolo01;

import java.util.Scanner;
/**
 *
 * @author dxwen
 */
public class Ex15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1,n2;
        
        Scanner num= new Scanner(System.in);
        
        System.out.println("Primeira nota\n");
        n1= num.nextInt();
        System.out.println("Segunda nota\n");
        n2= num.nextInt();
        
        System.out.println("=========Resultado========\n");
        System.out.println("As notas do aluno foram "+n1+" e "+n2);
        System.out.println("A media final foi: "+((n1+n2)/2));
        
    }
    
}
