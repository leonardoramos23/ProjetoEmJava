package dadosvac;

public class Vacina {
	private String nomeVacina, fabricante, restricoes;
	private Integer duracao, idadeMinima, dose, eficacia;
	
	public Vacina(String n, String f, String r, Integer dur, Integer idMin, Integer dose, Integer ef) {
		nomeVacina = n;
		fabricante = f;
		restricoes = r;
		duracao = dur;
		idadeMinima = idMin;
		this.dose = dose;
		eficacia = ef;
	}
	
	public int compareTo(Object obj) {
		return this.nomeVacina.compareTo(((Vacina)obj).toString());
	}
	
	public String toString() {
		return nomeVacina;
	}
}
