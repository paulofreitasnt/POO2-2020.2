package aula1;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(1, "Exemplo de quadrado",
                3);

        Triangulo triangulo = new Triangulo(2, "Exemplo de triângulo",
                2, 6);

        System.out.println(quadrado.calcularArea());
        System.out.println(triangulo.calcularArea());

    }

}
