package Sistema;
import Keyboard.*;
import Material.*;
import java.util.Hashtable;


public class Sistema{

	public static void main(String[] args) {
		Armazenamento.criaObjetos();
		
		//String input = Keyboard.readString();
		//String[] opcao = input.split(" ");
		
		Livro l = Armazenamento.hashLivro.get(101);
		System.out.println(l.editora);
	}

}
