package aula5;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

//        JOptionPane.showMessageDialog(null, "Hello World!",
//                "Título da janela", JOptionPane.WARNING_MESSAGE);

//        String nome = JOptionPane.showInputDialog(null,
//                "Digite seu nome:", "Título",
//                JOptionPane.PLAIN_MESSAGE);

        int resultado = JOptionPane.showConfirmDialog(null,
                "Deseja continuar", "Título da janela",
                JOptionPane.OK_CANCEL_OPTION);

        if(resultado == JOptionPane.OK_OPTION){
            System.out.println("Escolheu ok");
        }else if(resultado == JOptionPane.CANCEL_OPTION){
            System.out.println("Escolheu cancelar");
        }

    }

}
