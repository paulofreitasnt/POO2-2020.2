package aula6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class TelaLogin extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField campoEmail;
    private JPasswordField campoSenha;
    private JLabel logo;
    private CadastroUsuario cadastroUsuario;

    public TelaLogin() {

        try {
            cadastroUsuario = new CadastroUsuario();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Falha na conexão com o arquivo");
        }

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaCadastro();
            }
        });
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaPrincipal();
            }
        });
    }

    private void abrirTelaPrincipal() {

        try {
            Usuario usuario = cadastroUsuario.buscarPorEmail(campoEmail.getText());

            if(usuario == null){
                JOptionPane.showMessageDialog(null,
                        "Usuário não encontrado");
            }else{
                if(new String(campoSenha.getPassword()).equals(usuario.getSenha())){
                    TelaPrincipal telaPrincipal = new TelaPrincipal();
                    telaPrincipal.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Senha incorreta!");
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Falha na conexão com o arquivo");
        }

    }

    private void abrirTelaCadastro() {
        TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario();
        telaCadastroUsuario.setVisible(true);
    }

    public static void main(String[] args) {
        TelaLogin dialog = new TelaLogin();
        dialog.pack();
        dialog.setVisible(true);
    }

    private void createUIComponents() {
        logo = new JLabel();
        logo.setIcon(new ImageIcon("imagens/cadeado.png"));
    }
}
