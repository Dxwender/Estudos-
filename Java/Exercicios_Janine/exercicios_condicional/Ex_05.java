/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_condicional;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia,mes,ano;
        Scanner cond =new Scanner (System.in);
        System.out.println("Ola Digite o dia do seu aniversaio: ");
		dia=cond.nextInt();
		System.out.println("Ola Digite o mes do seu aniversaio: ");
		mes=cond.nextInt();
		System.out.println("Ola Digite o ano do seu aniversaio: ");
		ano=cond.nextInt();
                if(dia<31 && mes<12 && ano<2022){
			System.out.println("Sua data de nacimento e "+"Dia: "+dia+" Mes: "+mes+" Ano: "+ano );
			}else {System.out.println("invalido");
		}
            }
    }
