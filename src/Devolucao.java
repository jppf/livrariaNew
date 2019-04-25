import java.time.LocalDate;

public class Devolucao {

	LocalDate data;
	Emprestimo emprestimo;	
	
	public Devolucao(LocalDate dt, Emprestimo emp) {
		this.data = dt;
		this.emprestimo = emp;
	}
	
	public LocalDate getData() { return this.data; }
	public Emprestimo getEmprestimo() { return this.emprestimo; }
}
