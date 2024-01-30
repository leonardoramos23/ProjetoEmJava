package dadosvac;

import java.util.Scanner;
import validacao.Validacpf;

public class Pessoa implements Verificavel{
	private String nome, cpf, celular;
	private Integer idade;
	private Prioridade prio;
	private Endereco end;
	Scanner leitor = new Scanner(System.in);
	
	public Pessoa(String n, Integer i, String cpf, Endereco e, String cel, Prioridade p) {
		nome = n;
		idade = i;		
		if(validarCpf(cpf)) {
			this.cpf = cpf;
		}
		else {
			solicitarNovo();
		}			
		end = e;
		celular = cel;
		prio = p;
	}
	
	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getCelular() {
		return celular;
	}
	
	public void setIdade(int i) {
		idade= i;
	}
	public void setNome(String s) {
		nome = s;
	}
	public void setCpf(String s) {
		cpf = s;
	}
	public void setCelular(String s) {
		celular = s;
	}
	
	public void solicitarNovo() {
		String codigo;
		System.out.println("Cpf inválido!");
		System.out.print("Digite um novo cpf: ");
		codigo = leitor.nextLine();
		if(validarCpf(codigo) == true) {
			setCpf(codigo);
		}
		else {
			solicitarNovo();
		}
			
	}
	
	public boolean validarCpf(String codigo) {
		return Validacpf.isCPF(codigo);
	}
}
