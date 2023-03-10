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
public class Ex_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dist;
        Scanner n = new Scanner (System.in);
        System.out.println("Quantos metros foram percorridos pelo nadador: ");
        dist= n.nextInt();
        if(dist<800){
            System.out.println("O nadador ganhou R$5000");
        }else if(dist>=800 && dist<=1500){
            System.out.println("O nadador ganhou R$10000");
        }else{
            System.out.println("O nadador ganhou RS15000");
        }
    }
}
