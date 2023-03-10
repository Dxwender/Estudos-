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
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n,n2,m;
        Scanner num= new Scanner(System.in);
        
        System.out.println("Digite a primeira nota");
        n= num.nextInt();
        System.out.println("Digite a segunfa nota");
        n2= num.nextInt();
        m= (n+n2)/2;
        if (m>=7){
            System.out.println("Parabens ! Sua media foi"+m);
        }else{
        System.out.println("Sua media foi"+m);
      }
    }
  }
