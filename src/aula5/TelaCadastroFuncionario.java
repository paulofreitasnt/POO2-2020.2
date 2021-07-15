package aula5;

import javax.swing.*;
import java.awt.event.*;

public class TelaCadastroFuncionario extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField campoNome;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femininoRadioButton;
    private JComboBox comboBoxProfissao;
    private JPasswordField campoSenha;
    private JTextField campoCpf;

    public TelaCadastroFuncionario() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {

        String cpf = campoCpf.getText();
        String nome = campoNome.getText();
        String senha = new String(campoSenha.getPassword());

        char sexo;
        if(masculinoRadioButton.isSelected()){
            sexo = 'M';
        }else{
            sexo = 'F';
        }

        String profissao = (String) comboBoxProfissao.getSelectedItem();

        Funcionario funcionario = new Funcionario(
                cpf,
                nome,
                sexo,
                profissao,
                senha
        );

        JOptionPane.showMessageDialog(null, funcionario, "Saída dos dados",
                JOptionPane.PLAIN_MESSAGE);

    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        TelaCadastroFuncionario dialog = new TelaCadastroFuncionario();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
