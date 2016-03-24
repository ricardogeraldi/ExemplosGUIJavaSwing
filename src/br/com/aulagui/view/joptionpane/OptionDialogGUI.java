package br.com.aulagui.view.joptionpane;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Theis Geraldi
 */
public class OptionDialogGUI {
    private static Component janelaOpcao;
    
    // Define a classe como principal
    public static void main(String[] args) {
        
        // Mensagem de informação
        Object[] opcoes =  {"Sim", "Não", "Mais Tarde", "Amanhã", "Sei lá!"};
        
        // Diálogo de confirmação com opções
        int resposta = JOptionPane.showOptionDialog(janelaOpcao, 
                                      "Prossegue com a tarefa?",
                                      "Escolha uma opção",
                                      JOptionPane.DEFAULT_OPTION,
                                      JOptionPane.QUESTION_MESSAGE,
                                      null,
                                      opcoes,
                                      opcoes[0]);
        
        // Se a janela for fechada...
        if (resposta == -1) {
            JOptionPane.showMessageDialog(null, "Você clicou para fechar a janela");
        } else {
            JOptionPane.showMessageDialog(null, resposta);
        }
    }
    
}
