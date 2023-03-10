/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos_2.Bloco_1.Bloco_2;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int li;
        Scanner n = new Scanner (System.in);
        System.out.println("Digite a quantidades de livros que ira comprar ");
        li= n.nextInt();
        if(li<=10){
            System.out.println("O valor da compra sera: "+li*12);  
        }else {
            System.out.println("O valor da somcpra sera: "+li*8);
        }
    }
    
}
