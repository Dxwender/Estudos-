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
public class Ex_07_lista_1_nao_finalizado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner n = new Scanner (System.in);
     Scanner l = new Scanner (System.in);
   //Variveis,Vetores e List's 
        int pos=0,qtd=0,num;
        String nom="",busc="";
     List Numeros = new ArrayList();
     List Nomes = new ArrayList();
        System.out.println("Digite a quantidade de contatos para sua agenda: ");
        qtd=n.nextInt();
   //Digitando informaçoes e processando dados
     for(pos=0;pos<qtd;pos++){
         System.out.println("Digite o nome: ");
         nom=l.nextLine();
         Nomes.add(nom);
         
         System.out.println("Digite o numero: ");
         num=n.nextInt();
         Numeros.add(num);
     }

        System.out.println("=-=-=-=-=-=");
        System.out.println("_Agenda_");
        System.out.println("Posi_________Nom_________Num");
   //Mostrando Banco de dados  
     for(pos=0;pos<qtd;pos++){
         System.out.println(pos+"_________"+Nomes.get(pos)+"_________"+Numeros.get(pos));
     }
   //Buscando dados
         System.out.println("=-=-=-=-=-=");
         System.out.println("Digite o nome para poder buscar o numero: ");
         busc=l.nextLine();
   
     for(pos=0;pos<qtd;pos++){         
      if(Nomes.get(pos).equals(busc)){
       System.out.println("O telefone de "+Nomes.get(pos)); 
           } 
         }
     
    }
    
}
                            //NAO CONSIGO BUSCAR STRINGS :(