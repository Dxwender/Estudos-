/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_vetor_2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_07_V {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pos;
        String pesq="";
        String vetor []= new String [3];
        Scanner n = new Scanner (System.in);
        for(pos=0;pos<3;pos++){
            System.out.println("Type: ");
            vetor[pos]=n.nextLine();
        }
       /* System.out.println("==DB==");
        for(pos=0;pos<3;pos++){
            System.out.println(vetor[pos]);
        } */
        System.out.println("====");
        System.out.println("Pesquisa");
            System.out.println("Digite o numero para pesquisa: ");
            pesq=n.nextLine();
        System.out.println("====");
        for(pos=0;pos<3;pos++){
            if(vetor[pos].equalsIgnoreCase(pesq)){
             System.out.println("O numero pesquisado e "+vetor[pos]); 
            }
        }
    }
}
               