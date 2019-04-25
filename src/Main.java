import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Utilizador u = new Utilizador("Manuel","Ativo");
        PropostaAquisicao propostaAquisicao = new PropostaAquisicao(LocalDate.now(),u, "Alice no Pais das Maravilhas");
        Livro l = new Livro("Programar em Java", "FCA");
        RequisicaoCompraCopia requisicaoCompraCopia = new RequisicaoCompraCopia("pendente", LocalDate.now(), "Oficio",l,u);
        Encomenda encomenda = new Encomenda(LocalDate.now(),requisicaoCompraCopia);
        Repositorio repo = new Repositorio();
        repo.adicionaEncomenda(encomenda);
    }


}
