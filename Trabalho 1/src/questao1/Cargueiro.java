package questao1;

public class Cargueiro extends Navio {
	private int capacidadeCarga;
	
	public Cargueiro () {
		
	}
	
	public void setCapacidadeCarga (int toneladas) {
		this.capacidadeCarga = toneladas;
	}
	
	public int getCapacidadeCarga () {
		return this.capacidadeCarga;
	}
	
	@Override
	public String toString () {
		return "Nome do navio: " + getNomeNavio() + " Capacidade máxima de carga: " + getCapacidadeCarga();
	}
}
