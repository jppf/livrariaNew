public class Coima {
	String descricao;
	float valor;
	Devolucao devolucao;
	
	public Coima(String desc, float valor_, Devolucao dv) {
		this.descricao = desc;
		this.valor = valor_;
		this.devolucao = dv;
	}
	
	public String getDescricao() { return this.descricao; }
	public float getValor() { return this.valor; }
	public Devolucao getDevolucao() {return this.devolucao; }

	
}
