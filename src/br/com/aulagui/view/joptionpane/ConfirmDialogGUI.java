package br.com.aulagui.view.joptionpane;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Theis Geraldi
 */
public class ConfirmDialogGUI {
    private static Component janelaConfirmacao;
    
    // Define a classe como principal
    public static void main(String[] args) {
        
        // Mensagens de confirmação (optionType)
        JOptionPane.showConfirmDialog(janelaConfirmacao, 
                                      "Prossegue com a tarefa?", 
                                      "Escolha uma opção",
                                      JOptionPane.YES_NO_OPTION);
        
        JOptionPane.showConfirmDialog(janelaConfirmacao, 
                                      "Deseja realizar esta ação?", 
                                      "Escolha uma opção",
                                      JOptionPane.YES_NO_CANCEL_OPTION);
        
        JOptionPane.showConfirmDialog(janelaConfirmacao, 
                                      "Tem Certeza?", 
                                      "Escolha uma opção",
                                      JOptionPane.OK_CANCEL_OPTION);
        
    }
    
}
