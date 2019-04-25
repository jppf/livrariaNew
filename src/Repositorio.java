import java.util.ArrayList;

public class Repositorio {

	ArrayList<Coima> coima_al;
	ArrayList<Copia> copia_al;
	ArrayList<Devolucao> devolucao_al;
	ArrayList<Emprestimo> emprestimo_al;
	ArrayList<Livro> livro_al;
	ArrayList<Notificacao> notificacao_al;
	ArrayList<Requisicao> requisicao_al;
	ArrayList<Utilizador> utilizador_al;
	ArrayList<TipoUtilizador> tipoUtilizador_al;
	ArrayList<RequisicaoCompra> requisicaoCompra_al;
	ArrayList<Encomenda> encomenda_al;
	ArrayList<PropostaAquisicao> propostaAquisicao_al;
	ArrayList<EntradaNovoLivro> entradaNovoLivro_al;
	
	
	public Repositorio() {
		coima_al = new ArrayList<Coima>();
		copia_al = new ArrayList<Copia>();
		devolucao_al = new ArrayList<Devolucao>();
		emprestimo_al = new ArrayList<Emprestimo>();
		livro_al = new ArrayList<Livro>();
		notificacao_al = new ArrayList<Notificacao>();
		requisicao_al = new ArrayList<Requisicao>();
		utilizador_al = new ArrayList<Utilizador>();
		tipoUtilizador_al = new ArrayList<TipoUtilizador>();
		requisicaoCompra_al = new ArrayList<RequisicaoCompra>();
		encomenda_al = new ArrayList<Encomenda>();
		propostaAquisicao_al = new ArrayList<PropostaAquisicao>();
		entradaNovoLivro_al = new ArrayList<EntradaNovoLivro>();
	}
	
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
	
	
}
