package aula5;

public class Funcionario {

    private String cpf;
    private String nome;
    private char sexo;
    private String profissao;
    private String senha;

    public Funcionario(String cpf, String nome, char sexo, String profissao, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.profissao = profissao;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", profissao='" + profissao + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
