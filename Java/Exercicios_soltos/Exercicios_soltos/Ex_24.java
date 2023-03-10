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
public class Ex_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float n1,n2,n3,n4,media=0;
       Scanner n = new Scanner (System.in);
       
        System.out.println("Digite a primeira nota: ");
        n1 =n.nextFloat();
        System.out.println("Digite o segunda nota: ");
        n2 =n.nextFloat();
        System.out.println("Digite o terceira nota: ");
        n3 =n.nextFloat();
        System.out.println("Digite o quarta nota: ");
        n4 =n.nextFloat();
        media=(n1+n2+n3+n4)/4;
        
        if(media>=7){
            System.out.println("Sua media foi "+media+" Situacao: Aprovado!");
        }else if (media<7){
            System.out.println("Sua media foi "+media+" Situacao: Reprovado!");
        }
    }
    
}
