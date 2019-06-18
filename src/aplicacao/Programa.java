package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Contato;
import Entidades.enums.TipoNumero;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Contato> contatos = new ArrayList<Contato>();
		int opcao;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("-----Lista de Contatos-----\n");
			System.out.println("Selecione a opção desejada:\n");
			System.out.println("1 - Cadastrar contato");
			System.out.println("2 - Consultar contato");
			System.out.println("3 - Excluir Contato");
			System.out.println("4 - Sair");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1: {

				System.out.println("-------Cadastro Contato-----\n");
				System.out.print("Id: ");
				int idContato = sc.nextInt();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				sc.nextLine();
				System.out.print("Sobrenome: ");
				String sobreNome = sc.nextLine();
				System.out.print("Telefone de Contato: ");
				String telContato = sc.nextLine();
				System.out.println("Tipo de Telefone:");
				System.out.println("1 - RESIDENCIAL");
				System.out.println("2 - CELULAR");
				System.out.println("3 - CORPORATIVO");
				System.out.println("4 - RECADO");
				int opcaoTipoTel = sc.nextInt();

				switch (opcaoTipoTel) {

				case 1: {

					contatos.add(new Contato(idContato, nome, sobreNome, telContato, TipoNumero.RESIDENCIAL));
					break;
				}
				case 2: {

					contatos.add(new Contato(idContato, nome, sobreNome, telContato, TipoNumero.CELULAR));
					break;
				}
				case 3: {
					contatos.add(new Contato(idContato, nome, sobreNome, telContato, TipoNumero.CORPORATIVO));
					break;
				}
				case 4: {
					contatos.add(new Contato(idContato, nome, sobreNome, telContato, TipoNumero.RECADO));
					break;
				}

				}
				System.out.println("Cadastro Realizado com sucesso!!!");
				break;
			}
			case 2: {

				System.out.println("-------Consulta Contato-----\n");

				for (Contato listaContatos : contatos) {

					System.out.println(listaContatos.exibeContato());
				}

				break;
			}
			case 3: {

				System.out.println("-------Excluir Cadastro-----\n");

				System.out.println("Informe o id a ser excluído: ");
				int valorId = sc.nextInt();

				contatos.removeIf(listaContatos -> listaContatos.getIdContato() == valorId);

				System.out.println("Excluído com sucesso!!!");

			}

				break;
			}

		} while (opcao > 0 && opcao < 4);
		System.out.println("Fim do programa");
		sc.close();
	}

}
