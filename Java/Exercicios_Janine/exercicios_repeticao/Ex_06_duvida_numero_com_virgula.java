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
public class Ex_06_duvida_numero_com_virgula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cand=0,cand1=0,cand2=0,cand3=0,cand4=0,nulo=0,branco=0;
        
        Scanner op= new Scanner(System.in);
        
        		while (cand!=7){
			System.out.println("Eleição\n");
			System.out.println("1- candidato numero 1\n");
			System.out.println("2- candidato numero 2\n");
			System.out.println("3- candidato numero 3\n");
			System.out.println("4- candidato numero 4\n");
			System.out.println("5- Branco\n");
			System.out.println("6- Nulo\n");
			System.out.println("7- Apuração\n");
			System.out.println("====================\n");
			System.out.println("Seu voto: ");
			cand= op.nextInt();
			System.out.println("====================\n");
			if(cand==1){
				cand1++;
			}
			if(cand==2){
				cand2++;
			}
			if(cand==3){
				cand3++;
			}
			if(cand==4){
				cand4++;
			}
			if(cand==5){
				branco++;
			}
			if(cand==6){
				nulo++;
			}	
		}
		System.out.println("Votos canditato 1: "+cand1+"\n");
		System.out.println("Votos canditato 2: "+cand2+"\n");
		System.out.println("Votos canditato 3: "+cand3+"\n");
		System.out.println("Votos canditato 4: "+cand4+"\n");
		System.out.println("Votos em Branco: "+branco+"\n");
		System.out.println("Votos em Nulo: "+nulo+"\n");
		System.out.println("Percentual de votos nulos: "+((cand1+cand2+cand3+cand4)*0.1-(nulo*0.1))+"\n");
		System.out.println("Percentual de votos em branco: "+((cand1+cand2+cand3+cand4)*0.1-(branco*0.1)));
        
    }
    
}