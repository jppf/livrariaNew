import java.time.LocalDate;

public class Encomenda {
	LocalDate data;
	RequisicaoCompra requisicao;
	
	public Encomenda(LocalDate dt, RequisicaoCompra rq) {
		this.data = dt;
		this.requisicao = rq;
	}
	
	public LocalDate getData() { return this.data; }
	
	public RequisicaoCompra getRequisicao() { return this.requisicao; }
	
	
	
}
