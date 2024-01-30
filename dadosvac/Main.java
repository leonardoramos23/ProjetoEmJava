package dadosvac;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static Scanner leitor = new Scanner(System.in);
	
	public static void listarLocVac(List<LocalVacinacao> l) {
		ListIterator<LocalVacinacao> iterador = l.listIterator(0);
		while(iterador.hasNext()) {
			System.out.println(iterador.next().toString());
		}
	}
	
	public static void listarVac(List<Vacina> v) {
		ListIterator<Vacina> iterador = v.listIterator(0);
		while(iterador.hasNext()) {
			System.out.println(iterador.next().toString());
		}
	}
	
	public static void listarCartVac(List<CarteiraVacina> cV) {
		ListIterator<CarteiraVacina> iterador = cV.listIterator(0);
		while(iterador.hasNext()) {
			iterador.next().listarVacinas();
		}
	}
	
	public static void addEndereco(List<Endereco> e) {
		String rua, bairro, cidade, cep;
		int num, resposta;
		System.out.println("rua: ");
		rua = leitor.nextLine();
		System.out.println("número: ");
		num = leitor.nextInt();
		leitor.nextLine();
		System.out.println("bairro: ");
		bairro = leitor.nextLine();
		System.out.println("cidade: ");
		cidade = leitor.nextLine();
		System.out.println("Sabe o seu CEP? sim-1 nao-2");
		resposta = leitor.nextInt();
		leitor.nextLine();
		
		if(resposta == 1) {
			System.out.print("CEP: ");
			cep = leitor.nextLine();
			e.add(new Endereco(rua, num, bairro, cidade, cep));
		}
		else {
			e.add(new Endereco(rua, num, bairro, cidade));
		}
	}
	
	public static void addPessoa(List<Pessoa> p, Endereco end, Prioridade prioridade) {
		String nome, cpf, cel;
		Integer idade;
		System.out.println("Nome: ");
		nome = leitor.nextLine();
		System.out.println("Idade: ");
		idade = leitor.nextInt();
		leitor.nextLine();
		System.out.println("Cpf: ");
		cpf = leitor.nextLine();
		System.out.println("Cel: ");
		cel = leitor.nextLine();
		p.add(new Pessoa(nome, idade, cpf, end, cel, prioridade));
	}
	
	public static void addVacina(List<Vacina> vac) {
		String nomeVacina, fabricante, restricoes;
		Integer duracao, idadeMinima, dose, eficacia;
		System.out.println("Nome: ");
		nomeVacina = leitor.nextLine();
		System.out.println("Fabricante: ");
		fabricante = leitor.nextLine();
		System.out.println("Restrições: ");
		restricoes = leitor.nextLine();
		System.out.println("Duração: ");
		duracao = leitor.nextInt();
		System.out.println("Idade mínima para receber: ");
		idadeMinima = leitor.nextInt();
		System.out.println("Número de doses necessárias: ");
		dose = leitor.nextInt();
		System.out.println("Eficácia: ");
		eficacia = leitor.nextInt();
		leitor.nextLine();
		vac.add(new Vacina(nomeVacina, fabricante, restricoes, duracao, idadeMinima, dose, eficacia));
	}
	
	public static void addEnfermeiro(int iden, List<Enfermeiro> enf, Endereco end, Prioridade prioridade) {
		String nome, cpf, cel;
		Integer idade;
		System.out.println("Nome: ");
		nome = leitor.nextLine();
		System.out.println("Idade: ");
		idade = leitor.nextInt();
		leitor.nextLine();
		System.out.println("Cpf: ");
		cpf = leitor.nextLine();
		System.out.println("Cel: ");
		cel = leitor.nextLine();
		enf.add(new Enfermeiro(iden, nome, idade, cpf, end, cel, prioridade));
	}
	
	public static void main(String []args) {
		List <Endereco> listEnd = new ArrayList<Endereco>();
		List <Pessoa> listPes = new ArrayList<Pessoa>();
		List <Vacina> listVac = new ArrayList<Vacina>();
		List <Prioridade> listPrio = new ArrayList<Prioridade>();
		List <CarteiraVacina> listCart = new ArrayList<CarteiraVacina>();
		List <Enfermeiro> listEnf = new ArrayList<Enfermeiro>();
		List <LocalVacinacao> listLocVac = new ArrayList<LocalVacinacao>();
		int num;
		
		System.out.println("Bem vindo ao Sistema de Vacinação!");
		System.out.println("Quantos endereços deseja cadastar?");
		num = leitor.nextInt();
		leitor.nextLine();
		for(int i = 0; i < num; i++) {
			addEndereco(listEnd);
		}
		
		System.out.println("Quantas prioridades deseja cadastar?");
		num = leitor.nextInt();
		leitor.nextLine();
		for(int i = 0; i < num; i++) {
			System.out.print("Digite a prioridade: ");
			String s = leitor.nextLine();
			listPrio.add(new Prioridade(s));
		}
		
		System.out.println("Quantos locais de vacinação deseja cadastar?");
		num = leitor.nextInt();
		leitor.nextLine();
		for(int i = 0; i < num; i++) {
			ListIterator<Endereco> iterador = listEnd.listIterator(i);
			System.out.print("Digite o nome do local: ");
			String s = leitor.nextLine();
			listLocVac.add(new LocalVacinacao(s, iterador.next()));
		}
		
		System.out.println("Quantas pessoas deseja cadastrar?");
		num = leitor.nextInt();
		leitor.nextLine();
		for(int i = 0; i < num; i++) {
			ListIterator<Endereco> iterador = listEnd.listIterator(i);
			ListIterator<Prioridade> it = listPrio.listIterator(i);
			addPessoa(listPes, iterador.next(), it.next());
		}
		
		System.out.println("Quantas enfermeiros deseja cadastrar?");
		num = leitor.nextInt();
		leitor.nextLine();
		for(int i = 0; i < num; i++) {
			ListIterator<Endereco> iterador = listEnd.listIterator(i);
			ListIterator<Prioridade> it = listPrio.listIterator(i);
			System.out.print("Digite o id do enfermeiro: ");
			int id = leitor.nextInt();
			leitor.nextLine();
			addEnfermeiro(id, listEnf, iterador.next(), it.next());
		}
		
		System.out.println("Quantas vacinas deseja cadastar?");
		num = leitor.nextInt();
		leitor.nextLine();
		for(int i = 0; i < num; i++) {
			addVacina(listVac);
		}
		
		System.out.println("Quantas carteiras de vacinação deseja cadastrar?");
		num = leitor.nextInt();
		leitor.nextLine();
		for(int i = 0; i < num; i++) {
			ListIterator<Vacina> iterador = listVac.listIterator(i);
			ListIterator<Pessoa> it = listPes.listIterator(i);
			ListIterator<Enfermeiro> iter = listEnf.listIterator(i);
			ListIterator<LocalVacinacao> itered = listLocVac.listIterator(i);
			listCart.add(new CarteiraVacina(iterador.next(), it.next(), iter.next(), itered.next()));
		}
		
		listarVac(listVac);
		listarLocVac(listLocVac);
		listarCartVac(listCart);
	}
}
