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
public class Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3;
            Scanner num= new Scanner(System.in);
            
            System.out.println("Olá Escreva o primeiro numero");
            n1= num.nextInt() ;
            System.out.println("Olá Escreva o segundo numero");
            n2= num.nextInt() ;
            System.out.println("Olá Escreva o terceiro numero");
            n3= num.nextInt() ;
            
            
                       if(n1<=n2 && n1<=n3 && n2<=n3){
			 System.out.println (n1 +">"+n2+">"+n3);
			}else if(n1<=n2 && n1<=n3 && n3<=n2){
                            System.out.println (n1+">"+ n3+">"+ n2);
                        }else if(n2<=n1 && n2<=n3 && n1<=n3){
                            System.out.println (n2 +">"+ n1 +">"+ n3);
                        }else if(n3<=n1 && n3<=n2 && n1<=n2){
                            System.out.println (n3 +">"+ n1 +">"+ n2);
                        }else if(n2<=n3 && n2<=n1 && n3<=n1){
                            System.out.println (n2 +">"+ n3 +">"+ n1);
                        }else if(n3<=n2 && n3<=n1 && n2<=n1){
                            System.out.println (n3 +">"+ n2 +">"+ n1);
                        }
		
        
       
    }
    
}
