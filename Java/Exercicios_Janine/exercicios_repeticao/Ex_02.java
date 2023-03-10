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
public class Ex_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=1,vis=0,pra=0,cont_vist=0,tot_vist=0,cont_pra=0,tot_pra=0;
        String T;
        Scanner num = new Scanner(System.in);
        Scanner let = new Scanner (System.in);
                while (cont<=15){
			System.out.println("Digite V para transacoes a vista ou P para transasoncoes a praso: ");
			T= let.nextLine();
			if (T.equals("V") || T.equals("v")){
				System.out.println("Digite o Valor a Vista: ");
                                cont_vist=num.nextInt();
				tot_vist=cont_vist+tot_vist;
				vis++;
			}else if (T.equals("P") || T.equals("p")){
					System.out.println("Digite o Valor a Praso: ");
					cont_pra= num.nextInt();
				tot_pra=cont_pra+tot_pra;
				pra++;
			} else {System.out.println("Error\n");
                        }
		cont++;	
		}
		System.out.println("\n O total do numero de compras a Vista sao:"+ vis+"\n");
		System.out.println("\n O valor total de compras a Vista sao:"+tot_vist+"\n");
		System.out.println("\n O total do numero de compras a Praso sao: "+ pra+"\n");
		System.out.println("\n O valor total de compras a Praso sao:"+tot_pra+"\n");
		System.out.println("\n O total dos valores das compra a Praso ea Vista sao: "+(tot_pra+tot_vist) );
    }
    
}
