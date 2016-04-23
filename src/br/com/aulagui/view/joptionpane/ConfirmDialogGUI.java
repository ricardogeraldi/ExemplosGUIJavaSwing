package br.com.aulagui.view.joptionpane;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Theis Geraldi
 */
public class ConfirmDialogGUI {
    private static Component janelaConfirmacao;
    
    // Define a classe como Principal
    public static void main(String[] args) {
        
        // Mensagens de Confirmação (OptionType)
        JOptionPane.showConfirmDialog(janelaConfirmacao, 
                                      "Prossegue com a Tarefa?", 
                                      "Escolha uma Opção",
                                      JOptionPane.YES_NO_OPTION);
        
        JOptionPane.showConfirmDialog(janelaConfirmacao, 
                                      "Deseja realizar esta Ação?", 
                                      "Escolha uma Opção",
                                      JOptionPane.YES_NO_CANCEL_OPTION);
        
        JOptionPane.showConfirmDialog(janelaConfirmacao, 
                                      "Tem Certeza?", 
                                      "Escolha uma Opção",
                                      JOptionPane.OK_CANCEL_OPTION); 
    }  
}