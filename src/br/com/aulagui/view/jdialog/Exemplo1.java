package br.com.aulagui.view.jdialog;

import java.awt.Color;
import javax.swing.JDialog;

/**
 *
 * @author Ricardo Theis Geraldi
 */
public class Exemplo1 extends JDialog {
    
    // Define a classe como principal
    public static void main(String[] arts) {
        
        // Instância a classe referente ao diálogo Exemplo1
        Exemplo1 ex1 = new Exemplo1();
        ex1.setTitle("Diálogo 1"); // Define o título da diálogo
        ex1.setSize(600,200); // Define a largura e a altura do diálogo
        ex1.setModal(true); // Se o diálogo é modal (true) ou não (false)
        ex1.getContentPane().setBackground(Color.red); // Define a cor de fundo do diálogo
        ex1.setVisible(true); // O diálogo está visível true = verdadeiro
        
        // Instância a classe referente ao diálogo Exemplo2
        Exemplo2 ex2 = new Exemplo2();
        ex2.setTitle("Diálogo 2"); // Define o título da diálogo
        ex2.setSize(400,250); // Define a largura e a altura do diálogo
        ex2.isModal(); // Método para confirmar se o diálogo é ou não modal
        ex2.getContentPane().setBackground(Color.green); // Define a cor de fundo da tela
        ex2.setVisible(true); // O diálogo está visível true = verdadeiro
    }
    
}
