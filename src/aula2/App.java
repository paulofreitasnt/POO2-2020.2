package aula2;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

//        Autenticavel autenticavel = new Usuario("joao@gmail.com",
//                "João", "123456", "joao");
//
//        autenticavel.autenticar("joao", "321654");

        List<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");

        nomes.add(0,"Ana");

        System.out.println(nomes);

        nomes.remove("Maria");

        nomes.set(1, "João da Silva");

        System.out.println(nomes);


    }

}
