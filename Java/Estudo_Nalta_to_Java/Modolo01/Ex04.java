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
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n,n2,media=0;
    Scanner num= new Scanner(System.in);
        System.out.println("Digite a priemeira nota");
        n= num.nextInt();
        System.out.println("Digite a segunda nota");
        n2= num.nextInt();
        media=n+n2;
        System.out.println("As notas do aluno foram "+n+" e "+n2);
        System.out.println("\nA media final foi: "+(media/2));
    }
    
}
