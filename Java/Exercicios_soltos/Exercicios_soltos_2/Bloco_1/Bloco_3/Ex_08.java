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
public class Ex_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0,num=0,mai=0,men=0;
        Scanner n= new Scanner(System.in);
        while(cont<3){
            System.out.println("Digite o numero");
            num=n.nextInt();
                  if(num>mai){
                     mai=num; 
                     } 
                   if(num==0){
                     num=men;
            }else if(num<men){
                     men=num;
            }
          cont++;  
        }
        System.out.println("Maior: "+mai);
        System.out.println("Menor: "+men);
    }
}
