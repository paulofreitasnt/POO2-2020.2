package aula1;

public abstract class FormaGeometrica {

    private int codigo;
    private String descricao;

    public FormaGeometrica(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
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

    //Toda classe que extende tem OBRIGAÇÃO de implementar
    public abstract float calcularArea();

}
