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
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner num= new Scanner(System.in);
        
        System.out.println ("\nDigite o numero:");
		n= num.nextInt();
		if (n<0){System.out.println("O dobro e :"+(n*2));}else
                                                                    {System.out.println("O triplo e "+(n*3));}
    }
    
}
