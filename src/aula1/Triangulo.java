package aula1;

public class Triangulo extends FormaGeometrica{

    private float base;
    private float altura;

    public Triangulo(int codigo, String descricao, float base, float altura) {
        super(codigo, descricao);
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return (base*altura)/2;
    }

}
