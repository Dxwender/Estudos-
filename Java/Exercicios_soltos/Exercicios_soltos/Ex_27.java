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
public class Ex_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id;
        String nome;
        Scanner n= new Scanner (System.in);
        Scanner l= new Scanner (System.in);
        System.out.println("Digite o seu nome: ");
        nome=l.nextLine();
        System.out.println("Digite a sua idade: ");
        id=n.nextInt();
        if(id<=10){
            System.out.println(nome+" voce pagara R$ 30,00");
        }else if (id>10 && id <=29){
            System.out.println(nome+" voce pagara R$ 60,00");
        }else if (id>29 && id <=45){
            System.out.println(nome+" voce pagara R$ 120,00");
        }else if (id>45 && id<=59){
            System.out.println(nome+" voce pagara R$ 150,00");
        }else if (id>59 && id <=65){
            System.out.println(nome+" voce pagara R$ 250,00");
        }else{
            System.out.println(nome+" voce pagara R$ 400,00");
        }
        
    }
    
}
