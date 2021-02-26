package TesteJDesktop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class ProjetoJAVAgui extends JFrame{

    private JTextField campo1, campo2;
    private JLabel nome, sobrenome;
    private JButton botao1;
    private JButton botao2;



    private JDesktopPane desktop;
    public ProjetoJAVAgui(){
        super("Teste");

        desktop = new JDesktopPane();
        desktop.setBackground(Color.lightGray);
        desktop.setToolTipText("JDesktopPane.");
        this.getContentPane().add(desktop);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        nome = new JLabel("Nome");
        nome.setToolTipText("Escreva seu nome no campo ao lado");
        container.add(nome);
        campo1 = new JTextField(15);
        container.add(campo1);
        sobrenome = new JLabel("Sobrenome");
        sobrenome.setToolTipText("Escreva seu sobrenome no campo ao lado");
        container.add(sobrenome);
        campo2 = new JTextField(15);
        container.add(campo2);
        JButton botao1 = new JButton("Adicionar");
        botao1.setMnemonic(KeyEvent.VK_A);
        botao1.setToolTipText("une o nome ao sobrenome");
        container.add(botao1);

        JButton botao2 = new JButton("apagar");
        botao2.setMnemonic(KeyEvent.VK_P);
        botao2.setToolTipText("Limpa os campos nome e sobrenome");
        container.add(botao2);

        botao1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evento) {
                        JOptionPane.showMessageDialog(null,"Seu nome completo é: "+campo1.getText()+" "+campo2.getText());
                    }
                }
        );

        botao2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evento) {
                        campo1.setText(" ");
                        campo2.setText(" ");
                        repaint();
                    }
                }
        );

        setSize(700,600);
        setVisible(true);
    }
}

public class Main {

    public static void main(String[] args) {
        ProjetoJAVAgui aplicacao = new ProjetoJAVAgui();
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
