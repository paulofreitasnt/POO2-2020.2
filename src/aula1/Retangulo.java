package aula1;

public class Retangulo extends FormaGeometrica{

    private float lado1;
    private float lado2;

    public Retangulo(int codigo, String descricao, float lado1, float lado2) {
        super(codigo, descricao);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    @Override
    public float calcularArea() {
        return lado1*lado2;
    }

}
