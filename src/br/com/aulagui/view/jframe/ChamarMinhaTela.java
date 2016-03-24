package br.com.aulagui.view.jframe;

import java.awt.Color;

/**
 *
 * @author Ricardo Theis Geraldi
 */
public class ChamarMinhaTela {
    
    // Define a classe como principal
    public static void main(String[] args) {
        
        // Instância e chama a classe MinhaTela
        MinhaTelaExemplo mte = new MinhaTelaExemplo("Minha Tela");
        
        
        MinhaTelaExemplo mte2 = new MinhaTelaExemplo("Minha Tela");
        mte2.getContentPane().setBackground(Color.yellow); // Define a cor de fundo da tela
        
    }
    
}
