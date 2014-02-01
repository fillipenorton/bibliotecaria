package Usuario;
public class Professor extends Usuario {

	public int periodo_emprestimo;
	
	public Professor(int codigo, String nome) {
		super(codigo, nome);
		this.periodo_emprestimo = 4;
	}

	public int getPeriodo_emprestimo() {
		return periodo_emprestimo;
	}

	public void setPeriodo_emprestimo(int periodo_emprestimo) {
		this.periodo_emprestimo = periodo_emprestimo;
	}
}
