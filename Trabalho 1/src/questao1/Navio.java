package questao1;

public class Navio {
	public String nomeNavio;
	private String anoNavio; //Ano de construção do navio
	
	public Navio () {
		
	}
	
	public void setNomeNavio (String nome) {
		this.nomeNavio = nome;
	}
	public String getNomeNavio () {
		return this.nomeNavio;
	}
	
	public void setAnoNavio (String ano) {
		this.anoNavio = ano;
	}
	public String getAnoNavio () {
		return this.anoNavio;
	}
	
	public String toString () {
		return ("Nome do navio: " + this.getNomeNavio() + " Ano de construção: " + this.getAnoNavio());
	}
}
