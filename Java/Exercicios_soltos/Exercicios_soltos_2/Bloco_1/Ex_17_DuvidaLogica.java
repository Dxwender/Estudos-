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
public class Ex_17_DuvidaLogica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num_A,tur_a,tur_b,tur_c;
        Scanner n= new Scanner (System.in);
        System.out.println("Digite o numero de alunos da turma: ");
        num_A =n.nextInt();
        
        tur_a= num_A/3;
        num_A -= tur_a;
        
        tur_b= num_A/3;
        num_A -= tur_b;
        
        tur_c =num_A;
        
        System.out.println("Turma A: "+tur_a);
        System.out.println("Turma B: "+tur_b);
        System.out.println("Turma C: "+tur_c);
    }
    
}
