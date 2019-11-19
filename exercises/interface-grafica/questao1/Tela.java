package questao1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela implements ActionListener {
    private JFrame janela;
    private JLabel rotuloNumero1;
    private JTextField campoNumero1;
    private JLabel rotuloNumero2;
    private JTextField campoNumero2;
    private JButton botaoAdicao;
    private JButton botaoSubtracao;
    private JButton botaoMultiplicacao;
    private JButton botaoDivisao;
    
    public Tela() {
        janela = new JFrame("Calculadora");
        rotuloNumero1 = new JLabel("Numero 1:");
        campoNumero1 = new JTextField();
        rotuloNumero2 = new JLabel("Numero 2:");
        campoNumero2 = new JTextField();
        botaoAdicao = new JButton("+");
        botaoSubtracao = new JButton("-");
        botaoMultiplicacao = new JButton("*");
        botaoDivisao = new JButton("/");
        
        botaoAdicao.addActionListener(this);
        botaoSubtracao.addActionListener(this);
        botaoMultiplicacao.addActionListener(this);
        botaoDivisao.addActionListener(this);
        
        montarJanela();
    }
    
    private void montarJanela() {
        janela.setSize(200, 150);
        janela.setLayout(new GridLayout(2, 4));
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.add(rotuloNumero1);
        janela.add(campoNumero1);
        janela.add(rotuloNumero2);
        janela.add(campoNumero2);
        janela.add(botaoAdicao);
        janela.add(botaoSubtracao);
        janela.add(botaoMultiplicacao);
        janela.add(botaoDivisao);
        janela.pack();
    }
    
    public void exibir() {
        janela.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        float numero1 = Float.parseFloat(campoNumero1.getText());
        float numero2 = Float.parseFloat(campoNumero2.getText());
        float resultado;
        
        if (e.getSource() == botaoAdicao) {
            resultado = numero1 + numero2;
            JOptionPane.showMessageDialog(janela, "O resultado da soma é " + resultado);
        } else if (e.getSource() == botaoSubtracao) {
            resultado = numero1 - numero2;
            JOptionPane.showMessageDialog(janela, "O resultado da subtração é " + resultado);
        } else if (e.getSource() == botaoMultiplicacao) {
            resultado = numero1 * numero2;
            JOptionPane.showMessageDialog(janela, "O resultado da multiplicação é " + resultado);
        } else if (e.getSource() == botaoDivisao) {
            resultado = numero1 / numero2;
            JOptionPane.showMessageDialog(janela, "O resultado da divisão é " + resultado);
        }
    }
}
