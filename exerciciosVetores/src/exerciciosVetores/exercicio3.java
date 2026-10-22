package exerciciosVetores;

import java.util.Scanner;

public class exercicio3 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i, j;
		
		a = new int [TAM];
		b = new int [TAM];
		j = TAM - 1;
		
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor de A");
			a[i] = in.nextInt();
			b[j] = a[i];
			j = j - 1;
		}
		System.out.print("\nA = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}System.out.println("]");
		
		System.out.print("\nB = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}System.out.println("]");
	}
}
