import java.time.LocalDate;

public class Emprestimo {

	LocalDate data;
	Requisicao requisicao;
	
	public Emprestimo(LocalDate dt, Requisicao rq) {
		this.data = dt;
		this.requisicao = rq;
	}
	
	public LocalDate getData() { return this.data; }
	public Requisicao getRequisicao() { return this.requisicao; }
}
