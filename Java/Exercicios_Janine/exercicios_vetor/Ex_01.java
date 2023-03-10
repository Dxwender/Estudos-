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
public class Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declarar bibiloteca e valores
        int pos,pos2,res;
        Scanner n = new Scanner(System.in);
//Declarar vetor
        int vetor[] = new int [5];
        int vetor2[] = new int [5];
        int vetorRes[]= new int[5];
//Digitar os valores primeiro e segundo vetor
    for (pos=0;pos<5;pos++){
        System.out.println("Digite o primeiro vetor");
            vetor[pos]= n.nextInt();
        }
        System.out.println("=================");
        
    for (pos2=0;pos2<5;pos2++){
        System.out.println("Digite o segundo vetor");
            vetor2 [pos2]= n.nextInt();
        }
//Exibir numeros digitados primeiro e segundo vetor    
         System.out.println("=======Primeiro Vetor==========");
    for (pos=0;pos<5;pos++){
        System.out.println(vetor[pos]+"");
        }
         System.out.println("========Segundo Vetor=========");
    for (pos2=0;pos2<5;pos2++){
        System.out.println(vetor2 [pos2]+"");
        }
/*Resulstado operaçao entre os 2 vetores    
        /*System.out.println("========Resultado=========");
                vetorRes[0]= vetor[0]*vetor2[0];
        System.out.println(vetor[0]+"*"+vetor2[0]+"="+vetorRes[0]);
                vetorRes[1]= vetor[1]*vetor2[1];
        System.out.println(vetor[1]+"*"+vetor2[1]+"="+vetorRes[1]);
                vetorRes[2]= vetor[2]*vetor2[2];
        System.out.println(vetor[2]+"*"+vetor2[2]+"="+vetorRes[2]);
                vetorRes[3]= vetor[3]*vetor2[3];
        System.out.println(vetor[3]+"*"+vetor2[3]+"="+vetorRes[3]);
                vetorRes[4]= vetor[4]*vetor2[4];
        System.out.println(vetor[4]+"*"+vetor2[4]+"="+vetorRes[4]);
            */


//Tentativa nao mostra o resultado 
        System.out.println("=============");
    /*for(res=0;res>=0 && res<5;res++){
        vetorRes[res]= vetor[res]*vetor2[res];
        System.out.println(vetor[res]+"*"+vetor2[res]+"="+vetorRes[res]);
       }
    */
 //Tentativa caiu em loop    
    /*for (res=0;res<5;res++){
        vetorRes[0]= vetor[0]*vetor2[0];
        System.out.println(vetorRes[0]+"");
            for (res=0;res<4;res++){
                vetorRes[1]= vetor[1]*vetor2[1];
                System.out.println(vetorRes[1]+"");
                    for (res=0;res<3;res++){
                        vetorRes[2]= vetor[2]*vetor2[2];
                        System.out.println(vetorRes[2]+"");
                          for (res=0;res<2;res++){
                               vetorRes[3]= vetor[3]*vetor2[3];
                               System.out.println(vetorRes[3]+"");
                                for (res=0;res==1;res++){
                                    vetorRes[4]= vetor[4]*vetor2[4];
                                    System.out.println(vetorRes[4]+"");
                       }
                    }
                }
            }
        }*/
    
    }
    
}
