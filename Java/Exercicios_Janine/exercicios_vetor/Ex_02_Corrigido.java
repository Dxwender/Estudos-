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
public class Ex_02_Corrigido {
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
   // Declarando vairaveis e biblioteca    
        int qtdNotas,posiNotas,somNotas=0;//maior=0,menor=0;
        double media;
        String maiorVal="",menorVal="";
        Scanner n = new Scanner (System.in);
   // Setando o tamanho do vetor    
        System.out.println("Digite a quantidade de notas cadastradas: ");
        qtdNotas=n.nextInt();
        int vetor[]= new int[qtdNotas]; 
        System.out.println("====================");
   // Insereindo o valores do vetor
        for(posiNotas=0;posiNotas<qtdNotas;posiNotas++){
            System.out.println("Digite a nota numero "+(posiNotas+1));
            vetor[posiNotas]= n.nextInt();
            somNotas= somNotas+vetor[posiNotas];  
        }
   // Mostrando os valores do vetor
        System.out.println("=====================");
        System.out.println("Foram digitados "+qtdNotas+" notas.");
        System.out.println("Essas foram: ");
        for(posiNotas=0;posiNotas<qtdNotas;posiNotas++){
            System.out.println("A nota numero "+(posiNotas+1)+" foi "+vetor[posiNotas]);
        }
   // Mostrando a media
        System.out.println("=====================");
        System.out.println("Sua media da turma e: ");
        media=somNotas/qtdNotas;
        System.out.println(media);
   // Comparando os elementos do vetor com a media
        System.out.println("=====================");
        for(posiNotas=0;posiNotas<qtdNotas;posiNotas++){
            if(vetor[posiNotas]>media){
                maiorVal=maiorVal+vetor[posiNotas]+" ";
            } else if(vetor[posiNotas]<media){
                menorVal=menorVal+vetor[posiNotas]+" ";
            }
        }
        System.out.println("As maiores notas acima da media sao: ");
        System.out.println(maiorVal);
        System.out.println("As menores notas acima da media sao: ");
        System.out.println(menorVal);
        System.out.println("=====================");
    }
}