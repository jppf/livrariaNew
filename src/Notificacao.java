import java.time.LocalDate;

public class Notificacao {

	LocalDate data;
	Emprestimo emprestimo;
	
	public Notificacao(LocalDate dt, Emprestimo emp) {
		this.data = dt;
		this.emprestimo = emp;		
	}
	public LocalDate getData() { return this.data; }
	public Emprestimo getEmprestimo() { return this.emprestimo; }
}
