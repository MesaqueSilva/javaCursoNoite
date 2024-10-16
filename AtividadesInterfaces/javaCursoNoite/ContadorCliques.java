package javaCursoNoite;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorCliques extends JFrame {
    private int contador = 0;  // Variável para armazenar o número de cliques
    private JLabel contadorLabel;  // Exibe o valor do contador

    public ContadorCliques() {
        // Configurações da Janela
        setTitle("Contador de Cliques");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel para os componentes
        JPanel panel = new JPanel();
        add(panel);
        adicionarComponentes(panel);
    }

    private void adicionarComponentes(JPanel panel) {
        // Definir layout como nulo para personalizar posições
        panel.setLayout(null);

        // JLabel para mostrar o valor do contador
        contadorLabel = new JLabel("Contador: 0");
        contadorLabel.setBounds(765, 30, 100, 25);
        panel.add(contadorLabel);

        // JButton para incrementar o contador
        JButton botaoClique = new JButton("Clique aqui");
        botaoClique.setBounds(85, 70, 120, 30);
        panel.add(botaoClique);

        // Adiciona um evento de clique ao botão
        botaoClique.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;  // Incrementa o contador
                contadorLabel.setText("Contador: " + contador);  // Atualiza o JLabel
            }
        });
    }

    public static void main(String[] args) {
        // Executa a interface na thread principal do Swing
        SwingUtilities.invokeLater(() -> {
            ContadorCliques frame = new ContadorCliques();
            frame.setVisible(true);
        });
    }
}
