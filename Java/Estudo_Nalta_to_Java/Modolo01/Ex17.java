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
public class Ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float p,eco,res;
        Scanner num= new Scanner(System.in);
        
        System.out.println("Qual o preço do proto: ");
        p= num.nextInt();
        
        System.out.println("___________________\n");
        System.out.println("O produto custava: $ "+p+" e agora custara $"+(eco=(float) (p-(p*0.05)))+" com 5% de desconto.\n");
        //(Nao sei arrendondar)System.out.println("Ao todo , teremos R$:");
    }
    
}
