/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_vetor;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int posi,qtd;
        
        Scanner n = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de nomes");
        qtd=n.nextInt(); 
        
        String vetor []= new String [qtd];
        
        for(posi=0;posi<qtd;posi++){
            System.out.println("Digite o nome numero: ");
            vetor[posi]=n.nextLine();
        }
        Arrays.sort(vetor);
        System.out.println("Os nomes sao: ");
            for(posi=0;posi<qtd;posi++){
            System.out.println(vetor[posi]+",");
        }
    }
 }
