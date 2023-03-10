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
public class Ex_03_lista_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num= new Scanner (System.in);
        Scanner let= new Scanner (System.in);
    //Variaveis/vetores e lit's    
        int pos=0,qtd=0,soma=0,media=0;
        System.out.println("Digite a quantidade de alunos desejado: ");
        qtd=num.nextInt();
        int vetorNotas[]=new int[qtd];
        String vetorNomes[]=new String[qtd];
        List listaMaior = new ArrayList();
        List listaMenor = new ArrayList();
        List listaIgual = new ArrayList(); 
    //Colhendo e processando informaçoes     
        System.out.println("========");
        for(pos=0;pos<qtd;pos++){
            System.out.println("Digite o nome do aluno[a]: ");
            vetorNomes[pos]=let.nextLine();
            System.out.println("Digite a nota do[a] aluno[a] "+vetorNomes[pos]);
            vetorNotas[pos]=num.nextInt();
            System.out.println("_-_-_-_");
            soma=soma+vetorNotas[pos];
            media=soma/qtd;
        }
    //Comparando informaçoes    
        System.out.println("=======");
        System.out.println("Nomes e notas");
        for(pos=0;pos<qtd;pos++){
            System.out.println("O aluno[a] "+vetorNomes[pos]+" obeteve a nota "+vetorNotas[pos]);
        }
        for(pos=0;pos<qtd;pos++){
          if(media<vetorNotas[pos]){
             listaMenor.add(vetorNomes[pos]); 
             listaMenor.add(vetorNotas[pos]);
             
                } else if (media>vetorNotas[pos]){
                      listaMaior.add(vetorNomes[pos]);  
                      listaMaior.add(vetorNotas[pos]);
                      
                   } else {
                           listaIgual.add(vetorNomes[pos]); 
                           listaIgual.add(vetorNotas[pos]);
                            
                                                           }
        }
    //Mostrando dados processados    
        System.out.println("=======");
        System.out.println("A media da turma foi: "+media);
        System.out.println("=======");
        System.out.println("O[s] aluno[s] acima  da media da turma : "+listaMenor);
        System.out.println("O[s] aluno[s] abaixo da media da turma : "+listaMaior);
        System.out.println("O[s] aluno[s] igual  a  media da turma : "+listaIgual);
    }
}
