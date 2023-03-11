import java.math.BigDecimal;

public class Gerente extends Funcionario implements Autenticavel{

    private String area;
    private BigDecimal bonus;
    


    public Gerente(int idFuncionario, String nomeFuncionario, BigDecimal salario, String area, BigDecimal bonus) {
        super(idFuncionario, nomeFuncionario, salario);
        this.area = area;
        this.bonus = bonus;
    }
    
    @Override
    public BigDecimal calcularSalario(){
        //O Gerente deve ter adicionado ao salário base o valor do bônus
        
        return getSalario().add(bonus);

    }

    public String getArea() {
        return area;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Código do Funcionário(a): " + idFuncionario + ", Nome do Funcionário(a): " + nomeFuncionario + ", Salario: " + calcularSalario() + ", Area: " + area + " e Bonus: " + bonus;
      }

    @Override
    public void autenticar() {
        System.out.println("Gerente logado");
    }
}
