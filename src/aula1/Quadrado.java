package aula1;

public class Quadrado extends FormaGeometrica {

    private float lado;

    public Quadrado(int codigo, String descricao, float lado) {
        super(codigo, descricao);
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        return lado*lado;
    }

}