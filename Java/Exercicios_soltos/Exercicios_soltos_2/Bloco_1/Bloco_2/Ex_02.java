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
public class Ex_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double comb,dist_l;
        Scanner n = new Scanner (System.in);
        System.out.println("Digite em Litros quantidade de combustivel abestecido no veiculo: ");
        comb= n.nextDouble();
        System.out.println("Digite em KM a distancia que o altomovel percorre por litros: ");
        dist_l= n.nextDouble();
        System.out.println("A distancia percorrida sera de  aproximadamente :"+comb*dist_l+"Km/L");
    }
    
}
