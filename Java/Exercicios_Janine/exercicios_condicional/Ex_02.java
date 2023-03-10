/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_condicional;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_02 {
    //Nao seu igualar numeros :(
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int L1 = 0,L2 = 0,L3 = 0;
        
        Scanner lado=new Scanner(System.in);
        
                System.out.println("Olá digite o primeiro lado do triangulo");
                L1=lado.nextInt();   
		System.out.println("Olá digite o segundo lado do triangulo");
		L2=lado.nextInt();
		System.out.println("Olá digite o terceiro lado do triangulo");
		L3=lado.nextInt();
     
               	if (L1==L2 && L2==L3){
			System.out.println("Equilatero");
		} else if (L1==L2 && L2==L3){
			System.out.println("Isoceles");
		}else { System.out.println("Escaleno");
                        }
       
    }
    
}
