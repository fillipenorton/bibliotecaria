package Material;
import Sistema.*;

import java.util.ArrayList;
public class Exemplar {
	public int codigo;
	public boolean emprestado;
	public int material_cod;
	
	public Exemplar(int material_cod, int codigo, boolean emprestado) {
		this.material_cod = material_cod;
		this.codigo = codigo;
		this.emprestado = emprestado;
	}

	public boolean getEmprestado(){
		return emprestado;	
	}
	
	public void setEmprestado(boolean param){
		this.emprestado = param;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public void cadastraEmprestimosAndamento(Emprestimo emp){
		
	}
	
}
