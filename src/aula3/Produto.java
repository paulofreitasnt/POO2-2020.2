package aula3;

import java.time.LocalDate;
import java.util.Objects;

//Model
public class Produto {

    private int codigo;
    private String descricao;
    private float preco;
    private LocalDate validade;

    public Produto(int codigo, String descricao, float preco, LocalDate validade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.validade = validade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", validade=" + validade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo && Float.compare(produto.preco, preco) == 0 && Objects.equals(descricao, produto.descricao) && Objects.equals(validade, produto.validade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descricao, preco, validade);
    }
}