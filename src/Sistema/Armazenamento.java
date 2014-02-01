package Sistema;
import Material.*;
import Usuario.*;
import java.util.Hashtable;

public class Armazenamento {
    public static Hashtable<String, Emprestimo> hashEmprestimo = new Hashtable<String, Emprestimo>();
    public static Hashtable<String, Reserva> hashReserva = new Hashtable<String, Reserva>();
    public static Hashtable<Integer, Livro> hashLivro = new Hashtable<Integer, Livro>();
    public static Hashtable<Integer, Revista> hashRevista = new Hashtable<Integer, Revista>();
    public static Hashtable<Integer, Cd> hashCd = new Hashtable<Integer, Cd>();
    public static Hashtable<Integer, Dvd> hashDvd = new Hashtable<Integer, Dvd>();
    public static Hashtable<Integer, Exemplar> hashExemplar = new Hashtable<Integer, Exemplar>();
    
    public static Hashtable<Integer, Usuario> hashUsuario = new Hashtable<Integer, Usuario>();
    
    public void criaObjetos(){
    	AlunoGrad alunoG1 = new AlunoGrad(123, "João da Silva");
    	hashUsuario.put(123, alunoG1);
    	AlunoGrad alunoG2 = new AlunoGrad(789, "Pedro Paulo");
    	hashUsuario.put(789, alunoG2);
    	AlunoPos alunopos = new AlunoPos(465, "Luiz Fernando Rodrigues");
    	hashUsuario.put(465, alunopos);
    	Professor professor = new Professor(100, "Carlos Lucena");
    	hashUsuario.put(100, professor);

    	Livro livro1 = new Livro(100, "Engenharia de Software", "Addison Wesley", "Ian Sommervile", 6, 2000);
    	hashLivro.put(100, livro1);
    	Livro livro2 = new Livro(101, "UML Guia do Usuario", "Campus", "G. Booch, J. Rumbaugh, I. Jacobson", 7, 2000);
    	hashLivro.put(100, livro2);
    	
    	Revista revista1 = new Revista(200, "IEEE Transactions On Soft. Eng", 53, "Setembro", 2006);
    	hashRevista.put(100, revista1);
	
    	Revista revista2 = new Revista(201, "IEEE Transactions On Soft. Eng", 54, "Outubro", 2006);
    	hashRevista.put(100, revista2);
    	
    	Cd cd1 = new Cd(300,"Back to Black", "Amy Winehouse", "rehab, you know i'm no good, me n' mrs. 	Jones", 2006);
    	hashCd.put(300, cd1);
    	
    	Cd cd2 = new Cd(301,"Ie Ie Ie", "Arnaldo Antunes", "Long, Invejoso, Envelhecer", 2009);
    	hashCd.put(301, cd2);

    	Dvd dvd1 = new Dvd(400,"Indiana Jones", "Harrison Ford", 2008, 4);
    	hashDvd.put(400, dvd1);

    	Exemplar exemplar1 = new Exemplar(100,1, true);
    	hashExemplar.put(1, exemplar1);
    	Exemplar exemplar2 = new Exemplar(100,2, true);
    	hashExemplar.put(2, exemplar2);
    	Exemplar exemplar3 = new Exemplar(101,3, true);
    	hashExemplar.put(3, exemplar3);
    	Exemplar exemplar4 = new Exemplar(200,4, true);
    	hashExemplar.put(4, exemplar4);
    	Exemplar exemplar5 = new Exemplar(201,5, true);
    	hashExemplar.put(5, exemplar5);
    	Exemplar exemplar6 = new Exemplar(300,6, true);
    	hashExemplar.put(6, exemplar6);
    	Exemplar exemplar7 = new Exemplar(300,7, true);
    	hashExemplar.put(7, exemplar7);
    	Exemplar exemplar8 = new Exemplar(400,8, true);
    	hashExemplar.put(8, exemplar8);
    	Exemplar exemplar9 = new Exemplar(400,9, true);
    	hashExemplar.put(9, exemplar9);	
    }
}
