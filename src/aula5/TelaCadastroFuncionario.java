package aula5;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TelaCadastroFuncionario extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField campoNome;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femininoRadioButton;
    private JComboBox comboBoxProfissao;
    private JPasswordField campoSenha;
    private JFormattedTextField campoCpf;
    private JFormattedTextField campoNascimento;

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

        //Instanciar o formatador
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Formata de String para LocalDate
        LocalDate nascimento = LocalDate.parse(campoNascimento.getText(), formatter);
        //Formata LocalDate para String
        System.out.println(formatter.format(nascimento));

        String senha = new String(campoSenha.getPassword());

        char sexo;
        if(masculinoRadioButton.isSelected()){
            sexo = 'M';
        }else{
            sexo = 'F';
        }

        String profissao = (String) comboBoxProfissao.getSelectedItem();

        Funcionario funcionario = new Funcionario(cpf,nome,nascimento, sexo, profissao,senha);

        System.out.println(funcionario);

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

    private void createUIComponents() {

        try {
            MaskFormatter formatter = new MaskFormatter("###.###.###-##");
            campoCpf = new JFormattedTextField();
            formatter.install(campoCpf);

            MaskFormatter formatter1 = new MaskFormatter("##/##/####");
            campoNascimento = new JFormattedTextField();
            formatter1.install(campoNascimento);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
