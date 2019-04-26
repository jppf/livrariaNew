import java.util.ArrayList;

public class RepositorioMem implements Repositorio {

//	private static final RepositorioMem instance = null;

	ArrayList<Coima> coima_al = new ArrayList<Coima>();
	ArrayList<Copia> copia_al = new ArrayList<Copia>();
	ArrayList<Devolucao> devolucao_al = new ArrayList<Devolucao>();
	ArrayList<Emprestimo> emprestimo_al = new ArrayList<Emprestimo>();
	ArrayList<Livro> livro_al = new ArrayList<Livro>();
	ArrayList<Notificacao> notificacao_al = new ArrayList<Notificacao>();
	ArrayList<Requisicao> requisicao_al = new ArrayList<Requisicao>();
	ArrayList<Utilizador> utilizador_al = new ArrayList<Utilizador>();
	ArrayList<TipoUtilizador> tipoUtilizador_al = new ArrayList<TipoUtilizador>();
	ArrayList<RequisicaoCompra> requisicaoCompra_al = new ArrayList<RequisicaoCompra>();
	ArrayList<Encomenda> encomenda_al = new ArrayList<Encomenda>();
	ArrayList<PropostaAquisicao> propostaAquisicao_al = new ArrayList<PropostaAquisicao>();
	ArrayList<EntradaNovoLivro> entradaNovoLivro_al = new ArrayList<EntradaNovoLivro>();
	
	
	public RepositorioMem() {}
	
	public void adicionaCoima(Coima coima) {
		coima_al.add(coima);
	}
	
	public void adicionaEmprestimo(Emprestimo emp) {
		emprestimo_al.add(emp);
	}
	
	public void adicionaDevolucao(Devolucao dv) {
		devolucao_al.add(dv);
	}
	public void adicionaNotificacao(Notificacao nt) {
		notificacao_al.add(nt);
	}
	public void adicionaLivro(Livro lv) {
		livro_al.add(lv);
	}
	public void adicionaCopia(Copia cp) {
		copia_al.add(cp);
	}
	public void adicionaRequisicao(Requisicao rq) {
		requisicao_al.add(rq);
	}
	
	public void adicionaUtilizador(Utilizador usr) {
		utilizador_al.add(usr);
	}
	
	public void adicionaTipoUtilizador(TipoUtilizador tu) {
		tipoUtilizador_al.add(tu);
	}
	
	public void adicionaRequisicaoCompra(RequisicaoCompra rcc) {
		requisicaoCompra_al.add(rcc);
	}
	
	public void adicionaEncomenda(Encomenda enc) {
		encomenda_al.add(enc);
	}
	
	public void adicionaPropostaRequisicao(PropostaAquisicao pa) {
		propostaAquisicao_al.add(pa);
	}
	
	public void adicionaEntradaNovoLivro(EntradaNovoLivro enl) {
		entradaNovoLivro_al.add(enl);
	}
	
	public Emprestimo devolveEmprestimoDaRequisicao(Requisicao rq) {
		for(Emprestimo emp :emprestimo_al) {
			if (emp.getRequisicao().equals(rq))
				return emp;
		}
		return null;
	}
/*
	public static RepositorioMem getInstance(){
		if (instance == null)
			return new RepositorioMem();
		else
			return instance;
	}
*/
	
}
