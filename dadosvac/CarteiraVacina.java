package dadosvac;

import java.util.ArrayList;
import java.util.List;

public class CarteiraVacina {
	private Vacina vac;
	private LocalVacinacao locVac;
	private Enfermeiro vacinador;
	private Pessoa vacinado;
	private List<Vacina> listaVac = new ArrayList<>();
	
	public CarteiraVacina(Vacina v, Pessoa vacinado, Enfermeiro vacinador, LocalVacinacao l) {
		vac = v;
		this.vacinado = vacinado;
		this.vacinador = vacinador;
		locVac = l;
		listaVac.add(vac);
	}
	
	public void adicionarVacina(Vacina vacina) {
		listaVac.add(vacina);
	}
	
	public void listarVacinas() {
		System.out.println("Vacinado: "+vacinado.getNome()+" Vacinador: "+vacinador.getNome());
		System.out.println("Vacinado em: "+locVac.toString());
		System.out.println(listaVac);
	}
}
