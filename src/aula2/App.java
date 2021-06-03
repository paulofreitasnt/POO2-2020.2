package aula2;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<String> minhaLista = new ArrayList<>();

        //C - Adicionar, salvar
        minhaLista.add("João");
        minhaLista.add("Maria");
        minhaLista.add(0, "Pedro");
        minhaLista.add("Ana");

        //R - ler
        System.out.println(minhaLista);
        System.out.println(minhaLista.get(2));

        //U - Atualizar
        minhaLista.set(1, "XXXXXXXX");

        //D - Deletar, remover...
        minhaLista.remove("Ana");

        System.out.println(minhaLista);

    }

}
