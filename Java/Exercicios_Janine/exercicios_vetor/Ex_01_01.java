/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_vetor;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_01_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pos1=0,pos2=0,pos3=0,qtd;
        Scanner n = new Scanner (System.in);
        Scanner m = new Scanner (System.in);
        Scanner l = new Scanner (System.in);
        System.out.println("Digite a quantidade de numeros");
        qtd=n.nextInt();
        
        int vetor1 []= new int[qtd];
        int vetor2 []= new int[qtd];
        int vetor3 []= new int[qtd];
        
        System.out.println("===");
        for(pos1=0;pos1<qtd;pos1++){
            System.out.println("Vetor 1 :Digite o numero "+pos1+" de "+qtd);
                vetor1[pos1]=n.nextInt();
        }
        System.out.println("===");
        for(pos2=0;pos2<qtd;pos2++){
            System.out.println("Vetor 2 :Digite o numero "+pos2+" de "+qtd);
            vetor2[pos2]=m.nextInt();
        }
        
        System.out.println("===");
        for(pos3=0;pos3<qtd;pos3++){
             vetor3[pos3]=vetor2[pos3]*vetor1[pos3];
                System.out.println("===");
        System.out.println("Os resultados foram:");
        System.out.println(vetor3[pos3]);
        }
    }
}
