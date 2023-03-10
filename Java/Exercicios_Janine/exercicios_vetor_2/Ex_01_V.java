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
public class Ex_01_V {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //Definido vairaveis 
    int posiAlun=0,qtdAlu,nota=0;//cont=1,resp2=0;
    String nome=" ";
    
    Scanner alu = new Scanner (System.in);
    Scanner nom= new Scanner(System.in);
    Scanner not= new Scanner (System.in);
    
  //Definindo vetores  
    System.out.println("Digite a quantidade de alunos na turma: ");
    qtdAlu=alu.nextInt();
    int vetorTurm[]= new int[qtdAlu];
    String nomeAlu[] = new String [qtdAlu];
    String matriAlu[] = new String [qtdAlu];
    //String resp[]= new String[10];
    
    String vetoResp1[]= new String[qtdAlu];
    String vetoResp2[]= new String[qtdAlu];
    String vetoResp3[]= new String[qtdAlu];
    String vetoResp4[]= new String[qtdAlu];
    String vetoResp5[]= new String[qtdAlu];
    String vetoResp6[]= new String[qtdAlu];
    String vetoResp7[]= new String[qtdAlu];
    String vetoResp8[]= new String[qtdAlu];
    String vetoResp9[]= new String[qtdAlu];
    String vetoResp10[]= new String[qtdAlu];

    System.out.println("===========");
  //Colhendo informaçoes e definindo condições
    for(posiAlun=0;posiAlun<qtdAlu;posiAlun++){
        System.out.println("Cadastro "+(posiAlun+1)+" de "+qtdAlu);
        System.out.println("____________");
        System.out.println("Digite o seu nome: ");
        nomeAlu[posiAlun]=nom.nextLine();
        
        System.out.println("Digite o seu numero de matricula: ");
        matriAlu[posiAlun]=nom.nextLine();
        
        System.out.println("XXXXXXXX");
        System.out.println("Gabarito: ");
        System.out.println("Digite a suas respostas em sequencia: (A-E)");
         System.out.print("1 - ");
        vetoResp1[nota]=nom.nextLine();
         System.out.print("2 - ");
        vetoResp2[nota]=nom.nextLine();
         System.out.print("3 - ");
        vetoResp3[nota]=nom.nextLine();
         System.out.print("4 - ");
        vetoResp4[nota]=nom.nextLine();
         System.out.print("5 - ");
        vetoResp5[nota]=nom.nextLine();
         System.out.print("6 - ");
        vetoResp6[nota]=nom.nextLine();
         System.out.print("7 - ");
        vetoResp7[nota]=nom.nextLine();
         System.out.print("8 - ");
        vetoResp8[nota]=nom.nextLine();
         System.out.print("9 - ");
        vetoResp9[nota]=nom.nextLine();
         System.out.print("10 - ");
        vetoResp10[nota]=nom.nextLine();
        
        /*resp[resp2]=not.nextLine();
        while(cont<=10 && cont>posiAlun){
            System.out.print(cont+" - ");
        resp[resp2]=not.nextLine();      
        cont++;   
        }*/
        
        
        System.out.println("------");
    }
        System.out.println("Foram informados "+qtdAlu+" alunos na turma.");
    System.out.println("=====Ficha======");  
  //Chequando dados
    for(posiAlun=0;posiAlun<qtdAlu;posiAlun++){
        System.out.println("Aluno numero :"+(posiAlun+1));
        System.out.println("Nome: "+nomeAlu[posiAlun]);
        System.out.println("Matricula: "+matriAlu[posiAlun]);
        System.out.println("Gabarito: ");
         System.out.println("1 - "+vetoResp1[nota]);
         System.out.println("2 - "+vetoResp2[nota]);
         System.out.println("3 - "+vetoResp3[nota]);
         System.out.println("4 - "+vetoResp4[nota]);
         System.out.println("5 - "+vetoResp5[nota]);
         System.out.println("6 - "+vetoResp6[nota]);
         System.out.println("7 - "+vetoResp7[nota]);
         System.out.println("8 - "+vetoResp8[nota]);
         System.out.println("9 - "+vetoResp9[nota]);
         System.out.println("10 - "+vetoResp10[nota]);
         
        System.out.println("------");
    }
  }   
}
