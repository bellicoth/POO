import java.math.BigDecimal;

public class FolhaDePagamento {
    
    private BigDecimal totalDaFolhaDePagamento = BigDecimal.ZERO;

    public void registrar(Funcionario fun){

        totalDaFolhaDePagamento = totalDaFolhaDePagamento.add(fun.calcularSalario());
    }

    public void login(Autenticavel funcionario){

        funcionario.autenticar();
    }

    public BigDecimal getTotalDaFolhaDePagamento() {
        return totalDaFolhaDePagamento;
    }

    
}
