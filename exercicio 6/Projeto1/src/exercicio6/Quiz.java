package exercicio6;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("SEJAM BEM VINDO AO QUIZ");

		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("");

		int pt = 0;
		int erros = 0;

		String questao1 = "1.Qual foi o ano que o Brasil foi pentacampeão mundial?";
		System.out.println(questao1);

		System.out.println("[1] 1960");
		System.out.println("[2] 1970");
		System.out.println("[3] 2002");

		System.out.println("Digite sua resposta: ");
		String resposta1 = sc.next();

		if (resposta1.equals("3")) {
			System.out.println("Resposta correta!");
			pt++;
		} else {
			System.out.println("Resposta errada!");
			erros++;
		}

		String questao2 = "2.Qual foi o tecnico do pentacampeão mundial?";
		System.out.println(questao2);

		System.out.println("[1] Felipão");
		System.out.println("[2] Galvão Bueno");
		System.out.println("[3] Guardiola");

		System.out.println("Digite sua resposta: ");
		String resposta2 = sc.next();

		if (resposta2.equals("1")) {
			System.out.println("Resposta correta!");
			pt++;
		} else {
			System.out.println("Resposta errada!");
			erros++;
		}
		String questao3 = "3.Em que fase a Argentina foi eliminada da Copa do Mundo de 2002 ?";
		System.out.println(questao3);

		System.out.println("[1] Oitavas de final");
		System.out.println("[2] Fase de grupos");
		System.out.println("[3] Quartas de final");

		System.out.println("Digite sua resposta: ");
		String resposta3 = sc.next();

		if (resposta3.equals("2")) {
			System.out.println("Resposta correta!");
			pt++;
		} else {
			System.out.println("Resposta errada!");
			erros++;
		}

		System.out.printf("\nUsuário: " + nome + "\nAcertos:" + pt + "\nErros: " + erros);

		sc.close();
	}

}

    


