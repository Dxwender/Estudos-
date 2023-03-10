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
public class Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int ang1=0,ang2=0,ang3=0;
       Scanner ang= new Scanner(System.in);
       
       		System.out.println("Ola digite o priemro angulo");
		ang1=ang.nextInt();
		System.out.println("Ola digite o segundo angulo");
		ang2=ang.nextInt();
		System.out.println("Ola digite o terceiro angulo");
		ang3=ang.nextInt();
                
                if (ang1==90 || ang2==90 || ang3==90){
			System.out.println("Retangulo");
		} else if(ang1>90 || ang2>90 || ang3>90){
					System.out.println("Obtusangulo:");
		}else{System.out.println("Acutangulo");
        }
    }
}
