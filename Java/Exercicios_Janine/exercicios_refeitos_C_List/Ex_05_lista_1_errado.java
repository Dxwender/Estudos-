/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_refeitos_C_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_05_lista_1_errado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n= new Scanner (System.in);
        int pos=0,num,qtd;
        List Numeros = new ArrayList();
        System.out.println("Digite a quantidade de numeros ");
        qtd=n.nextInt();
        for(pos=0;pos<qtd;pos++){
            System.out.println("Digite os valores: ");
            num=n.nextInt();
            Numeros.add(num);
        }
        System.out.println("-=-=-=-=-=");
        for(pos=qtd-1;pos>=0;pos--){
            System.out.println(Numeros);
        }
        
    }
    
}
