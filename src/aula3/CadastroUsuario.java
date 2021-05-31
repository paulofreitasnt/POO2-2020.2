package aula3;

import java.util.ArrayList;
import java.util.List;

//Controle
public class CadastroUsuario {

    List<Usuario> usuarios;

    //Inicializar a lista no construtor
    public CadastroUsuario() {
        usuarios = new ArrayList<>();
    }

    //Salva um usuário na lista
    public boolean salvar(Usuario usuario){
        return usuarios.add(usuario);
    }

    //Recupera todos os usuários
    public List<Usuario> getUsuarios(){
        return usuarios;
    }

    //Remover um usuário
    public boolean deletar(Usuario usuario){
        return usuarios.remove(usuario);
    }

}
