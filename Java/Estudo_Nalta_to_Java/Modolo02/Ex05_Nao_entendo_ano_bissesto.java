/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modolo02;
import java.util.Scanner;
/**
 *
 * @author dxwen
 */
public class Ex05_Nao_entendo_ano_bissesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ano;
        Scanner bis= new Scanner(System.in);
        System.out.println("Escreva o ano");
        ano= bis.nextInt();
        
        if(ano%4==0 && ano%100 !=0 || ano%400==0){
            System.out.println("O ano de "+ano+"e bissesto.");
        }else{
            System.out.println("O ano de "+ano+" não e bissesto.");
        }
    }
}
