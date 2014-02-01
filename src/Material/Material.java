package Material;

public abstract class Material {
	private int codigo;
	private String titulo;
	private int qtd_exemplar_disp;
	private int qtd_exemplar_total;
	
		public Material(int codigo, String titulo){
			this.codigo = codigo;
			this.titulo = titulo;
		}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
		
	public void novoExemplar(Exemplar exemplar){
		
	}
	
	public void incremenataQtdDisp(){
		this.qtd_exemplar_disp++; 
	}
	
	public void decremenataQtdDisp(){
		this.qtd_exemplar_disp--; 
	}	
	
}
