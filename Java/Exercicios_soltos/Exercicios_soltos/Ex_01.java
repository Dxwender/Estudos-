/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float altura,idade;
        String text;
        Scanner num = new Scanner(System.in);
        Scanner let = new Scanner (System.in);
        System.out.println("Digite o seu nome: ");
        text= let.nextLine();
        System.out.println("Digite a sua idade: ");
        idade= num.nextInt();
        System.out.println("Digite a sua alura");
        altura = num.nextFloat();
        System.out.println("Nome: "+text);
        System.out.println("Idade: "+idade);
        System.out.println("Altura"+altura);
        
    }
    
}
