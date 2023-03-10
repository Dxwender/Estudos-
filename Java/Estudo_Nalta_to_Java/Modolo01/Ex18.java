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
public class Ex18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sal,aju,novo;
        String nome;
        Scanner num= new Scanner (System.in);
        Scanner n = new Scanner(System.in);
        
        System.out.println("Digite o seu nome\n");
        nome= n.nextLine();
        System.out.println("Digite o salario");
        sal= num.nextInt();
        System.out.println("Rajuste (%): ");
        aju= num.nextInt();
        
        System.out.println("+++++++Rajuste+++++++\n");
        System.out.println("O funionario "+ nome +" ganhava R$"+sal+"\n");
        System.out.println("Depois de  ganhar "+aju+"% de almento,\n");
        novo= sal*(aju/100);
        System.out.println("passara a  ganhar "+novo+" a mais por mes.\n");
        System.out.println("Seu novo salario sera de : R$"+(novo+sal));
    }
    
}
