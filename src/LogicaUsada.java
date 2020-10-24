/*
import java.util.Arrays;
import java.util.Scanner;

public class LogicaUsada {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int[] array = new int[10]; // cria 10 posições
		int contador = 0; // contador inicia com 0

		while (Contador < 10) {

			//try tenta executar sem erros
			try { 
				System.out.println("Insira um numero: ");
				Array[Contador] = leitor.nextInt(); // guarda o valor na posição
				Contador++; // contador recebe +1
			}
			
			//catch se der erro no try ele executa a mensageme continua lendo
			catch (java.util.InputMismatchException e) {
				System.out.println("!Só numeros são aceitos!");
				leitor.nextLine(); // continua lendo
			}
		}

		Arrays.sort(array); // organiza valores do array em ordem
		System.out.println(Arrays.toString(array)); // mostra o array em ordem
	}

}
*/