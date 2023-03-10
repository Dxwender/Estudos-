/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_repeticao;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_09 {

    /**
     * @param args the command line arguments
     * 
     * Arrumar um jeito de subtrair a senha pelo numero digitado do segundo jogador e comparar se  ele é maior ou menor
     */
    public static void main(String[] args) {
        int senha=0,num=0,dif=0,cont=1;
        boolean acertou=false;
        String conf;
        
        
        Scanner pass= new Scanner(System.in);
        Scanner numero= new Scanner(System.in);
        Scanner cond = new Scanner (System.in);
        System.out.println("Quer começar?");
        conf= cond.nextLine();
        
        
 while(conf.equals("S")|| conf.equals("s")){
        System.out.println("Jogador 1 digite a sua senha: ");
        senha=pass.nextInt();
        System.out.println(".\n");
        System.out.println(".\n");
        System.out.println(".\n");
        System.out.println(".\n");
        System.out.println(".\n");
        System.out.println(".\n");
        System.out.println(".\n");
        
    while(cont<=5){
        if(senha>=0 && senha<=100){
           System.out.println("Jogador 2 tente a sorte!");
           num=numero.nextInt();
            }
        dif=senha-num;
        if(num==senha){
            acertou=true;
           System.out.println("Acertou pois o valor e igual");
                   System.out.println("=====");
                    break; 
        }else {
          acertou=false;  
        }
        if(dif<1){
            System.out.println("Quente.");
        }else {
            System.out.println("Quente.");
        }
        
        if(num>senha){
             System.out.println("O valor e menor.");
             System.out.println("=====");
        }else if(num<senha){
                    System.out.println("O valor e maior");
                    System.out.println("=====");
                }//else{
                   // System.out.println("Acertou pois o valor e igual");
                   // System.out.println("=====");
                   // break;
                //}
                cont++;    
            }
      System.out.println("contador: "+ cont); 
      System.out.println("Quer recomecar?");
            conf= cond.nextLine();
      if(conf.equals("S")|| conf.equals("s")){
          cont=1;
          }      
       }
    }
}
