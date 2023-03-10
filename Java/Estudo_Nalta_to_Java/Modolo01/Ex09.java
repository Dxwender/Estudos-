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
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float s,r;
      String n;
      
      Scanner num= new Scanner(System.in);
      Scanner nome= new Scanner(System.in);
      
      System.out.println("Nome do funcionario");
      n =nome.nextLine();
      System.out.println("Digite o salario");
      s =num.nextInt();
      System.out.println("Reajust (%)");
      r =num.nextInt();
      
      System.out.println("-----Resultado-----\n");
      System.out.println(n+" ganhava: $"+s+"\n");
      System.out.println("depois do reajuste de  :"+r+" % de aulmento\n");
      System.out.println("vai passar ganhar: $"+(s+(s*r/100)));
      
    }
    
}
