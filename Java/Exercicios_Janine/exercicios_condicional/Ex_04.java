package exercicios_condicional;
import java.util.Scanner;
/**
 *
 * author dxwen
 */
public class Ex_04 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont_acert=0,cont_erro=0;
        String resp;
    Scanner texto=new Scanner (System.in);
    
    System.out.println("Prova:\n");
    
		System.out.println("========================================\n");
		System.out.println("1-Qual o item que aumenta o tamanho dos personagens no unvirso de Mario?\n");
		System.out.println("A-Cogumelo Vermelho\n"+"B-Flor\n"+"C-Folha\n"+"D-Pena\n");
		System.out.println("Digite a sua resposta:");
		resp=texto.nextLine();
                
		if(resp.equals("A") || resp.equals("a")){
			cont_acert++;
		}else{
			cont_erro++;
		}
		System.out.println("========================================\n");
		System.out.println("2-Que especie de animal Sonic pertence?\n");
		System.out.println("A-Porco\n"+"B-Gato\n"+"C-Ouriço\n"+"D-Canguru\n");
		System.out.println("Digite a sua resposta:");
		resp=texto.nextLine();
                
		if(resp.equals("C") || resp.equals("c")){
			cont_acert++;
		}else{
			cont_erro++;
		}
		System.out.println("========================================\n");
		System.out.println("3-Qual empresa e a mais antiga nos ramo de consoles?\n");
		System.out.println("A-Microsoft\n"+"B-Nintendo\n"+"C-Sony\n"+"D-Sega\n");
		System.out.println("Digite a sua resposta:");
		resp=texto.nextLine();
                
		if(resp.equals("B") || resp.equals("b")){
			cont_acert++;
		}else{
			cont_erro++;
		}
		System.out.println("========================================\n");
		System.out.println("4-Qual o ano de lancamento do primeiro Xbox\n");
		System.out.println("A-2003\n"+"B-2000\n"+"C-2002\n"+"D-2001\n");
		System.out.println("Digite a sua resposta:");
		resp=texto.nextLine();
                
		if(resp.equals("D") || resp.equals("d")){
			cont_acert++;
		}else{
			cont_erro++;
		}
		System.out.println("========================================\n");
		System.out.println("5-Qual primeiro DualShock a ter sensor de movimento?\n");
		System.out.println("A-4\n"+"B-2\n"+"C-1\n"+"D-3\n");
		System.out.println("Digite a sua resposta:");
		resp=texto.nextLine();
                
		if(resp.equals("C") || resp.equals("c")){
			cont_acert++;
		}else{
			cont_erro++;
		}
		System.out.println("===================Resultado=====================\n");
		System.out.println("Voce acertou: "+cont_acert+"\n"+
			   "Voce errou: "+cont_erro+"\n"+
			   "Seu percentual de acertos foram: "+(cont_acert/5)+"%\n"+
			   "Seu percentual de erros foram: "+(cont_erro/5)+"%");
    }
    
}