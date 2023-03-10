/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos_2.Bloco_1.Bloco_3;

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
        int cod,n1,n2,n3;
        Scanner n= new Scanner (System.in);
        System.out.println("Aluno digite o seu codigo ");
        cod= n.nextInt();
        while (cod!=0){
            System.out.println("Nota numero 1");
            n1=n.nextInt();
            System.out.println("Nota numero 2");
            n2=n.nextInt();
            System.out.println("Nota numero 3");
            n3=n.nextInt();
            System.out.println("A media foi: "+((n1+n2+n3)/3));
            System.out.println("==");
            System.out.println("Para parar digite |0| ou para outra media digite o seu codigo: ");
            cod=n.nextInt();
        }
    }
    
}
