package aula4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CadastroUsuario {

    private File arquivo;

    public CadastroUsuario() throws IOException {
        arquivo = new File("usuarios.txt");

        if(!arquivo.exists()){
            arquivo.createNewFile();
        }
    }

    public List<Usuario> getUsuarios() throws IOException, ClassNotFoundException {
        if(arquivo.length()!=0){
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
            return (List<Usuario>) in.readObject();
        }
        return new ArrayList<>();
    }

    public boolean salvar(Usuario usuario) throws IOException, ClassNotFoundException {
        List<Usuario> usuarios = getUsuarios();

        if(usuarios.add(usuario)){
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
            out.writeObject(usuarios);
            return true;
        }else{
            return false;
        }
    }

    public boolean deletar(Usuario usuario) throws IOException, ClassNotFoundException {
        List<Usuario> usuarios = getUsuarios();

        if(usuarios.remove(usuario)){
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
            out.writeObject(usuarios);
            return true;
        }else{
            return false;
        }
    }

    public boolean atualizar(String email, String novoNome) throws IOException, ClassNotFoundException {
        List<Usuario> usuarios = getUsuarios();

        for(int i=0; i<usuarios.size(); i++){
            Usuario u = usuarios.get(i);
            if(u.getEmail().equals(email)){
                u.setNome(novoNome);
                usuarios.set(i, u);
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
                out.writeObject(usuarios);
                return true;
            }
        }
        return false;

    }

}
