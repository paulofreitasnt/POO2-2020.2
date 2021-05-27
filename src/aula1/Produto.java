package aula1;

import java.time.LocalDate;

public class Produto {

    private String genero;
    private float valor;
    private String descricao;
    private int codigoBarras;
    private LocalDate dataValidade;
    private int quantidadeEstoque;

    public Produto(String genero, float valor, String descricao,
                   int codigoBarras, LocalDate dataValidade, int quantidadeEstoque) {
        this.genero = genero;
        this.valor = valor;
        this.descricao = descricao;
        this.codigoBarras = codigoBarras;
        this.dataValidade = dataValidade;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

}
