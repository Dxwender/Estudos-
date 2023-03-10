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
public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n,n2;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um numero");
        n =num.nextInt();
        System.out.println("Digite outro numero");
        n2= num.nextInt();
        
        System.out.println("------------------------\n");
        System.out.println("Soma: "+(n+n2)+"\n");
        System.out.println("Diferenca: "+(n-n2)+"\n");
        System.out.println("Produto: "+(n*n2)+"\n");
        System.out.println("Quociente real: "+(n/n2)+"\n");
        //System.out.println("Quociente inteiro"+(n/n2)+"\n");
        System.out.println("Resto da divisao"+(n%n2));
        
        
    }
    
}
