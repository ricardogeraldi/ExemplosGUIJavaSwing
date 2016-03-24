package br.com.aulagui.view.jframe;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Ricardo Theis Geraldi
 */
public class TelaSimples3 extends JFrame {
    
    // Define a classe como principal
    public static void main(String[] args) {
        
        // Instância a TelaSimples3
        TelaSimples3 tstres = new TelaSimples3();
        
        tstres.setTitle("Tela Simples 3"); // Define o título da tela
        tstres.setSize(400, 480); // Estipula a largura e a altura da tela
        tstres.setVisible(true); // A tela está visível true = verdadeiro
        tstres.getContentPane().setBackground(Color.yellow); // Define a cor de fundo da tela
        tstres.setLocationRelativeTo(null); // Centraliza o tela na tela
        tstres.setDefaultCloseOperation(EXIT_ON_CLOSE); // Fecha a tela e termina o aplicativo
    }
    
}
