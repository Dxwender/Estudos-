/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos_2.Bloco_1.Bloco_2;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_01_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pop,ger,arqui,cad;
        Scanner n = new Scanner (System.in);
        System.out.println("Digite o numero de ingresos popularoes vendidos: ");
        pop= n.nextInt();
        System.out.println("Digite o numero de ingresos da geral vendidos: ");
        ger= n.nextInt();
        System.out.println("Digite o numero de ingresos de arquibancada vendidos: ");
        arqui= n.nextInt();
        System.out.println("Digite o numero de ingresos publicos vendidos: ");
        cad= n.nextInt();
        
        System.out.println("O total de arregademento de ingrelos populares foi: "+(pop*0.1)*5);
        System.out.println("O total de arregademento de ingrelos da geral foi: "+(ger*0.5)*10);
        System.out.println("O total de arregademento de ingrelos da arquibancada foi: "+(arqui*0.3)*20);
        System.out.println("O total de arregademento de ingrelos de cadeiraras foi: "+(cad*0.1)*30);
        System.out.println("O total de arregademento foi: "+((pop*0.1)*5)+((ger*0.5)*10)+((arqui*0.3)*20)+((cad*0.1)*30));
    }
    
}
