/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_refeitos_C_List2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author dxwen
 */
public class Ex_01_lista_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner n = new Scanner (System.in); 
        int pos=0,i=0,cont=0;
        
        List <String>gabarito= new ArrayList();
        List <String>respostas= new ArrayList();
        
        System.out.println("Gabarito: "); 
       for(pos=0;pos<3;pos++){
           System.out.println("Digite a resposta da questao para o gabarito: "+(pos+1));
           gabarito.add(n.nextLine());
       }
       System.out.println("Gabarito: "+gabarito);
       for(i=0;i<3;i++){
           System.out.println("Digite a resposta da questao da prova : "+(i+1));
           respostas.add(n.nextLine());
       }
       for(i=0;i<3;i++){
         if(gabarito.get(i).equalsIgnoreCase(respostas.get(i))){
           cont++;  
         }  
       }
        System.out.println("Respostas:");
       for(i=0;i<respostas.size();i++){
         System.out.println("Questao"+(i+1)+" = "+respostas.get(i));
       }
        System.out.println("Voce acertou: "+cont); 
    }
}