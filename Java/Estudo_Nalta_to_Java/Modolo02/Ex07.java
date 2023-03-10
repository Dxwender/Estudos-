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
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float dist=0;
        Scanner bus= new Scanner(System.in);
        System.out.println("Viacao");
        System.out.println("===================================");
        System.out.println("Viagens ate 200km: R$0.50/Km");
        System.out.println("Viagens acima 200km: R$0.35");
        System.out.println("===================================");
        System.out.println("Informe a distancia total");
        dist= bus.nextInt();
        if(dist<200){
            System.out.println("O valor total de uma viagem de"+dist+"Km vai custar R$0.50");
            System.out.println("Valor total:"+(dist*0.50));
        }else{
            System.out.println("O valor total de uma viagem de"+dist+"Km vai custar R$0.35");
            System.out.println("Valor total:"+(dist*0.35));
        }
        
    }
}
