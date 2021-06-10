package aula3;

//Visão
public class App {

    public static void main(String[] args) {
        CadastroUsuario cadastroUsuario = new CadastroUsuario();

        cadastroUsuario.salvar(new Usuario("joao@gmail.com", "João",
                "123456"));
        cadastroUsuario.salvar(new Usuario("maria@hotmail.com", "Maria",
                "5654321"));

        System.out.println(cadastroUsuario.getUsuarios());

//        System.out.println(cadastroUsuario.buscarPorEmail("joao2@gmail.com"));

        if(cadastroUsuario.atualizar("joao@gmail.com", "João da Silva")){
            System.out.println("Atualizado!");
        }else{
            System.out.println("Não atualizado!");
        }

        System.out.println(cadastroUsuario.getUsuarios());

    }

}
