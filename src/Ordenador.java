import java.util.Arrays;
import java.util.Scanner;

public class Ordenador {
	Scanner leitor = new Scanner(System.in);
	public int[] Array = new int[10]; // 10 posições
	public int Contador = 0;

	public Ordenador() {
		insereNumeros();
		organizaResultado();
		exibeOrdem();
	}

	public void insereNumeros() {

		while (Contador < 10) {

			try {
				System.out.println("Insira um numero: ");
				Array[Contador] = leitor.nextInt(); // guarda o valor na posição
				Contador++; // contador recebe +1
			}

			catch (java.util.InputMismatchException e) {
				System.out.println("!Só numeros são aceitos!");
				leitor.nextLine(); // continua lendo
			}
		}
	}

	public void organizaResultado() {
		Arrays.sort(Array); // organiza valores do array em ordem
	}

	public void exibeOrdem() {
		System.out.println(Arrays.toString(Array)); // mostra o array em ordem
	}
}
