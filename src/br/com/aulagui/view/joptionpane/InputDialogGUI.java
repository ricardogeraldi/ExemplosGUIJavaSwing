package br.com.aulagui.view.joptionpane;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Theis Geraldi
 */
public class InputDialogGUI {
    private static Component janelaEntrada;
    private static Component janelaResposta;
    
    // Define a classe como principal
    public static void main(String[] args) {
        
        // Janela de entrada
        String nome = JOptionPane.showInputDialog(janelaEntrada, 
                                                  "Qual é o seu nome?", 
                                                  "Identifique-se",
                                                  JOptionPane.QUESTION_MESSAGE);
        // Janela de resposta
        JOptionPane.showMessageDialog(janelaResposta, 
                                      nome, 
                                      "Resposta", 
                                      JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
