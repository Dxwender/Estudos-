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
public class Ex_03_duvida_virgula {

    /**
     * @param args the command line arguments
     * nao consigo digitar numeros com virgula
     */
    public static void main(String[] args) {
        float idade,altura,peso,cont=0,cont_peso=0,tot_idade=0;
        Scanner num= new Scanner(System.in);
        
        while (cont<=2){
			System.out.println("Digite sua idade: ");
			idade= num.nextInt();
			System.out.println("Digite sua altura: ");
			altura= num.nextInt();
			System.out.println("Digite seu peso: ");
			peso= num.nextInt();
				if(peso>90){
					cont_peso++;
				}
		tot_idade=idade+tot_idade;
		cont++;
		}
		System.out.println("\n");
		System.out.println("A quantidade de pessoas com mais de 90kg: "+cont_peso+"\n");
		System.out.println("A media de idade é: "+(tot_idade/251));
    }
    
}
