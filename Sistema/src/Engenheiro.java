import java.math.BigDecimal;

public class Engenheiro extends Funcionario{

    private String departamento;
    private String CREA;

    public Engenheiro(int idFuncionario, String nomeFuncionario, BigDecimal salario, String departamento, String cREA) {
        super(idFuncionario, nomeFuncionario, salario);
        this.departamento = departamento;
        CREA = cREA;
    }

    

    @Override
    public BigDecimal calcularSalario(){

        //O engenheiro tem um adicional de 50% sobre o salário base
        BigDecimal adicional;
        adicional = getSalario().multiply(new BigDecimal(0.5));
        return getSalario().add(adicional);
    }



    public String getDepartamento() {
        return departamento;
    }



    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }



    public String getCREA() {
        return CREA;
    }

    @Override
    public String toString() {
        return "Código do Funcionário(a): " + idFuncionario + ", Nome do Funcionário(a): " + nomeFuncionario + ", Salario: " + calcularSalario() + ", Departamento: " + departamento + " e CREA: " + CREA;
      }
    
}
