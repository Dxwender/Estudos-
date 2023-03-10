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
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,n2;
        Scanner num= new Scanner(System.in);
        System.out.println("Digite a sua primeira nota:\n");
        n= num.nextInt();
        System.out.println("Digite a sua segunda nota:\n");
        n2= num.nextInt();
        
        System.out.println("As notas do aluno foram "+n+" e "+n2);
        System.out.println("\nA media final foi "+((n+n2)/2));
    }
    
}
