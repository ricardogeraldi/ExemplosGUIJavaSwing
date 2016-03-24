package br.com.aulagui.view.jframe;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Ricardo Theis Geraldi
 */
public class TelaSimples1 extends JFrame {
    
    // Define a classe como principal
    public static void main(String[] args) {
        
        // Instância a TelaSimples1
        TelaSimples1 tsum = new TelaSimples1("Tela Simples 1"); 
    }
    
    TelaSimples1 (String title) {
        super(title); // Define o título da tela
        // setTitle("Tela Simples 1"); // Outra forma para definir o título da tela
        setSize(640, 480); // Estipula a largura e a altura da tela
        setVisible(true); // A tela está visível true = verdadeiro
        getContentPane().setBackground(Color.cyan); // Define a cor de fundo da tela
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Fecha a tela e termina o aplicativo
    }
    
}