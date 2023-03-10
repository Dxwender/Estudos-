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
public class Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int cont=0,id=0,med_m=0,med_f=0,f=0,m=0,tot_f=0,tot_m=0,maior=0,menor=0;
         String s;
         Scanner leia=new Scanner(System.in);
         Scanner leia2=new Scanner(System.in);
         while (cont<=3){
             System.out.println("Ola digite F para feminino e M para Masculino:");
             s=leia.nextLine();
                if (s.equals("F") || s.equals("f")){
                        System.out.println("Digite a  sua  idade:");
					id=leia2.nextInt();
					med_f=med_f+id;
					f++;
					tot_f=med_f/f;
                        }else if (s.equals("M") || s.equals("m")){
						System.out.println("Digite a  sua  idade: ");
						id=leia2.nextInt();
						med_m=med_m+id;
						m++;	
						tot_m=med_m/m;		
					} else {
						System.out.println ("erro");
				}
                if(id>maior){
                    maior=id;
                }
                if(menor==0){
                    menor=id;
                } else {
                    if(id<menor){
                        menor=id;
                    }
                }
			cont++;
          }
		System.out.println ("\nA media de idade do grupo e : "+((med_f+med_m)/(f+m)));
		System.out.println ("\nA media de idade das mulheres e : "+tot_f);
		System.out.println ("\nA media de idade dos homens e : "+tot_m);
                
		System.out.println("\nA menor idade informada foi : "+menor);
		System.out.println("\nA maior idade informada foi : "+maior);
         
    }   
}