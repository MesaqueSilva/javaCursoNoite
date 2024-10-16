package javaCursoNoite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompiladoAtividades4_5_6 extends JFrame {
    private JPanel painelPrincipal;

    public CompiladoAtividades4_5_6() {
        setTitle("Interface Com Menu");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        criarMenu();  // Método para criar o menu
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new CardLayout());
        add(painelPrincipal);

        // Adiciona os painéis das funcionalidades no painel principal
        painelPrincipal.add(criarPainelFormulario(), "Formulario");
        painelPrincipal.add(criarPainelCalculadora(), "Calculadora");
        painelPrincipal.add(criarPainelTrocaDeCor(), "TrocaDeCor");
    }

    private void criarMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        JMenuItem itemFormulario = new JMenuItem("Formulário Simples");
        JMenuItem itemCalculadora = new JMenuItem("Calculadora Básica");
        JMenuItem itemTrocaDeCor = new JMenuItem("Troca de Cor");

        // Adiciona os itens ao menu
        menu.add(itemFormulario);
        menu.add(itemCalculadora);
        menu.add(itemTrocaDeCor);

        // Adiciona o menu na barra de menu
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // Adiciona os eventos para trocar de tela
        itemFormulario.addActionListener(e -> trocarTela("Formulario"));
        itemCalculadora.addActionListener(e -> trocarTela("Calculadora"));
        itemTrocaDeCor.addActionListener(e -> trocarTela("TrocaDeCor"));
    }

    private JPanel criarPainelFormulario() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(10, 20, 80, 25);
        panel.add(nomeLabel);

        JTextField nomeField = new JTextField(20);
        nomeField.setBounds(100, 20, 165, 25);
        panel.add(nomeField);

        JLabel idadeLabel = new JLabel("Idade:");
        idadeLabel.setBounds(10, 60, 80, 25);
        panel.add(idadeLabel);

        JTextField idadeField = new JTextField(20);
        idadeField.setBounds(100, 60, 165, 25);
        panel.add(idadeField);

        JButton enviarButton = new JButton("Enviar");
        enviarButton.setBounds(100, 100, 100, 30);
        panel.add(enviarButton);

        enviarButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String idade = idadeField.getText();
            JOptionPane.showMessageDialog(this, "Nome: " + nome + "\nIdade: " + idade);
        });

        return panel;
    }

    private JPanel criarPainelCalculadora() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel numero1Label = new JLabel("Número 1:");
        numero1Label.setBounds(10, 20, 80, 25);
        panel.add(numero1Label);

        JTextField numero1Field = new JTextField(10);
        numero1Field.setBounds(100, 20, 165, 25);
        panel.add(numero1Field);

        JLabel numero2Label = new JLabel("Número 2:");
        numero2Label.setBounds(10, 60, 80, 25);
        panel.add(numero2Label);

        JTextField numero2Field = new JTextField(10);
        numero2Field.setBounds(100, 60, 165, 25);
        panel.add(numero2Field);

        JButton somarButton = new JButton("Somar");
        somarButton.setBounds(100, 100, 100, 30);
        panel.add(somarButton);

        JLabel resultadoLabel = new JLabel("Resultado: ");
        resultadoLabel.setBounds(10, 140, 250, 25);
        panel.add(resultadoLabel);

        somarButton.addActionListener(e -> {
            double num1 = Double.parseDouble(numero1Field.getText());
            double num2 = Double.parseDouble(numero2Field.getText());
            double soma = num1 + num2;
            resultadoLabel.setText("Resultado: " + soma);
        });

        return panel;
    }

    private JPanel criarPainelTrocaDeCor() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton vermelhoButton = new JButton("Vermelho");
        vermelhoButton.setBounds(10, 20, 100, 30);
        panel.add(vermelhoButton);

        JButton azulButton = new JButton("Azul");
        azulButton.setBounds(120, 20, 100, 30);
        panel.add(azulButton);

        JButton verdeButton = new JButton("Verde");
        verdeButton.setBounds(230, 20, 100, 30);
        panel.add(verdeButton);

        // Troca a cor do próprio 'panel'
        vermelhoButton.addActionListener(e -> panel.setBackground(Color.RED));
        azulButton.addActionListener(e -> panel.setBackground(Color.BLUE));
        verdeButton.addActionListener(e -> panel.setBackground(Color.GREEN));

        return panel;
    }

    private void trocarTela(String nomePainel) {
        CardLayout layout = (CardLayout) painelPrincipal.getLayout();
        layout.show(painelPrincipal, nomePainel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CompiladoAtividades4_5_6().setVisible(true);
        });
    }
}
