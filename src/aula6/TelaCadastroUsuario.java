package aula6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class TelaCadastroUsuario extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField campoEmail;
    private JTextField campoNome;
    private JPasswordField campoSenha;
    private JLabel labelLogo;
    private CadastroUsuario cadastroUsuario;

    public TelaCadastroUsuario() {

        try {
            cadastroUsuario = new CadastroUsuario();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Falha na conexão com o arquivo");
        }

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        pack();
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarUsuario();
            }
        });
    }

    private void salvarUsuario() {

        Usuario usuario = new Usuario(campoEmail.getText(), campoNome.getText(),
                new String(campoSenha.getPassword()));

        try {
            if(cadastroUsuario.salvar(usuario)){
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao salvar");
            }
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Falha na conexão com o arquivo");
        }

    }

    private void createUIComponents() {
        labelLogo = new JLabel();
        labelLogo.setIcon(new ImageIcon("imagens/usuario.png"));
    }
}
