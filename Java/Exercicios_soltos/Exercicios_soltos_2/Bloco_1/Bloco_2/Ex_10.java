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
public class Ex_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        Scanner n = new Scanner (System.in);
        System.out.println("Selecione o seu pais de origem.");
        System.out.println("1 _ Brasileiro,\n" +
                           "2 _ Alemao,\n" +
                           "3 _ Ingles,\n" +
                           "4 _ Italiano,\n" +
                           "5 _ Espanhol\n" +
                           "6 _ Frances.");
        System.out.println("Escolha seu pais: ");
        op= n.nextInt();
        switch (op) {
            case 1:
                System.out.println("=======================");
                System.out.println("Vc fala Portugues");
                break;
            case 2:
                System.out.println("=======================");
                System.out.println("Vc fala Alemao");
                break;
            case 3:
                System.out.println("=======================");
                System.out.println("Vc fala Ingles");
                break;
            case 4:
                System.out.println("=======================");
                System.out.println("Vc fala Italiano");
                break;
            case 5:
                System.out.println("=======================");
                System.out.println("Vc fala Espanhou");
                break;
            case 6:
                System.out.println("=======================");
                System.out.println("Vc fala Frances");
                break;    
            default:
                System.out.println("=======================");
                System.out.println("Error");
                break;
        }
    }
}
