package Exercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite o numero da tabuada que voce deseja encontrar: ");
		String nomeArquivo = leitura.nextLine();

		File arq = new File("Tabuada_" + nomeArquivo + ".txt");

		if (!arq.exists()) {
			System.out.println("Este arquivo nao foi encontrado!");
		} else {

			try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
				String linha;
				System.out.println("Conteúdo do arquivo " + nomeArquivo + ":");
				while ((linha = reader.readLine()) != null) {
					System.out.println(linha);
				}

			} catch (IOException e) {
				System.out.println("Arquivo não encontrado: " + nomeArquivo);
			} finally {
				leitura.close();
			}
		}

	} // fim else.
}
