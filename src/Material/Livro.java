package Material;

public class Livro extends Material{
	public String editora;
	public String autores;
	public int edicao;
	public int ano_pub; 
	
	public Livro(int codigo, String titulo, String editora, String autores, int edicao, int ano_pub) {
		super(codigo, titulo);
		this.editora = editora;
		this.autores = autores;
		this.edicao = edicao;
		this.ano_pub = ano_pub;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public int getAno_pub() {
		return ano_pub;
	}

	public void setAno_pub(int ano_pub) {
		this.ano_pub = ano_pub;
	}

}
