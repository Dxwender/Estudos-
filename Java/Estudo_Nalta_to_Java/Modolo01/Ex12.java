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
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float ano,sal;
       String nome;
       
       Scanner num= new Scanner(System.in);
       Scanner n= new Scanner(System.in);
       
       System.out.println("Nome do funcionario");
       nome= n.nextLine();
       System.out.println("Ano de nacimento");
       ano= num.nextInt();
       System.out.println("Salario $");
       sal =num.nextInt();
       
       System.out.println("______Ficha Funcional______\n");
       System.out.println("Nome: "+nome+"\n");
       System.out.println("Ano de Nacimento: "+ano+"\n");
       System.out.println("Salario $"+sal+"\n");
       System.out.println("___________________");
       
       
       
       
    }
    
}
