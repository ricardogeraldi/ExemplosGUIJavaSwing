package br.com.aulagui.view.jframe;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Ricardo Theis Geraldi
 */
public class TelaSimples4 extends JFrame {
    
    // Define a classe como principal
    public static void main(String[] args) {
        
        // Instância a TelaSimples4
        TelaSimples4 tsquatro = new TelaSimples4("Tela Simples 4");
        
        tsquatro.setSize(400, 480); // Estipula a largura e a altura da tela
        tsquatro.getContentPane().setBackground(Color.black); // Define a cor de fundo da tela
        tsquatro.setVisible(true); // A tela está visível true = verdadeiro
        tsquatro.setDefaultCloseOperation(EXIT_ON_CLOSE); // Fecha a tela e termina o aplicativo
    }
    
    TelaSimples4 (String titulo) {
        super(titulo);
    }
    
}
