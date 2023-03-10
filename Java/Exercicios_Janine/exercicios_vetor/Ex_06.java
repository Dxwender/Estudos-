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
public class Ex_06 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Variaveis,biliotecas e vetores
    int posi=0,qtdPosi,cont=0,busc;
    
     Scanner n = new Scanner (System.in);
     Scanner nom= new Scanner (System.in);
     
     System.out.println("Digite a quantidade de nomes a serem digitados: ");
     qtdPosi=n.nextInt(); 
     System.out.println("==Inserindo os nomes==");
     String vetorposi [] = new String [qtdPosi];
            /*
        nao usei e nao sei pq fiz kkkk
        int vetorposi2 []= new int [qtdPosi]; 
            */
   // Validando e inserindo informaçãoes
     for(posi=0;posi<qtdPosi;posi++){
         System.out.println("Digite o nome numero "+(posi+1));
         vetorposi[posi]= nom.nextLine();
         //vetorposi2[posi]=cont++;
     }
   // Mostrando resultados 
        System.out.println("==Pequeno banco de dados  de nomes==");
     for(posi=0;posi<qtdPosi;posi++){
         System.out.println(posi+" - "+vetorposi[posi]);
     }
        System.out.println("==Digite o numero da posicao do nome de acordo com o banco de dados==");
        //System.out.println(cont);
        busc= n.nextInt();
        System.out.println("=======");
        System.out.println("O nome buscado foi: ");
        System.out.println(vetorposi[busc]);
    }
    
}
