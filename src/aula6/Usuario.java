package aula6;

import java.io.Serializable;
import java.util.Objects;

//Classe de modelo
public class Usuario implements Serializable {

    private String email;
    private String nome;
    private String senha;

    public Usuario(String email, String nome, String senha) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Exibe as informações do objeto como String
    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    //Como comparar dois objetos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(email, usuario.email) && Objects.equals(nome, usuario.nome) && Objects.equals(senha, usuario.senha);
    }

    //Auxilia no equals
    @Override
    public int hashCode() {
        return Objects.hash(email, nome, senha);
    }

}