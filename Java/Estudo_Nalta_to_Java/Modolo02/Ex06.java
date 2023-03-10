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
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float dist;
      Scanner est= new Scanner(System.in);
      System.out.println("Viagens");
      System.out.println("=======================================");
      System.out.println("Viagens ate 200Km- R$0.5/KM");
      System.out.println("Viagens acima de  200km R$R$0.35");
      System.out.println("=======================================");
      System.out.println("Imforme a  distancia total em KM:");
      dist= est.nextInt();
      if(dist<200){
       System.out.println("O valor total de uma viagem de "+dist+" Km vai custar R$0.50\n"+"Valor Total: "+(dist*0.5));
      }else{
       System.out.println("O valor total de uma viagem de "+dist+" Km vai custar R$0.35\n"+"Valor Total: "+(dist*0.35));   
      }
    }
}
