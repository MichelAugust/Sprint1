package exercicio7;

import java.util.Calendar;
import java.util.Scanner;

public class SaudacaoAoUsuario {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.printf("login: ");
			String login = sc.nextLine();
			System.out.println("senha: ");
			String senha = sc.nextLine();
										
			if(login.equals("michel") && senha.equals("1234")){							
			}else { 
				System.out.println("Usuario ou senha incorretos");
			}
		

			Calendar c1 = Calendar.getInstance();
			int hora = c1.get(Calendar.HOUR_OF_DAY);

			if(hora>6&&hora<12)
			{
				System.out.printf("Bom dia, você se logou ao nosso sistema");
			}else if(hora>12&&hora<18)
		{
				System.out.printf("Boa tarde, você se logou ao nosso sistema.");
			}else if(hora>18&&hora<24)
		{
				System.out.printf("Boa noite, você se logou ao nosso sistema.");
			}else System.out.printf("Boa madrugada, você se logou ao nosso sistema.");

			sc.close();
	}
}

    



