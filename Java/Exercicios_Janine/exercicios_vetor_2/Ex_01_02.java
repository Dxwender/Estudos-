/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_vetor_2;

import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_01_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leitura = new Scanner (System.in);
       Scanner numero = new Scanner (System.in);
    int qtdAlunos=0,questaoCerta=0;
    String respAluno;
    //Colanndo o vetor do gabarito  
        String gabarito []= new String [3];
    //Colhendo informaçoes    
        System.out.println("Digite o seu gabarito: ");     
    for(int pos=0;pos<3;pos++){
        System.out.println("Digite a resposta da questao "+(pos+1));
         gabarito[pos]=leitura.nextLine();
        }
    //Tamanho do vetor de alunos
        System.out.println("Digite a quantidade  de  alunos");
        qtdAlunos=numero.nextInt();
    for(int i=0;i<qtdAlunos;i++){
        System.out.println("Aluno"+(i+1));
        for(int j=0;j<3;j++){
            System.out.println("Digite a sua resposta da questao"+(j+1));
            respAluno=leitura.nextLine();
                if(respAluno.equals(gabarito[j])){
                   questaoCerta++; 
                }
            }
        System.out.println("Voce acertou "+questaoCerta+" questoes.");
        }
    }
    
}
