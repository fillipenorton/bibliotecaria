package Sistema;
import Material.*;
import Usuario.*;
import java.util.Hashtable;

public class Armazenamento {
    public static Hashtable<String, Emprestimo> hashEmprestimo = new Hashtable<String, Emprestimo>();
    public static Hashtable<String, Reserva> hashReserva = new Hashtable<String, Reserva>();
    public static Hashtable<Integer, Material> hashMaterial = new Hashtable<Integer, Material>();
    public static Hashtable<Integer, Usuario> hashUsuario = new Hashtable<Integer, Usuario>();
    
    public static void criaObjetos(){
    	AlunoGrad alunoG1 = new AlunoGrad(123, "João da Silva");
    	hashUsuario.put(123, alunoG1);
    	AlunoGrad alunoG2 = new AlunoGrad(789, "Pedro Paulo");
    	hashUsuario.put(789, alunoG2);
    	AlunoPos alunopos = new AlunoPos(465, "Luiz Fernando Rodrigues");
    	hashUsuario.put(465, alunopos);
    	Professor professor = new Professor(100, "Carlos Lucena");
    	hashUsuario.put(100, professor);

    	
    }
}
