package questao3;

public class LivroTeste {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		livro1.setTitulo("Tenda dos Milagres");
		livro1.setAutor("Jorge Amado");
		
		Livro livro2 = new Livro();
		livro2.setTitulo("Dom Casmurro");
		livro2.setAutor("Machado de Assis");
		
		System.out.println("Titulo : " + livro1.getTitulo());
		System.out.println("Autor : " + livro2.getAutor());
	}
}
