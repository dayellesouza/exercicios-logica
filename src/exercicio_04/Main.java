 package exercicio_04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int id, horas;
		double valorHora, salario;
		
		System.out.print("Insira o id: ");
		id = teclado.nextInt();
		System.out.print("Insira o número de horas trabalhadas: ");
		horas = teclado.nextInt();
		System.out.print("Insira o valor por hora: ");
		valorHora = teclado.nextDouble();
		
		salario = horas * valorHora;

		System.out.println("\nNumber = " + id);
		System.out.printf("Salary = U$ %.2f", salario);
		
		teclado.close();
	}

}
