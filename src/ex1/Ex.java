package ex1;

import java.util.Scanner;

public class Ex {

	private static final String ERRO_TEMPO = "A empresa só existe há 25 anos";

	private static final String DESCONTO_5 = "Seu desconto é de 5%";

	private static final String DESCONTO_10 = "Seu desconto é de 10%";

	private static final String DIGITE = "Digite quanto tempo voce tem de cadastro na empresa";
	static Scanner sc = new Scanner(System.in);
	
	
	static String nov = "";
	int tempo;
	
	public static void main(String args[]) {
		
		
		realizarConsulta();
		
		
	}

	private static void realizarNovamente() {
		
		System.out.println("Deseja verificar novamente?(S/N)");
		
		nov = sc.nextLine();
		if(nov.equalsIgnoreCase("s")) {
			realizarConsulta();
		}else if(nov.equalsIgnoreCase("n")) {
			
		}else {
			System.out.println("Digite apenas S ou N");
			realizarNovamente();
		}
		
	}
	
	

	private static void realizarConsulta() {
		Scanner sc = new Scanner(System.in);
		int tempo;
		System.out.println(DIGITE);
		try {
		tempo = sc.nextInt();
		if(tempo >=10 && tempo <=25) {
			System.out.println(DESCONTO_10);
		}else if(tempo <10) {
			System.out.println(DESCONTO_5);
		}else if(tempo > 25) {
			System.out.println(ERRO_TEMPO);
		}
		realizarNovamente();}
		catch(Exception e) {
			System.out.println("Digite apenas números");
			realizarConsulta();
		}

	}
}
