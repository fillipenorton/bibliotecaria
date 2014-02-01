package Material;

public class Dvd extends Material {
	public String autores;
	public int ano_publicao;
	public String regiao;
	
	public Dvd(int codigo, String titulo, String autores, int ano_publicao, String regiao) {
		super(codigo, titulo);
		this.autores = autores;
		this.ano_publicao = ano_publicao;
		this.regiao = regiao;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public int getAno_publicao() {
		return ano_publicao;
	}

	public void setAno_publicao(int ano_publicao) {
		this.ano_publicao = ano_publicao;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
}
