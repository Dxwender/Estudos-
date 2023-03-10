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
public class Ex_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num,soma_pos = 0, soma_neg=0;
        Scanner leia= new Scanner(System.in); 
    
		while (true){
			System.out.println("Digite:");
			num= leia.nextInt();
			if(num>0){
                            soma_pos=num+soma_pos;
                        }else if(num<0){
                            soma_neg=num+soma_neg;
                        }
			if(num==0){
				
				break;  
			}
		}
         System.out.println("Soma positiva: "+soma_pos);
         System.out.println("soma negativa: "+soma_neg);
        
        
            }
    
}
