/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_repeticao;
import java.util.Scanner;
/**
 *
 * @author dxwen
 */
public class Ex_08 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner n =new Scanner (System.in);
      int numero,fatorial;
       System.out.println("Informe o numero desejado para fatorial: ");
       numero=n.nextInt();
        fatorial=numero;  
        while(numero>1){
         fatorial=fatorial*(numero-1);
         numero--;
      }
        System.out.println("Fatorial= "+fatorial);
    }
}