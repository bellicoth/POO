import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        Engenheiro engenheiro = new Engenheiro(1, "Ana",  new BigDecimal(10000), "Civil", "Teste");

        System.out.println(engenheiro);

        Gerente gerente = new Gerente(2, "Cleiton", new BigDecimal(30000), "Projetos", new BigDecimal(2000));

        System.out.println(gerente);

        Presidente presidente = new Presidente(3, "Barbara", new BigDecimal(50000), new BigDecimal(10000));

        System.out.println(presidente);

        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
        folhaDePagamento.registrar(engenheiro);
        folhaDePagamento.registrar(presidente);
        folhaDePagamento.registrar(gerente);
        System.out.println(folhaDePagamento.getTotalDaFolhaDePagamento());

        folhaDePagamento.login(engenheiro);
        folhaDePagamento.login(gerente);
        folhaDePagamento.login(presidente);
    }
}
