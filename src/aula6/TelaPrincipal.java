package aula6;

import javax.swing.*;

public class TelaPrincipal extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel labelLogo;
    private JButton gerenciarUsuárioButton;
    private JButton realizarButton;
    private JButton editarButton;

    public TelaPrincipal() {
        setContentPane(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getRootPane().setDefaultButton(buttonOK);
        pack();
    }

    private void createUIComponents() {
        labelLogo = new JLabel();
        labelLogo.setIcon(new ImageIcon("imagens/logo.png"));
    }
}
