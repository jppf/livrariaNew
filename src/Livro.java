public class Livro {
	String titulo;
	String editora;
	
	public Livro(String titulo_, String editora_) {
		this.titulo = titulo_;
		this.editora = editora_;
	}
	
	public String getTitulo() { return this.titulo; }
	public String getEditora() { return this.editora; }
}
