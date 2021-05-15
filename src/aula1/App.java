package aula1;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        //Retirado devido a classe virar abstrata
//        Pessoa pessoa = new Pessoa("111.111.111-01", "João",
//                LocalDate.of(1990, 2, 28));
//
//        pessoa.setCpf("222.222.222-02");
//
//        System.out.println(pessoa.getCpf());

        Professor professor = new Professor("333.333.333-03", "Maria",
                LocalDate.of(1989,6,18), 2000,
                "Mestre");

        System.out.println(professor.getCpf());

        //Só tem acesso aos métodos de pessoa
        Pessoa pessoa = new Professor("444.444.444-04", "Pedro",
                LocalDate.of(1992,1,1), 2000,
                "Mestre");



    }

}
