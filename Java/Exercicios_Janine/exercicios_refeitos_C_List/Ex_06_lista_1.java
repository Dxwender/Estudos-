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
public class Ex_06_lista_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner L= new Scanner (System.in);
     Scanner N= new Scanner (System.in);
   //Variveis,Vetores e List's  
     int pos=0,qtd=0,pesq;
     String nome="";
     List listNom = new ArrayList();
       System.out.println("Digite a quantidade de nomes a serem digitados: ");
       qtd=N.nextInt();
        System.out.println("++++++++");  
    //Digitando informaçoes e processando dados    
     for(pos=0;pos<qtd;pos++){
        System.out.println("Digite o nome");
        nome=L.nextLine();
        listNom.add(nome);
     }
     //Mostrando vetor
        System.out.println("++++++++");
        System.out.println("Lista de nomes e posicoes");
     for(pos=0;pos<qtd;pos++){
        System.out.println(pos+"_"+listNom.get(pos));
     }
      //Mostrando busca de dados 
        System.out.println("++++++++");
        System.out.println(listNom);
     System.out.println("Digite o numero da posicao de a cordo a lista ");
     pesq=N.nextInt();
        System.out.println(listNom.get(pesq));
      
   }
}
