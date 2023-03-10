/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_repeticao;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int num,soma = 0,cont=0;
        Scanner leia= new Scanner(System.in); 
    
		while (true){
			System.out.println("Digite idade:");
			num= leia.nextInt();
			soma=num+soma;
			if(num==0){
				break;  
			}
                 cont++;       
		}
         System.out.println("A soma de todas as  idades é: "+soma);
         System.out.println("A sua media  e: "+(soma/cont));
    } 
}
