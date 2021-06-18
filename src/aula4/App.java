package aula4;

import java.io.IOException;

public class App {

    public static void main(String[] args) {

        try {
            CadastroUsuario cadastroUsuario = new CadastroUsuario();

//            cadastroUsuario.salvar(new Usuario("maria@gmail.com", "Maria",
//                    "654321"));
//            cadastroUsuario.salvar(new Usuario("joao@gmail.com", "João",
//                    "123456"));

//            cadastroUsuario.deletar(new Usuario("joao@gmail.com", "João",
//                    "123456"));

//            cadastroUsuario.atualizar("maria@gmail.com", "Maria da Silva");

            System.out.println(cadastroUsuario.getUsuarios());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
