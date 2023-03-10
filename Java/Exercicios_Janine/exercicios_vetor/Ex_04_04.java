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
public class Ex_04_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sal=0,cont=0,cont2=0;
        double reaj;
        
        Scanner n = new Scanner (System.in);
        System.out.println("Forneca o valor do reajuste em (%):");
        reaj=n.nextInt();
        reaj=reaj/100;
        //System.out.println("Digite o salario: ");
        //sal=n.nextInt();
        int vetor[]= new int[cont2];
        while(sal!=(-1)){
           System.out.println("Digite o salario: ");
            vetor[sal]=n.nextInt();
            cont++;
        }
        cont=cont2;
    }
    
}
