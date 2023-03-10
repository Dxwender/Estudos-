/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modolo02;
import java.util.Scanner;
//NAO_SEI_DECLARAR_BLIBOTECA_DE_DATA
/**
 *
 * @author dxwen
 */
public class Ex03_NAO_SEI_DECLARAR_BLIBOTECA_DE_DATA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anoatu,anonas,res=0;
        Scanner date= new Scanner(System.in);
        
        System.out.println("Digite o seu ano de nacimento");
        anonas= date.nextInt();
        System.out.println("Digite o ano que estamos");
        anoatu= date.nextInt();
        
        res=anoatu-anonas;
        
        System.out.println("Hoje em "+anoatu+" voce tem "+res+" certo?\n");
        System.out.println("======================\n");
        
        if(res>65){
            System.out.println("Seja bem vindo(a) ao banco!\n");
            System.out.println("Dirija-se a fila preferencial babaca\n");
                    }else{
            System.out.println("Seja bem vindo(a) babaca !");
    }
  }
    
}
