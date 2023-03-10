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
public class Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Variaveis e bilbilotecas
        int iniVet,qtdAlu;
            //iniVet= posiçao inicial do vetor
            //qtdAlu= tamanho do vetor
        double media,somNot=0;
            //media= media da turma
            //somNot= soma das notas dos alunos
        String maiorNot=" ",menorNot=" ";
            //maiorNot= agrupamento nome e valores maior que a media
            //menorNot= agrupamento nome e valores abaixo da  media
        Scanner n = new Scanner (System.in);
        Scanner nom= new Scanner(System.in);
    //Adicionando o tamanho do veotor
        System.out.println("Digite a quantidade de alunos");
        qtdAlu= n.nextInt();
        System.out.println("=====");
    //Vetores
        int vetorNotas [] = new int[qtdAlu];
        //vetor Notas
        String vetorNomes[] = new String[qtdAlu];
        //vetor Nomes
    //Incerir as notas e  nomes
        for(iniVet=0;iniVet<qtdAlu;iniVet++){
            System.out.println("Digite o nome do aluno "+(iniVet+1));
            vetorNomes[iniVet]= nom.nextLine();
            System.out.println("Digite a nota do aluno "+(iniVet+1));
            vetorNotas [iniVet]= n.nextInt();
            System.out.println("=====");
         //soma de notas 
            somNot=somNot+vetorNotas[iniVet];
        }
    //Mostrar os nomes e notas dos alunos   
         for(iniVet=0;iniVet<qtdAlu;iniVet++){
            System.out.println("O aluno :"+vetorNomes[iniVet]+" obeteve nota :"+vetorNotas[iniVet]);
        }
            System.out.println("=====");
    //Mostrar media
        media=somNot/qtdAlu;
        System.out.println("A media  da  tumra e :"+media);
        System.out.println("=====");
    // Comparando valores do votor com a media mostrar nome e nota
        for(iniVet=0;iniVet<qtdAlu;iniVet++){
            if(vetorNotas[iniVet]>=media){
                maiorNot = maiorNot+vetorNomes[iniVet]+" "+vetorNotas[iniVet]+" , ";
                //maiorNot=maiorNot+vetorNotas[iniVet]+" ";
            } else if(vetorNotas[iniVet]<media){
                menorNot = maiorNot+vetorNomes[iniVet]+" "+vetorNotas[iniVet]+" , ";
                //menorNot=menorNot+vetorNotas[iniVet]+" ";
            }
        }
        System.out.println("Resultados");
        System.out.println("As notas acima da media da turma sao: ");
        System.out.println(maiorNot);
        System.out.println("As notas abaixo da media da turma sao: ");
        System.out.println(menorNot);
        System.out.println("=====================");
    }
    
}
