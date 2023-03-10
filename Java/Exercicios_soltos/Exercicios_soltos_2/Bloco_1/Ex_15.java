/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios_soltos_2.Bloco_1;
import java.util.Scanner;

/**
 *
 * @author dxwen
 */
public class Ex_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double num_empg,val_sal,pre_bike,num_bike,desc_bike=0,tot_vendbike=0,cont=1,comi_fum,sal_fum,som_sal=0,som_vend=0,luc_bike=0,som_lu=0,som_desc=0,luc_lic=0;
      Scanner n= new Scanner (System.in);
      
        System.out.println("Digite o numero de empregados: ");
        num_empg= n.nextFloat();

        while(cont<=num_empg){
            System.out.println("Empregado Numero "+cont);
            System.out.println("Digite o valor do seu salario: ");
            val_sal= n.nextFloat();
            val_sal= val_sal*2;
            
            System.out.println("Digite o preco da bike: ");
            pre_bike= n.nextFloat();
            
            desc_bike= pre_bike-(pre_bike*0.5);
            comi_fum= desc_bike-(desc_bike-(desc_bike*0.15));
            
            System.out.println("Digite o numero de bikes vendidas: ");
            num_bike= n.nextFloat();
            tot_vendbike=num_bike*comi_fum;
            
            sal_fum= val_sal+tot_vendbike;
            System.out.println("Seu salario final e "+sal_fum);
            luc_bike=pre_bike-desc_bike-comi_fum;
            
            som_sal=som_sal+sal_fum;
            //som_vend=som_vend+pre_bike;
            som_lu=som_lu+luc_bike;
            som_desc=som_desc+desc_bike;
            luc_lic=som_lu-(som_desc+som_sal);
            
            /*System.out.println("Texte");
            //System.out.println("Valor do salario dig: "+val_sal);
            System.out.println("Imposto: "+desc_bike);
            System.out.println("Comicao fun "+comi_fum);
            System.out.println("N bike: "+num_bike);
            System.out.println(pre_bike);
            */
            System.out.println("=========================================");
        cont++;
        }
        System.out.println("O seu lucro liquido e "+luc_lic);
        /*
        System.out.println("Soma dos salarios: "+som_sal);
        System.out.println("Lucro loja "+som_lu);
        //System.out.println("Soma valor da bike sem desc"+som_vend);
        System.out.println("Soma dos impostos "+som_desc);
        */
    }
}
