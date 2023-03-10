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
public class Ex_07_adulterado {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int posi=0,nom=0;
        String busca="";
        
        String vetornome[]= new String [2];
        int vetornum[]=new int[2];
        
        Scanner n= new Scanner(System.in);
        Scanner num= new Scanner(System.in);
        
        for(posi=0;posi<2;posi++){
         System.out.println("Digite o nome: ");  
         vetornome[posi]= n.nextLine();
            System.out.println("Digite o numero do telefone: ");
            vetornum[posi]= num.nextInt();
        }
            System.out.println("Digite o nome desejado :");
            busca = n.nextLine();
        for(posi=0;posi<2;posi++){
            // dar uma olhada  abaixo
            if(vetornome[posi].equalsIgnoreCase(busca)){
             System.out.println("O telefone de "+vetornome[posi]+" e "+ vetornum[posi]); 
                }
            
       }
    } 
}
