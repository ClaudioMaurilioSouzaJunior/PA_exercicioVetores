package exerciciosVetores;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, soma = 0;
		double media;
		
		a = new int [TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor de A");
			a[i] = in.nextInt();
			soma = soma + a[i];
		}
		
		media = soma / TAM;
		
		System.out.print("\nA = [ ");
		for(i = 0; i < TAM; i++) {
			System.out.print(a[i]+" ");
		}System.out.println("]");
		System.out.println("Media dos valores: "+media);
	}

}
