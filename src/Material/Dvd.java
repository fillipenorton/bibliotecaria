package Material;

public class Dvd extends Material {
	public String autores;
	public int ano_publicao;
	public int regiao;
	
	public Dvd(int codigo, String titulo, String autores, int ano_publicao, int regiao) {
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

	public int getRegiao() {
		return regiao;
	}

	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}
	
}
