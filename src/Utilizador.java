public class Utilizador extends Object{
	String nome;
	String estado;
	TipoUtilizador tipoUtilizador;
	
	
	public Utilizador(String nome_, String estado_, TipoUtilizador tu) {
		this.nome = nome_;
		this.estado = estado_;
		this.tipoUtilizador = tu;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public TipoUtilizador getTipoUtilizador() {
		return this.tipoUtilizador;
	}
}
