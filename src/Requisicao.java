import java.time.LocalDate;

public class Requisicao {

	LocalDate data;
	Utilizador utilizador;
	Copia copia;
	
	public Requisicao(LocalDate dt, Utilizador usr, Copia cp) {
		this.data = dt;
		this.utilizador = usr;
		this.copia = cp;
	}
	
	public Copia getCopia() {
		return this.copia;
	}
	
	public Utilizador getUtilizador() {
		return this.utilizador;
	}
	
	public LocalDate getData() {
		return this.data;
	}
	
}
