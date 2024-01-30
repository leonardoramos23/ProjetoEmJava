package dadosvac;

public class LocalVacinacao {
	private String nomeLocal;
	private Endereco endereco;
	
	public LocalVacinacao(String nome, Endereco e) {
		nomeLocal = nome;
		endereco = e;
	}
	
	public String toString(){
		return nomeLocal+" Rua: "+endereco.getRua()+" Número: "+endereco.getNum()+" Bairro: "+endereco.getBairro();
	}
}
