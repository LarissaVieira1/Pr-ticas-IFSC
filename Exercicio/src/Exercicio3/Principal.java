package Exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		String nomeArquivo = "contatinhos.txt";

		agenda.addContatinho(new Contatinho("Felipe Wanderherz", "PokemonGO@gmail.com", "(47)997456623", "Namorado"));
		agenda.addContatinho(
				new Contatinho("Matheus Souza", "xaulimmatadordeporco@gmail.com", "(47)987665832", "Amigo"));

		// Salvar contatos no arquivo.
		agenda.salvarLista(nomeArquivo);

		Scanner leitura = new Scanner(System.in);
		System.out.println("Favor informar um nome para procurar: ");
		String nome = leitura.nextLine();

		Contatinho contatinho = agenda.lerContatinhoPorNome(nome, nomeArquivo);
		// System.out.println(contatinho);
		if (contatinho != null) {
			System.out.println("\n" + "Contatinho encontrado!" + "\n");
			System.out.println("Nome: " + contatinho.getNome());
			System.out.println("Email: " + contatinho.getEmail());
			System.out.println("Telefone: " + contatinho.getTelefone());
			System.out.println("Categoria: " + contatinho.getCategoria());
		} else {
			System.out.println("Contatinho nao encontrado!");
		}
		leitura.close();
	}
}
