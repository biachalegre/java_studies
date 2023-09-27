package application;

public class Student extends Person {
    private double mensalidade;

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public void mostraDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataDeNascimento);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Mensalidade: " + this.mensalidade);
    }

}
