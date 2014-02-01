package Usuario;

public class AlunoGrad extends Usuario{
	public int periodo_emprestimo;
	public int limite_emprestimos_aberto;
	
	public AlunoGrad(int codigo, String nome) {
		super(codigo, nome);
		this.periodo_emprestimo = 1;
		this.limite_emprestimos_aberto = 3;
	}


}
