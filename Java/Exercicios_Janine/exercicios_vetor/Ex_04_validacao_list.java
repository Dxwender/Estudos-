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
public class Ex_04_validacao_list {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarando variaveis e bibliotecas
        int posi=0,num;
        double reaj;
        Scanner n = new Scanner(System.in);
        
        //Colocando numero de salarios,valor do reajuste e tamanho do vetor
        System.out.println("=====Informacoes=====");
        System.out.println("Numero de salarios: ");
        num=n.nextInt();
        System.out.println("Valor do reajuste (%): ");
        reaj= n.nextFloat();
        reaj=reaj/100; 
        int vetor []= new int [num];
        System.out.println("======Salarios======");
        
        //Tentando validar os salarios 
        for(posi=0;posi<num;posi++){
            
          do{ 
            System.out.println("Digite o valor do sario numero: "+(posi+1));
            vetor[posi]= n.nextInt();  
              
          }while(vetor[posi]!=(-1));
            break;
              
            
                
             }
        System.out.println("=====Resultado=====");
            for(posi=0;posi<num;posi++){
            System.out.println("O lario numero "+(posi+1)+" teve o rajuste de "
                               +reaj+" e agora e "+(vetor[posi]+vetor[posi]*reaj)); 
        }
    }
}
        //Nao consegui colcoar a validaçao de -1