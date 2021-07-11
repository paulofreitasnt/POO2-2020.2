package aula4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class TelaCadastroUsuario extends JDialog {
    private JPanel contentPane;
    private JButton botaoSalvar;
    private JButton botaoDeletar;
    private JTextField campoEmail;
    private JTextField campoNome;
    private JPasswordField campoSenha;
    private JButton botaoBuscar;
    private JButton botaoAtualizar;
    private CadastroUsuario cadastroUsuario;

    public TelaCadastroUsuario() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(botaoSalvar);

        try {
            cadastroUsuario = new CadastroUsuario();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Falha ao abrir arquivo");
        }

        botaoBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarUsuario();
            }
        });

        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarUsuario();
            }
        });

        botaoDeletar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deletarUsuario();
            }
        });
        botaoAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarUsuario();
            }
        });
    }

    private void atualizarUsuario() {

        try {
            if(cadastroUsuario.atualizar(campoEmail.getText(),
                    campoNome.getText(),
                    new String(campoSenha.getPassword()))){
                JOptionPane.showMessageDialog(null, "Atualizado!");
            }else{
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
            }
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com arquivo");
        }

    }

    private void deletarUsuario() {

        Usuario usuario = new Usuario(campoEmail.getText(), null,null);

        try {
            if(cadastroUsuario.deletar(usuario)){
                JOptionPane.showMessageDialog(null, "Removido com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Usuário não existe");
            }
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Falha ao abrir arquivo");
        }

    }

    private void cadastrarUsuario() {

        Usuario usuario = new Usuario(campoEmail.getText(),
                campoNome.getText(),
                new String(campoSenha.getPassword()));

        try {
            if(cadastroUsuario.salvar(usuario)){
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao salvar");
            }
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Falha ao abrir arquivo");
        }

    }

    private void buscarUsuario() {
        Usuario usuario = null;

        try {
            usuario = cadastroUsuario.buscarPorEmail(campoEmail.getText());
        } catch (IOException | ClassNotFoundException ioException) {
            JOptionPane.showMessageDialog(null,
                    "Falha na conexão");
        }

        if(usuario == null){
            JOptionPane.showMessageDialog(null,
                    "Usuário não encontrado");
        }else{
            campoNome.setText(usuario.getNome());
            campoSenha.setText(usuario.getSenha());
        }
    }

    public static void main(String[] args) {
        TelaCadastroUsuario dialog = new TelaCadastroUsuario();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
