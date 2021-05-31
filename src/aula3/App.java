package aula3;

//Visão
public class App {

    public static void main(String[] args) {
        CadastroUsuario cadastroUsuario = new CadastroUsuario();

        cadastroUsuario.salvar(new Usuario("joao@gmail.com", "João",
                "123456"));
        cadastroUsuario.salvar(new Usuario("maria@hotmail.com", "Maria",
                "5654321"));

        cadastroUsuario.deletar(new Usuario("joao@gmail.com", "João",
                "123456"));

        System.out.println(cadastroUsuario.getUsuarios());

    }

}
