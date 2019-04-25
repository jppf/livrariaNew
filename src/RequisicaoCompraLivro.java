import java.time.LocalDate;

public class RequisicaoCompraLivro extends RequisicaoCompra{

	PropostaAquisicao propostaAquisicao;
		
	public RequisicaoCompraLivro(String estado_, LocalDate dt, String oficio_, PropostaAquisicao pa, Livro l, Utilizador u) {
		super(estado_, dt,oficio_, l, u);
		this.propostaAquisicao = pa;
		// TODO Auto-generated constructor stub
	}
	
	public PropostaAquisicao getPropostaAquisicao() { return this.propostaAquisicao; }
	

}
