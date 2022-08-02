package questao1;

public class Cruzeiro extends Navio {
	private int maxPassageiros;
	
	public Cruzeiro () {
		
	}
	
	public void setMaxPassageiros (int max) {
		this.maxPassageiros = max;
	}
	public int getMaxPassageiros () {
		return this.maxPassageiros;
	}
	
	@Override
	public String toString () {
		return "Nome do navio: " + getNomeNavio() + " Número máximo de passageiros: " + getMaxPassageiros();
	}
}