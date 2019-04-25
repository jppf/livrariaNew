public class Copia {
	
	int id;
	Livro livro;
	
	public Copia(int id_, Livro livro_) {
		this.id = id_;
		this.livro = livro_;
	}
	
	public Livro getLivro() { return this.livro; }
	public int getId() { return this.id; }

}
