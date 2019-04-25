import java.time.LocalDate;

public class PropostaAquisicao {
	LocalDate data;
	Utilizador utilizador;
	String livro;
	public PropostaAquisicao(LocalDate dt, Utilizador usr, String string) {
		this.data = dt;
		this.utilizador = usr;
		this.livro = string;
	}
	
	public Utilizador getUtilizador() { return this.utilizador; }
	public LocalDate getData() { return this.data; }
}
