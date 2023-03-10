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
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ano,ida,res=0;
        Scanner var = new Scanner(System.in);
        System.out.println("Ola digite o seu ano de nacimento: ");
        ano= var.nextInt();
        System.out.println("Ola digite o ano atual");
        ida= var.nextInt();
        res=ano-ida;
        System.out.println("==========================");
        System.out.println("Estamos no ano de "+ano+" e voce tem "+res+" ano de idade.");
        System.out.println("==========================");
        if(res>18){
            System.out.println("Voce deveria ter se alistado em "+(res+18)+"\nVoce esta atrasado "+((18+ano)-18)+"ano(s)");
        } else if(ida<18){
                System.out.println("Estamos em:"+ida+" e voce tem "+(ida-ano)+" de idade");
                System.out.println("Voce ainda nao completou 18 anos e isso vai acontecer em: "+(ano+18));
                System.out.println("Ainda faltam "+((ano+18)-ida)+" ano(s)");
        }else{
                    System.out.println("Estamos em: "+ida+" e voce tem 18 anos de idade");
                    System.out.println("Voce complata 18 anos nesse ano de "+ida+". Corra!");
        }
    }
    
}
