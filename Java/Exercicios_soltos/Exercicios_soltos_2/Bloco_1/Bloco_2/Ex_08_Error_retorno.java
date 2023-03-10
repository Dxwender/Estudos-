/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos_2.Bloco_1.Bloco_2;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_08_Error_retorno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double id,sal;
        String nome,sexo,conf;
        
        Scanner num = new Scanner (System.in);
        Scanner nom = new Scanner (System.in);
        Scanner pqp = new Scanner (System.in);
        
        System.out.println("Quer comecar? S[Sim]/N[nao]");
        conf= nom.nextLine();
        
        while ("S".equals(conf)||"s".equals(conf)){
            
        System.out.println("Digite o seu nome: ");
        nome= pqp.nextLine();
        System.out.println("Digite sexo M ou F: ");
        sexo= nom.nextLine();

        if("M".equals(sexo) || "m".equals(sexo)){
            System.out.println("Digite a sua idade: ");
            id= num.nextInt();
            System.out.println("Digite o seu salario: ");
            sal= nom.nextFloat();
        
            if(id>=30){
                System.out.println("=======================");
                System.out.println("Nome: "+nome);
                System.out.println("Sexo: "+sexo);
                System.out.println("Idade: "+id);
                System.out.println("Salario antigo:"+sal);
                System.out.println("Novo salario: "+(sal+100));
                System.out.println("=======================");
            }else{
                System.out.println("=======================");
                System.out.println("Nome: "+nome);
                System.out.println("Sexo: "+sexo);
                System.out.println("Idade: "+id);
                System.out.println("Salario antigo:"+sal);
                System.out.println("Novo salario: "+(sal+50));
                System.out.println("=======================");
            }
        }else if("F".equals(sexo) || "f".equals(sexo)){
                    System.out.println("Digite a sua idade: ");
        id= num.nextInt();
        System.out.println("Digite o seu salario: ");
        sal= nom.nextFloat();
            if(id>=30){
                System.out.println("=======================");
                System.out.println("Nome: "+nome);
                System.out.println("Sexo: "+sexo);
                System.out.println("Idade: "+id);
                System.out.println("Salario antigo:"+sal);
                System.out.println("Novo salario: "+(sal+100));
                System.out.println("=======================");
            }else{
                System.out.println("=======================");
                System.out.println("Nome: "+nome);
                System.out.println("Sexo: "+sexo);
                System.out.println("Idade: "+id);
                System.out.println("Salario antigo:"+sal);
                System.out.println("Novo salario: "+(sal+50));
                System.out.println("=======================");
            }
        
         }
            System.out.println("S");
            conf= nom.nextLine();
        }
    } 
}
