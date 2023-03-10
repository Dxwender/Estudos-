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
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float p;
        Scanner num = new Scanner(System.in);
        System.out.println("Qual e o preco do produto");
        p = num.nextInt();
        System.out.println("Com 5% de desconto, o produto sai por $"+(p-(p*0.05)));
        
    }
    
}
