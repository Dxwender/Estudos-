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
public class Ex_08_lista_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner n = new Scanner (System.in);
      int pos=0,vol=0,mais=0,menos=0,soma=0,media=0;
      List <Integer> volume = new ArrayList();
      List <Integer> menor = new ArrayList();
      List <Integer> maior = new ArrayList();
      
      for(pos=0;pos<7;pos++){
          System.out.println("Digite o volume do "+(pos+1)+" dia.");
          vol=n.nextInt();
          volume.add(vol);
          soma=soma+vol;
          media=soma/7;
      }
        System.out.println("=======");
      for(pos=0;pos<7;pos++){
          System.out.println("O volume do dia "+(pos+1)+" foi: "+volume.get(pos));
       if(vol==0){
         menos=vol;
         menor.add(menos);
       }
       if(vol>mais){
          mais=vol;
          maior.add(mais);
       }else
       if(vol<menos){
          menos=vol;
          menor.add(menos);
       }
      }
        System.out.println("=-=-=-=-=-=-");
        System.out.println("Mais: "+maior);
        System.out.println("Menos: "+menos);
        System.out.println("Soma: "+soma);
        System.out.println("Media: "+media);
    }
    
}
