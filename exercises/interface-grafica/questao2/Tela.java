package questao2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela {
    private JFrame janela;
    private JLabel rotuloPalavra1;
    private JTextField campoPalavra1;
    private JButton botaoConversao;
    private JLabel rotuloPalavra2;
    private JTextField campoPalavra2;
    
    public Tela() {
        janela = new JFrame("Converter para Maiúscula");
        rotuloPalavra1 = new JLabel("Informe uma palavra:");
        campoPalavra1 = new JTextField();
        botaoConversao = new JButton("Converter para Maiúscula");
        rotuloPalavra2 = new JLabel("Palavra convertida:");
        campoPalavra2 = new JTextField();
        
        botaoConversao.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    campoPalavra2.setText(campoPalavra1.getText().toUpperCase());
                    campoPalavra2.setEditable(false);
                }
            }
        );
        
        montarJanela();
    }
    
    //setText
    //setEditable(false)
    
    private void montarJanela() {
        janela.setSize(400, 300);
        janela.setLayout(new BorderLayout());
        
        JPanel painelSuperior = new JPanel();
        painelSuperior.setLayout(new BoxLayout(painelSuperior, BoxLayout.X_AXIS));
        painelSuperior.add(rotuloPalavra1);
        painelSuperior.add(campoPalavra1);
        janela.add(painelSuperior, BorderLayout.NORTH);
        
        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(new FlowLayout());
        painelCentral.add(botaoConversao);
        janela.add(painelCentral, BorderLayout.CENTER);
        
        JPanel painelInferior = new JPanel();
        painelInferior.setLayout(new BoxLayout(painelInferior, BoxLayout.X_AXIS));
        painelInferior.add(rotuloPalavra2);
        painelInferior.add(campoPalavra2);
        janela.add(painelInferior, BorderLayout.SOUTH);
        
        janela.pack();
    }
    
    public void exibir() {
        janela.setVisible(true);
    }
}
