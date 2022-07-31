package trabalho1;

import java.util.ArrayList;
import java.util.List;

public class NavioTeste {
	public static void main(String[] args) {
		List<Navio> dadosNavio;
		dadosNavio = new ArrayList<Navio>();
		Navio navio = new Navio();
		Cruzeiro cruzeiro = new Cruzeiro();
		Cargueiro cargueiro = new Cargueiro();
		
		navio.setNomeNavio("SS America");
		navio.setAnoNavio("1938");
		
		dadosNavio.add(navio);
		
		cruzeiro.setNomeNavio("Titanic");
		cruzeiro.setAnoNavio("1909");
		cruzeiro.setMaxPassageiros(2400);
		
		dadosNavio.add(cruzeiro);
		
		cargueiro.setNomeNavio("Dimitrios");
		cargueiro.setAnoNavio("1950");
		cargueiro.setCapacidadeCarga(5000);
		
		dadosNavio.add(cargueiro);
		
		for (int i = 0; i < dadosNavio.size(); i++) {
			System.out.println(dadosNavio.get(i).toString());
		}
		}
}
