package br.puc.ua.encapsulamento.app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleFrame {

    private String string;   public static void main(String[] args) {
        JFrame frame = new JFrame("Teste de frame");
        JButton button = new JButton("Botão de teste");
        JLabel label = new JLabel("Label de teste");
        JPanel painel = new JPanel();
        
        painel.add(button); 
        painel.add(label);

        frame.getContentPane().add(painel);
        frame.pack();
        frame.setVisible(true);

        
    }
}
