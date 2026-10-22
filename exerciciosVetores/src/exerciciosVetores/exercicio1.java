package exerciciosVetores;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor de A");
			a[i] = in.nextInt();
			b[i] = a[i] * a[i];
		}
		
		System.out.print("\nA = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		} System.out.println("]");
		
		System.out.print("\nB = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		} System.out.println("]");
	}

}
