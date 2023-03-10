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
public class Ex_13_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num,num2,rep_c,rep_d,rep_t;
        Scanner n= new Scanner(System.in);
        System.out.println("Turma C de 60 alunos reprovaram? ");
        num= n.nextInt();
        System.out.println("Turma D de 20 alunos aprovaram? ");
        num2= n.nextInt();
        rep_c=((num*60)/100);
        rep_d=(20-(num2*20)/100);
        rep_t=((rep_d+rep_d)*100)/80;
        System.out.println("O numero de reprovados da turma C e: "+rep_c);
        System.out.println("O numerdo de aprovados na turma D e: "+rep_d);
        System.out.println("O numero total de reprovados e "+rep_t);
    }
    
}
