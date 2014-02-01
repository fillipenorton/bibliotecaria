package Usuario;

public class AlunoPos extends Usuario {

	public int periodo_emprestimo;
	public int limite_emprestimos_abertos;
	
	public AlunoPos(int codigo, String nome) {
		super(codigo, nome);
		this.periodo_emprestimo = 2;
		this.limite_emprestimos_abertos = 4; 
	}

}
