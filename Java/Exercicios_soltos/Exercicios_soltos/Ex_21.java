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
public class Ex_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float alt=0,pes=0,imc;
        Scanner n = new Scanner (System.in);
        
        System.out.println("Digite seu peso em (KG): ");
        pes= n.nextFloat();
        System.out.println("Digite sua  altura: ");
        alt= n.nextFloat();
        
        imc=pes/(alt*alt);
        System.out.println("Seu imc e de: "+imc);
        
            if(imc<18.5){
                System.out.println("Voce tem : Magreza");
            }else if (imc>=18.5 && imc<24.9){
                System.out.println("Voce tem : Normal");
            }else if (imc>=25 && imc<29.9){
                System.out.println("Voce tem : Sobrepeso");
            }else if (imc>=30 && imc<39.9){
                System.out.println("Voce tem : Obesidade");
            }else{
                System.out.println("Voce tem : Obesidade Grave");
            }
        
    }
    
}
