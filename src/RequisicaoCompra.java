import java.time.LocalDate;

public abstract class RequisicaoCompra {

	String estado;
	LocalDate data;
	String oficio;
	Livro livro;
	Utilizador utilizador;
	
	public RequisicaoCompra(String estado_, LocalDate dt, String oficio_, Livro l, Utilizador u) {
		this.estado = estado_;
		this.data = dt;
		this.oficio = oficio_;
		this.livro = l;
		this.utilizador = u;
	}
	
	public String getEstado() { return this.estado; }
	public String getOficio() { return this.oficio; }
	public LocalDate getData() { return this.data; }
	public Livro getLivro() { return this.livro; }
	public Utilizador getUtilizador() {return this.utilizador; }
}
