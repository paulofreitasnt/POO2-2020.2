package aula7;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tela extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JFormattedTextField campoData;
    private JLabel data;

    public Tela() {
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

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate = LocalDate.parse(campoData.getText(), dateTimeFormatter);

        data.setText(dateTimeFormatter.format(localDate));

    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Tela dialog = new Tela();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {

        campoData = new JFormattedTextField();

        try {
            MaskFormatter maskFormatter = new MaskFormatter("##/##/####");
            maskFormatter.install(campoData);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
