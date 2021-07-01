package aula4;

import java.io.IOException;

public class App {

    public static void main(String[] args) {

        try {

            CadastroUsuario cadastroUsuario = new CadastroUsuario();

            System.out.println(cadastroUsuario.getUsuarios());

            System.out.println(cadastroUsuario
                    .buscarPorEmail("paulo.freitas.nt2@gmail.com"));


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
