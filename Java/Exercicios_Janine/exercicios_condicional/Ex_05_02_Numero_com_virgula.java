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
public class Ex_05_02_Numero_com_virgula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val_h = 0,qtd_h = 0,sal_b=0,sal_l=0,sind=0,inss=0,fgts=0,ir=0,desc=0;
        Scanner valh= new Scanner(System.in);
        Scanner qtdh= new Scanner(System.in);
        
                sal_b=val_h*qtd_h;
                ir=sal_b*(5/100);
		sind=sal_b*(3/100);
                inss=sal_b*(10/100);
                fgts=sal_b*(11/100);
		desc=inss+ir;
		sal_l=sal_b-(sind+inss+ir);
        
        System.out.println("Olá digite o valor de suas horas trabalhadas: ");
	val_h=valh.nextInt();
	System.out.println("Agora digite quantidade de horas trabalhadas: ");
	qtd_h=qtdh.nextInt();
        
		if (sal_b<=900){
				System.out.println("\nSalario bruto: "+sal_b);
				System.out.println("\nImposto de renda: Insento");
				System.out.println("\nSindicato: "+sind);
				System.out.println("\nInss: "+inss);
				System.out.println("\nFgts: "+fgts);
				System.out.println("\nTotal de desconto: "+desc);
				System.out.println("\nSalario liquido: "+sal_l);
		}else if (sal_b>900 && sal_b<=1500){
					System.out.println("\nSalario bruto: "+sal_b);
					System.out.println("\nImposto de renda: "+ir);
					System.out.println("\nSindicato: "+sind);
					System.out.println("\nInss: "+inss);
					System.out.println("\nFgts: "+fgts);
					System.out.println("\nTotal de desconto: "+desc);
					System.out.println("\nSalario liquido: "+sal_l);
		} else  if (sal_b>1500 && sal_b<=2500){
                                            System.out.println("\nSalario bruto: "+sal_b);
                                            System.out.println("\nImposto de renda: "+ir);
                                            System.out.println("\nSindicato: "+sind);
                                            System.out.println("\nInss: "+inss);
                                            System.out.println("\nFgts: "+fgts);
                                            System.out.println("\nTotal de desconto: "+desc);
                                            System.out.println("\nSalario liquido: "+sal_l);
			} else{             
                                                System.out.println("\nSalario bruto: "+sal_b);
                                                System.out.println("\nImposto de renda: "+ir);
                                                System.out.println("\nSindicato: "+sind);
                                                System.out.println("\nInss: "+inss);
                                                System.out.println("\nFgts: "+fgts);
                                                System.out.println("\nTotal de desconto: "+desc);
                                                System.out.println("\nSalario liquido: "+sal_l);
	}
    }
    
}
