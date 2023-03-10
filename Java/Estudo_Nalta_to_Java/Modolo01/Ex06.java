/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modolo01;
import java.util.Scanner;
/**
 *
 * @author dxwen
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float m;
        Scanner conv= new Scanner(System.in);
        
        System.out.println("Digite a medida em metros");
        m= conv.nextInt();
        
        System.out.println("\n-----Convertendo-----");
	System.out.println("\n"+m/1000+" KM\n");
	System.out.println("\n"+m/100+" HM\n");
	System.out.println("\n"+m/10+" DAM\n");
	System.out.println("\n"+m*10+" DM\n");
	System.out.println("\n"+m*100+" CM\n");
	System.out.println("\n"+m*1000+" MM\n");
    }
    
}
