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
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner num= new Scanner(System.in);
        System.out.println("Digite um numero");
        n= num.nextInt();
        System.out.println("-----------------\n");
        System.out.println("O antecessor de"+n+"é o valor"+(n-1)+"\n");
        System.out.println("O sucessor de "+n+" é o valor "+(n+1));
    }
    
}
