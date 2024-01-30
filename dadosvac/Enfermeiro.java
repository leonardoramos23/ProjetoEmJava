package dadosvac;

public class Enfermeiro extends Pessoa{
	private Integer id;
	private Pessoa pessoa;
	
	public Enfermeiro(Integer id, String n, Integer i, String cpf, Endereco e, String cel, Prioridade p) {
		super(n, i, cpf, e, cel, p);
		this.id = id;
	}
	
	public String toString() {
		return "Nome: "+getNome()+" Id: "+id;
	}
}
