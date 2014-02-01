package Material;
public class Revista extends Material {
	public int edicao;
	public String mes;
	public int ano;
	
	
	public Revista(int codigo, String titulo, int edicao, String mes, int ano) {
		super(codigo, titulo);
		this.edicao = edicao;
		this.mes = mes;
		this.ano = ano;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}



}
