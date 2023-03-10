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
public class Paralelo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int posi,qtd;
        Scanner n = new Scanner(System.in);
        System.out.println("Digite o tamanho");
        qtd = n.nextInt();
        int vetor []= new int[qtd];
        for(posi=0;posi<qtd;posi++){
            vetor[posi]=n.nextInt();
        }
        for(posi=0;posi<qtd;posi++){
            System.out.println(vetor[posi]);
        }
    }
    
}
