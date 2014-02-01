package Material;
import Usuario.*;
public class Emprestimo {
	public long dataSaida;
	public long dataRetorno;
	public long prevRetorno;
	public boolean andamento;
	public Exemplar exemplar;
	public Usuario usuario;
	
	public Emprestimo(long dataSaida, long dataRetorno,long prevRetorno, boolean andamento, Exemplar exemplar, Usuario usuario){
		this.dataSaida = dataSaida;
		this.dataRetorno = dataRetorno;
		this.prevRetorno = prevRetorno;
		this.andamento = andamento;
		this.exemplar = exemplar;
		this.usuario = usuario;
	}
}
