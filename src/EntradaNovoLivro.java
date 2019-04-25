import java.time.LocalDate;

public class EntradaNovoLivro {

	LocalDate data;
	Encomenda encomenda;
	Copia copia;
	public EntradaNovoLivro(LocalDate dt, Encomenda enc, Copia c) {
		this.data = dt;
		this.encomenda = enc;
		this.copia = c;
	}
	
	public LocalDate getData() { return this.data; }
	public Encomenda getEncomenda() { return this.encomenda; }
	public Copia getCopia() { return this.copia; }
	
}
