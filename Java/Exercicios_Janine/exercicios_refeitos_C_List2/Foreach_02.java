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
public class Foreach_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
     int contImp=0,contPar=0;
      List <Integer> num= new ArrayList();
      List <Integer> par= new ArrayList();
      List <Integer> impar= new ArrayList();
        for(int pos=0;pos<5;pos++){
           System.out.println("Digite os numeros");
           num.add(n.nextInt());
        }
        for(Integer list : num ){
            if(list%2==0 && num.contains(list)){
                contPar++;
                //par.add();
            }else {
                contImp++;
                impar.contains(list);
            }
        }
        
        System.out.println("Lista de numeros :"+num);
        System.out.println("Par contagem: "+contPar);
        System.out.println("Lista pare's"+ par);
        System.out.println("Impar contagem: "+contImp);
        System.out.println("Lista impare's"+ impar);
    }
    
}
