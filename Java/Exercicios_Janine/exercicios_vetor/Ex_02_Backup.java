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
public class Ex_02_Backup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Declarando vairaveis e biblioteca    
        int qtdNotas,posiNotas,somNotas=0,maior=0,menor=0;
        double media;
        Scanner n = new Scanner (System.in);
    // Setando o tamanho do vetor    
        System.out.println("Digite a quantidade de notas cadastradas: ");
        qtdNotas=n.nextInt();
        int vetor[]= new int[qtdNotas];
        int vetormen[]= new int[qtdNotas];
        int vetormai[]= new int[qtdNotas];
        
        System.out.println("====================");
    // Insereindo o tamanho do vetor
        for(posiNotas=0;posiNotas<qtdNotas;posiNotas++){
            
            System.out.println("Digite a nota numero "+(posiNotas+1));
            vetor[posiNotas]= n.nextInt();
            /*if(posiNotas<menor){
                menor=posiNotas;
            }else if(posiNotas==0){
                     menor=posiNotas;
            }else{
                posiNotas=maior;
            }*/
            somNotas= somNotas+vetor [posiNotas];  
        }
        // Insereindo os valores do vetor
        System.out.println("==========");
        System.out.println("Foram digitados "+qtdNotas+" notas.");
        System.out.println("Essas foram: ");
        for(posiNotas=0;posiNotas<qtdNotas;posiNotas++){
            System.out.println("A nota numero "+(posiNotas+1)+" foi "+vetor[posiNotas]);
        }
        // Mostrando a media
        System.out.println("==========");
        System.out.println("Sua mediea e: ");
        media=somNotas/qtdNotas;
        System.out.println(media);
        // Tentando mostrar as notas maiores
        System.out.println("==========");
        System.out.println("O conjunto de notas menores que a mediea e: ");
        for(posiNotas=0;posiNotas<qtdNotas;posiNotas++){
            if(vetor[posiNotas]<vetormen[qtdNotas]){
                vetormen[qtdNotas]=vetor [posiNotas];
            }else if(vetor[posiNotas]==0){
                vetor [posiNotas]=vetormai[qtdNotas];
            }else{
                vetormen[qtdNotas]=vetor [posiNotas];
            }
        }
        System.out.println(vetormai[qtdNotas]);
    }
    
}
