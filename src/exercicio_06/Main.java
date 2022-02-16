package exercicio_06;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.print("A: ");
		A = sc.nextDouble();
		System.out.print("B: ");
		B = sc.nextDouble();
		System.out.print("C: ");
		C = sc.nextDouble();
		
		System.out.print("\n");
		
		areaTriangulo = A * C / 2.0 ;
		areaCirculo = 3.14159 * Math.pow(C, 2.0);
		areaTrapezio = (A + B) / 2.0 * C;
		areaQuadrado = Math.pow(B, 2.0);
		areaRetangulo = A * B;
		
		System.out.printf("TRI�NGULO: %.3f%n" , areaTriangulo);
		System.out.printf("C�RCULO: %.3f%n" , areaCirculo);
		System.out.printf("TRAP�ZIO: %.3f%n" , areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n" , areaQuadrado);
		System.out.printf("RET�NGULO: %.3f" , areaRetangulo);
		
		sc.close();
	}

}
