/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos_2.Bloco_1;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float odo_ini,odo_fin,dif_odo,comb_gast,val_comb,val_tot,luc_dia,media;
        Scanner n= new Scanner (System.in);
        System.out.println("Digite o valor do odometro no comeco do dia: ");
        odo_ini= n.nextFloat();
        System.out.println("Digite o valo do odometro no final do dia: ");
        odo_fin= n.nextFloat();
        System.out.println("Digite o valor total em litros de combustivel gastos: ");
        comb_gast= n.nextFloat();
        System.out.println("Digite o valor do combustivel: ");
        val_comb= n.nextFloat();
        System.out.println("Digite o valor total arrecadado no dia de expediente: ");
        val_tot= n.nextFloat();
        
        dif_odo=odo_fin-odo_ini;
        media=dif_odo/comb_gast;
        luc_dia=val_tot-(comb_gast*val_comb);
        
        System.out.println("A media de consumo (Km/L): "+dif_odo);
        System.out.println("O lucro do dia foi: "+luc_dia);
        
    }
    
}
