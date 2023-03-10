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
public class Ex_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jo,chi,ped,bol,r_jo=0,r_ped,r_bol,r2_bol;
        Scanner n = new Scanner (System.in);
        System.out.println("Digite os pontos de Joao: ");
        jo= n.nextInt();
        System.out.println("Digite os pontos de Chico: ");
        chi= n.nextInt();
        System.out.println("Digite os pontos de Pedro: ");
        ped= n.nextInt();
        System.out.println("Digite os pontos de Bola: ");
        bol= n.nextInt();
        r_jo=(chi/2)+(ped/2)+(bol/2);
        r_ped=bol*3;
        r_bol=ped/2;
        r2_bol=jo+chi;
        if(jo<r_jo || ped==r_ped || chi==0 || bol<=r_bol || bol<r2_bol){
            System.out.println("Equipe reprovada");
        }else{
            System.out.println("Equipe aprovada");
        }
        
    }
    
}
