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

    //Buscar um usuário pelo seu e-mail
    public Usuario buscarPorEmail(String email){
        for(Usuario u : usuarios){
            if(u.getEmail().equals(email)){
                return u;
            }
        }
        return null;
    }

    //Atualizar a partir do e-mail
    public boolean atualizar(String email, String nome){
        for(int i=0; i<usuarios.size(); i++){
            Usuario u = usuarios.get(i);
            if(u.getEmail().equals(email)){
                u.setNome(nome);
                usuarios.set(i, u);
                return true;
            }
        }
        return false;
    }

}
