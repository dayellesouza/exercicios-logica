package exercicio_02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, pi, raio;
		
		pi = 3.14159;
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("Raio do circulo: %.2f%n", raio);
		System.out.printf("Area do circulo: %.4f", area);
		
		sc.close();
	}

}
