import java.math.BigDecimal;

public abstract class Funcionario {

        protected int idFuncionario;
        protected String nomeFuncionario;
        protected BigDecimal salario;


        public Funcionario(int idFuncionario, String nomeFuncionario, BigDecimal salario) {
            this.idFuncionario = idFuncionario;
            this.nomeFuncionario = nomeFuncionario;
            this.salario = salario;
        }

        public abstract  BigDecimal calcularSalario();

        public int getIdFuncionario() {
            return idFuncionario;
        }

        public String getNomeFuncionario() {
            return nomeFuncionario;
        }

        public BigDecimal getSalario() {
            return salario;
        }

        
        
}