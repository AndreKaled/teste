/*
 * Andr� Kaled Duarte - Quest�o 3
 * Data: 19/07/2022
 * */
import java.util.Scanner;

public class Iniciais {

	public static void main(String[] args) {
		// entrada
		Scanner s = new Scanner(System.in);
		System.out.println("Digite seu nome e retornarei suas iniciais.");
		System.out.println("--> ");
		String nome = s.nextLine();
		String iniciais = "";

		iniciais += nome.charAt(0);
		// processamento ARRUMAR
		for (int i = 1; i < nome.length(); i++) {
			if (nome.charAt((i - 1)) == ' ') {
				if (nome.charAt(i) != 'e' || nome.charAt(i) != 'E'
						||!nome.substring((i-1), (i + 2)).equalsIgnoreCase("do ")
						||!nome.substring((i-1), (i + 2)).equalsIgnoreCase("da ")
						||!nome.substring((i-1), (i + 2)).equalsIgnoreCase("di ")
						||!nome.substring((i-1), (i + 2)).equalsIgnoreCase("de ")
						||!nome.substring((i-1), (i + 2)).equalsIgnoreCase("du ")
						||!nome.substring((i-1),(i + 3)).equalsIgnoreCase("dos ")
						||!nome.substring((i-1),(i + 3)).equalsIgnoreCase("das ")) {
					iniciais += nome.charAt(i);
					
				}
			}
		}
		iniciais = iniciais.toUpperCase();
		System.out.println("Suas iniciais s�o: " +iniciais);
	}
}
