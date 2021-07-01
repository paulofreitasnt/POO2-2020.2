package aula4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CadastroUsuario {

    private File arquivo;

    public CadastroUsuario() throws IOException {

        //Abre o link para o arquivo
        arquivo = new File("usuarios.txt");

        //Verifica se o arquivo existe, caso não, cria ele.
        if(!arquivo.exists()){
            arquivo.createNewFile();
        }
    }

    public List<Usuario> getUsuarios() throws IOException, ClassNotFoundException {
        //Verifica se o arquivo contém alguma coisa
        if(arquivo.length()!=0){
            //Abre um fluxo de entrada com o arquivo
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
            //Lê o objeto, faz o casting para lista e retorna
            return (List<Usuario>) in.readObject();
        }
        //Retorna uma lista vazia caso o arquivo esteja vazio.
        return new ArrayList<>();
    }

    public boolean salvar(Usuario usuario) throws IOException, ClassNotFoundException {
        //Recupera a lista do arquivo
        List<Usuario> usuarios = getUsuarios();

        if(usuarios.add(usuario)){
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
            //Escreve no arquivo (por cima do que já está lá)
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

    public Usuario buscarPorEmail(String email) throws IOException, ClassNotFoundException {
        List<Usuario> usuarios = getUsuarios();

        for(Usuario u: usuarios){
            if(u.getEmail().equals(email)){
                return u;
            }
        }
        return null;
    }

}
