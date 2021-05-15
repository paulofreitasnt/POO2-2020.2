package aula1;

import java.time.LocalDate;

public class Professor extends Pessoa{

    private float salario;
    private String titulacao;

    public Professor(String cpf, String nome, LocalDate nascimento,
                     float salario, String titulacao) {
        super(cpf, nome, nascimento);
        this.salario = salario;
        this.titulacao = titulacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

}
