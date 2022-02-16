package exercicio_05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPiece1, codPiece2, numPiece1, numPiece2;
		double valPiece1, valPiece2, result1, result2, somaTotal;
		
		System.out.print("Insira o código da peça 1: ");
		codPiece1 = sc.nextInt();
		System.out.print("Insira o número da peça 1: ");
		numPiece1 = sc.nextInt();
		System.out.print("Insira o valor unitário da peça 1: ");
		valPiece1 = sc.nextDouble();
		result1 = numPiece1 * valPiece1;
		
		System.out.print("\n");
		System.out.print("Insira o código da peça 2: ");
		codPiece2 = sc.nextInt();
		System.out.print("Insira o número da peça 2: ");
		numPiece2 = sc.nextInt();
		System.out.print("Insira o valor unitário da peça 2: ");
		valPiece2 = sc.nextDouble();
		result2 = numPiece2 * valPiece2;
		
		somaTotal = result1 + result2;
		System.out.printf("\nValor a pagar: R$ %.2f", somaTotal);
		
		sc.close();
	}

}
