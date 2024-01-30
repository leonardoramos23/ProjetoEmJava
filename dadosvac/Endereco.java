package dadosvac;

public class Endereco {
	private String rua, bairro, cidade, cep;
	private int num;
	
	public Endereco(String rua, int numero, String bairro, String cidade, String cep) {
		this.rua = rua;
		num = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}
	
	public Endereco(String rua, int numero, String bairro, String cidade) {
		this.rua = rua;
		num = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	public String getRua() {
		return rua;
	}
	public int getNum() {
		return num;
	}
	public String getBairro() {
		return bairro;
	}
}
