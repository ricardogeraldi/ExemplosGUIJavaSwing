package br.com.aulagui.view.jframe;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Ricardo Theis Geraldi
 */
public class MinhaTelaExemplo extends JFrame {
    
    MinhaTelaExemplo (String titulo) {
        super(titulo);
        setSize(640, 480); // Estipula a largura e a altura da tela
        getContentPane().setBackground(Color.orange); // Define a cor de fundo da tela
        setVisible(true); // A tela está visível true = verdadeiro
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Fecha a tela e termina o aplicativo
    }
    
}
