package zup.estrelas.cidades.principal;

// Represente a tabela cidade com um POJO.

//CREATE TABLE estrelas.cidade (
//nome VARCHAR(45) NOT NULL,
//cep VARCHAR(9) NOT NULL PRIMARY KEY,
//numero_de_habitantes INT(10) NOT NULL,
//capital BOOLEAN NOT NULL,
//estado VARCHAR(2) NOT NULL,
//renda_per_capta DECIMAL(10, 2) NOT NULL DEFAULT 1.439,
//data_de_fundacao DATE NOT NULL);

public class Cidade {
	private String nome;
	private String cep;
	private int numeroHabitantes;
	private boolean capital;
	private String estado;
	private float rendaPerCapta;
	private String dataDeFundacao;

	public Cidade(String nome, String cep, int numeroHabitantes, boolean capital, String estado, float rendaPerCapta,
			String dataDeFundacao) {
		this.nome = nome;
		this.cep = cep;
		this.numeroHabitantes = numeroHabitantes;
		this.capital = capital;
		this.estado = estado;
		this.rendaPerCapta = rendaPerCapta;
		this.dataDeFundacao = dataDeFundacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumeroHabitantes() {
		return numeroHabitantes;
	}

	public void setNumeroHabitantes(int numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public float getRendaPerCapta() {
		return rendaPerCapta;
	}

	public void setRendaPerCapta(float rendaPerCapta) {
		this.rendaPerCapta = rendaPerCapta;
	}

	public String getDataDeFundacao() {
		return dataDeFundacao;
	}

	public void setDataDeFundacao(String dataDeFundacao) {
		this.dataDeFundacao = dataDeFundacao;
	}

}