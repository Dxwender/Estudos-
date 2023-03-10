/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos_2.Bloco_1.Bloco_3;

/**
 *
 * @author dxwen
 */
public class Ex_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ze=1.1,chi=1.5;
        int cont=0;
        while(ze<=chi){
        ze=ze+0.03;    
        chi=chi+0.02;
        cont++;
        System.out.println(cont);
        }
    }
    
}
