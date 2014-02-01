package Material;

public class Cd extends Material{
	public String autores;
	public String faixas;
	public int ano_pub;
	
	public Cd(int codigo, String titulo, String autores, String faixas, int ano_pub) {
		super(codigo, titulo);
		this.autores = autores;
		this.faixas = faixas;
		this.ano_pub = ano_pub;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getFaixas() {
		return faixas;
	}

	public void setFaixas(String faixas) {
		this.faixas = faixas;
	}

	public int getAno_pub() {
		return ano_pub;
	}

	public void setAno_pub(int ano_pub) {
		this.ano_pub = ano_pub;
	}

}
