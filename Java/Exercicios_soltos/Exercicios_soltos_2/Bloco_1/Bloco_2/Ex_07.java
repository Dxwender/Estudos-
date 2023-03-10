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
public class Ex_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int com,beb,bau=1,x_gal=2,piz=3,gua=4,agu=5,vin=6;
        Scanner n= new Scanner(System.in);
        System.out.println("Comida: ");
        System.out.println("Digite 1-Bauru");
        System.out.println("Digite 2-X_Galinha");
        System.out.println("Digite 3-Pizza");
        System.out.println("Bebida: ");
        System.out.println("Digite 4-Guarana");
        System.out.println("Digite 5-Agua");
        System.out.println("Digite 6-Vinho");
        System.out.println("Digite a comida: ");
        com=n.nextInt();
        System.out.println("Digite a bebida: ");
        beb=n.nextInt();
        if(com==1 && beb==4 || x_gal==2 && beb==5 || piz==4 && beb==6){
            System.out.println("Erro");
        }else{
            System.out.println("Aprovado");
        }
    }
    
}
