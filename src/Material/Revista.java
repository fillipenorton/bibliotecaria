package Material;
public class Revista extends Material {
	public int edicao;
	public String mes_ano;
	
	public Revista(int codigo, String titulo, int edicao, String mes_ano) {
		super(codigo, titulo);
		this.edicao = edicao;
		this.mes_ano = mes_ano;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getMes_ano() {
		return mes_ano;
	}

	public void setMes_ano(String mes_ano) {
		this.mes_ano = mes_ano;
	}

}
