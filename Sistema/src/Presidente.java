import java.math.BigDecimal;

public final class Presidente extends Funcionario implements Autenticavel{
    
    private BigDecimal valorCota;

    public Presidente(int idFuncionario, String nomeFuncionario, BigDecimal salario, BigDecimal valorCota) {
        super(idFuncionario, nomeFuncionario, salario);
        this.valorCota = valorCota;
    }


    @Override
    public BigDecimal calcularSalario(){
        //O Gerente deve ter adicionado ao salário base o valor do bônus
        
        return getSalario().add(valorCota);

    }


    public BigDecimal getValorCota() {
        return valorCota;
    }


    @Override
    public String toString() {
        return "Código do Funcionário(a): " + idFuncionario + ", Nome do Funcionário(a): " + nomeFuncionario + ", Salario: " + calcularSalario() + ", Valor da Cota: " + valorCota;
      }


    @Override
    public void autenticar() {
        System.out.println("Presidente Logado");
    }
    
}
