package entidades;

public class Estacionamento {
	
	private String nome;
	private String placa; 
	
	public Estacionamento(String nome, String placa) {
		super();
		this.nome = nome;
		this.placa = placa;
	}
	

		
	public String getNome() {
		return nome;
	}

	public String getPlaca() {
		return placa;
	}

	public String toString() {
		return nome + ", " + placa;
	}

}
