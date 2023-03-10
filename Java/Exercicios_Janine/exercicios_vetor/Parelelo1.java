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
public class Parelelo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int posi,qtdEl;
        Scanner n = new Scanner(System.in);
        System.out.println("Digite");
        qtdEl= n.nextInt();
        System.out.println("====");
        int vetor [] = new int [qtdEl];
        for(posi=0;posi<qtdEl;posi++){
            System.out.println("Valor");
            vetor[posi]=n.nextInt();
            
        }
        System.out.println("====");
        for(posi=0;posi<qtdEl;posi++){
            
            System.out.println(vetor[posi]);
        }
    }
    
}
