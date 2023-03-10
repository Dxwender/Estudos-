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
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float comp=0;
        Scanner num= new Scanner(System.in);
        
        System.out.println("Ola escreva o valor de sua compra");
        comp= num.nextInt();
        
        if(comp>=500){
            System.out.println("Voce comprou "+comp+" nessa loja.Obrigado!\n");
            System.out.println("\n======Atenção======");
            System.out.println("\nPor fazer mais de R$500,00 em compras,");
            System.out.println("\nvoce vai receber :R$"+(comp*0.10)+"de desconto.");
            System.out.println("\nO valor a ser pago será: R$"+(comp-(comp*0.1)));
        } else{
            System.out.println("Voce comprou R$"+comp+" nessa loja. Obrigado!");
        }
        
        
    }
    
}
