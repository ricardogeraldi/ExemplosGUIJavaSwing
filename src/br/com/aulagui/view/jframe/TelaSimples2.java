package br.com.aulagui.view.jframe;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Ricardo Theis Geraldi
 */
public class TelaSimples2 {
    
    // Define a classe como principal
    public static void main(String[] args) {
        
        // Instância a TelaSimples2
        JFrame tsdois = new JFrame();
        
        tsdois.setTitle("Tela 123"); // Define o título da tela
        tsdois.setSize(400, 600); // Estipula a largura e a altura da tela
        tsdois.getContentPane().setBackground(Color.blue); // Define a cor de fundo da tela
        tsdois.setVisible(true); // A tela está visível true = verdadeiro
        //tsdois.setLocationRelativeTo(null); // Centraliza o tela na tela
        tsdois.setDefaultCloseOperation(EXIT_ON_CLOSE); // Fecha a tela e termina o aplicativo
        // setExtendedState(MAXIMIZED_BOTH); // Inicializa a tela Maximizada
    }
    
}
