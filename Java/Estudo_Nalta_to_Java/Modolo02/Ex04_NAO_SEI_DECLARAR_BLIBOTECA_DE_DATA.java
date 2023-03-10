/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modolo02;
import java.util.Scanner;
/**
 *
 * @author dxwen
 */
public class Ex04_NAO_SEI_DECLARAR_BLIBOTECA_DE_DATA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anoatu,anonasc,ali;
        Scanner ano= new Scanner(System.in);
        System.out.println("Ola em que ano voce nasceu: ");
        anonasc= ano.nextInt();
        System.out.println("Ola digite o ano atual: ");
        anoatu= ano.nextInt();
         ali=anoatu-anonasc;
         
         System.out.println("\n========Resultado===========\n");
         System.out.println("Sua idade e: "+ali+"\n");
         if(ali<18){
             System.out.println("Voce nao pode se alistar\n");
         }else{
             if(ali>18){
                 System.out.println("Voce deveria ter se alistado\n");
                 
             }else{
                 System.out.println("Voce tem que se alistar esse ano.\n");
             }
             
             
             
         }
        
        
        
    }
    
}
