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
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num;
        Scanner inv= new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num= inv.nextInt();
        if(num>0){
            System.out.println("O oposto do mumero : "+num+" e "+(1/num));
        }else if(num<0){
                System.out.println("O oposto do numero :"+" e "+((-1)*num));
                 }else{
                  System.out.println("O numero e nulo");          
        }
        
    }
    
}
