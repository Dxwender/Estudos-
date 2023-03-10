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
public class Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=1,id,id1=0,id2=0,id3=0,id4=0,id5=0;
        
        Scanner ida =new Scanner (System.in);
        
        while(cont<=15){
			System.out.println("Digite usa idade");
			id= ida.nextInt();
			if(id<=15){
					id1++;
				}else if (id>=16 && id<=30){
									id2++;
						}else if (id>=31 && id<=45) {
											id3++;
							}else if(id>=46 && id<=60){
												id4++;
									} else{
												id5++;
									}
		cont++;
		}
                System.out.println("menor 15: "+ id1+"\n");
		System.out.println("de 16 a 30: "+id2+"\n");
		System.out.println("de 31 a 45: "+id3+"\n");
		System.out.println("de 45 a 60: "+ id4+"\n");
		System.out.println("acima de  60: "+ id5+"\n");
            }
               
}
