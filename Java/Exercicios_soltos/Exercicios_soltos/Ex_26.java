/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos;
import java.util.Scanner;
/**
 *
 * @author dxwen
 */
public class Ex_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float n1,n2,n3,mult=0;
       Scanner n = new Scanner (System.in);
       
        System.out.println("Digite o primeiro numero: ");
        n1 =n.nextFloat();
        System.out.println("Digite o segundo numero: ");
        n2 =n.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        n3 =n.nextFloat();
        mult=n2*n3;
        
        if(mult>n1){
            System.out.println("A multiplicacao dos dois numeros e maior que o primeiro numero");
        }else if (mult<n1){
            System.out.println("A multiplicacao dos dois numeros e menor que o primeiro numero");
        }else {
            System.out.println("Sao numeros iguais");
        }
    }
    
}
