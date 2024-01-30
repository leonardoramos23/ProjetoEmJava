package dadosvac;

public class Prioridade {
	private String tipoPrioridade;
	
	public Prioridade(String p) {
		tipoPrioridade = p;
	}
	
	public void setTipoPrioridade(String s) {
		tipoPrioridade = s;
	}
	public String getTP() {
		return tipoPrioridade;
	}
	
	public String toString(){
		return "Prioridade: "+tipoPrioridade;
	}
}
