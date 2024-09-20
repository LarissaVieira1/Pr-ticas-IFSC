package Exercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		int num = 0;
		String NomeArquivo;

		System.out.println("Digite um numero para a tabuada: ");
		num = leitura.nextInt();
		NomeArquivo = "Tabuada_" + num + ".txt";
		try (BufferedWriter Escrita = new BufferedWriter(new FileWriter(NomeArquivo))) {
			for (int i = 1; i <= 10; i++) {
				Escrita.write(num + "x" + i + "=" + (num * i));
				Escrita.newLine();
			}
			System.out.println("A tabuada foi escrita corretamente no arquivo: " + NomeArquivo);
		} catch (IOException e) {
			System.out.println("Erro na escrita do arquivo!");
			e.getMessage();
		} finally {
			leitura.close();
		}

	}
}
