package br.com.aulagui.view.joptionpane;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Theis Geraldi
 */
public class MessageDialogGUI {
    private static Component janelaMensagem;
    
    // Define a classe como principal
    public static void main(String[] args) {
        
        // Mensagem de informação
        JOptionPane.showMessageDialog(janelaMensagem, 
                                      "Finalmente tudo está ok!", 
                                      "Informação",
                                      JOptionPane.INFORMATION_MESSAGE);
        
        // Mensagem de pergunta
        JOptionPane.showMessageDialog(janelaMensagem, 
                                      "Você está aí?", 
                                      "Pergunta",
                                      JOptionPane.QUESTION_MESSAGE);
        
        // Mensagem de aviso
        JOptionPane.showMessageDialog(janelaMensagem, 
                                      "Cuidado com o apagão!", 
                                      "Atenção",
                                      JOptionPane.WARNING_MESSAGE);
        
        // Mensagem de erro
        JOptionPane.showMessageDialog(janelaMensagem, 
                                      "Erro Fatal do Sistema!", 
                                      "Erro",
                                      JOptionPane.ERROR_MESSAGE);
        
        // Mensagem limpa sem ícone
        JOptionPane.showMessageDialog(janelaMensagem, 
                                      "Sem ícone ao lado", 
                                      "Janela Clean (Plain)",
                                      JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
