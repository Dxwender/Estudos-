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
public class Ex_05 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pos,qtd;
        
        Scanner n= new Scanner (System.in);
       
        System.out.println("Digite a quantidade de numeros: ");
        qtd= n.nextInt();
        
        //vetor
        int vetor []= new int[qtd];
        
        System.out.println("Digite os numeros");
        for (pos=0; pos < qtd; pos++){         
                vetor[pos]=n.nextInt();
            }
        System.out.println("======Invertendo=======");
       //Tentando inverter
        for (pos=qtd-1; pos >= 0; pos--){         
                System.out.println(vetor[pos]);
            }
           }
          }
            //Nao consegui organizar um numero inderterminado usando for ou while