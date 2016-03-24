package br.com.aulagui.view.jframe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JWindow;

/**
 *
 * @author Ricardo Theis Geraldi
 */
public class MinhaTela extends JFrame {
    
    // Define a classe como principal
    public static void main(String[] args) {
        MinhaTela mt1 = new MinhaTela();
        mt1.setTitle("Minha Tela 1"); // Define o título da tela
        mt1.setSize(480, 480); // Estipula a largura e a altura da tela
        mt1.getContentPane().setBackground(Color.blue); // Define a cor de fundo da tela
        mt1.setVisible(true); // A tela está visível true = verdadeiro
        
        MinhaTela mt2 = new MinhaTela();
        mt2.setTitle("Minha Tela 2"); // Define o título da tela
        mt2.setSize(320, 240); // Estipula a largura e a altura da tela
        mt2.getContentPane().setBackground(Color.green); // Define a cor de fundo da tela
        mt2.setLocationRelativeTo(null); // Centraliza o tela na tela
        mt2.setVisible(true); // A tela está visível true = verdadeiro
        // mt2.toBack(); // Posiciona a tela atrás da outra
        
        /*
        MinhaTela mt1 = new MinhaTela();
        mt1.setTitle("Minha Tela 1"); // Define o título da tela
        mt1.setSize(480, 480); // Estipula a largura e a altura da tela
        mt1.getContentPane().setBackground(Color.blue); // Define a cor de fundo da tela
        mt1.setVisible(true); // A tela está visível true = verdadeiro
        
        JWindow tela = new JWindow(mt1);
        tela.setSize(480, 480); // Estipula a largura e a altura da tela
        tela.getContentPane().setBackground(Color.green); // Define a cor de fundo da tela
        tela.setVisible(true); // A tela está visível true = verdadeiro
        */
    }
    
}
