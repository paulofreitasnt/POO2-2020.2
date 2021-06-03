package aula2;

import java.time.LocalDate;

public class Produto {

    private int codigo;
    private String nome;
    private float preco;
    private LocalDate validade;

    public Produto(int codigo, String nome, float preco, LocalDate validade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
}
