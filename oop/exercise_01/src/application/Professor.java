package application;

public class Professor extends Person {
    private String formacaoAcademica;
    private double salario;

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
     @Override
    public void mostraDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataDeNascimento);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Formação Acadêmica: " + this.formacaoAcademica);
        System.out.println("Salário: " + this.salario); 
    }
}
