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
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num;
        Scanner veri= new Scanner(System.in);
        System.out.println("Ola digite um numero: ");
        num= veri.nextInt();
        if(num>0){
            System.out.println("Positivo");
        }else if(num<0){
                System.out.println("Negativo");
                }else{
                    System.out.println("Nulo");
                        }
    }
    
}
