import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrudArray1 {
    // Arrays para armazenar nome e idade
    static String[] nomes = new String[10];
    static int[] idades = new int[10];
    static int contador = 0;

    public static void main(String[] args) {
        criarInterface();
    }

    public static void criarInterface() {
        // Frame principal
        JFrame frame = new JFrame("CRUD de Usuários");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Área de entrada para o nome e idade
        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField(15);
        JLabel idadeLabel = new JLabel("Idade:");
        JTextField idadeField = new JTextField(5);
        JButton adicionarButton = new JButton("Adicionar");

        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(nomeLabel, gbc);
        gbc.gridx = 1;
        frame.add(nomeField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(idadeLabel, gbc);
        gbc.gridx = 1;
        frame.add(idadeField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(adicionarButton, gbc);

        // Área de exibição dos usuários
        JTextArea resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        frame.add(scrollPane, gbc);

        // Botões para Atualizar e Deletar
        JButton atualizarButton = new JButton("Atualizar");
        JButton deletarButton = new JButton("Deletar");

        gbc.gridy = 4;
        gbc.gridwidth = 1;
        frame.add(atualizarButton, gbc);
        gbc.gridx = 1;
        frame.add(deletarButton, gbc);

        // Exibir a lista de usuários ao inicializar
        exibirUsuarios(resultArea);

        // Ação para o botão "Adicionar"
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!nomeField.getText().isEmpty() && !idadeField.getText().isEmpty()) {
                    String nome = nomeField.getText();
                    int idade;
                    try {
                        idade = Integer.parseInt(idadeField.getText());
                    } catch (NumberFormatException ex) {
                        resultArea.setText("Erro: Idade inválida.");
                        return;
                    }

                    if (contador < nomes.length) {
                        nomes[contador] = nome;
                        idades[contador] = idade;
                        contador++;
                        nomeField.setText("");
                        idadeField.setText("");
                        exibirUsuarios(resultArea);
                    } else {
                        resultArea.setText("Erro: Limite de usuários atingido.");
                    }
                } else {
                    resultArea.setText("Por favor, preencha todos os campos.");
                }
            }
        });

        // Ação para o botão "Atualizar"
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String indexStr = JOptionPane.showInputDialog(frame, "Digite o número do usuário a ser atualizado:");
                if (indexStr != null && !indexStr.isEmpty()) {
                    int index = Integer.parseInt(indexStr) - 1;
                    if (index >= 0 && index < contador) {
                        String novoNome = JOptionPane.showInputDialog(frame, "Digite o novo nome:");
                        String novaIdadeStr = JOptionPane.showInputDialog(frame, "Digite a nova idade:");

                        try {
                            int novaIdade = Integer.parseInt(novaIdadeStr);
                            nomes[index] = novoNome;
                            idades[index] = novaIdade;
                            exibirUsuarios(resultArea);
                            resultArea.setText("Usuário atualizado com sucesso!");
                        } catch (NumberFormatException ex) {
                            resultArea.setText("Erro: Idade inválida.");
                        }
                    } else {
                        resultArea.setText("Usuário não encontrado.");
                    }
                }
            }
        });

        // Ação para o botão "Deletar"
        deletarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String indexStr = JOptionPane.showInputDialog(frame, "Digite o número do usuário a ser deletado:");
                if (indexStr != null && !indexStr.isEmpty()) {
                    int index = Integer.parseInt(indexStr) - 1;
                    if (index >= 0 && index < contador) {
                        for (int i = index; i < contador - 1; i++) {
                            nomes[i] = nomes[i + 1];
                            idades[i] = idades[i + 1];
                        }
                        contador--;
                        exibirUsuarios(resultArea);
                        resultArea.setText("Usuário deletado com sucesso!");
                    } else {
                        resultArea.setText("Usuário não encontrado.");
                    }
                }
            }
        });

        // Exibe o frame
        frame.setVisible(true);
    }

    // Exibir os usuários na área de texto
    public static void exibirUsuarios(JTextArea resultArea) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- Lista de Usuários ---\n");
        for (int i = 0; i < contador; i++) {
            sb.append((i + 1)).append(". Nome: ").append(nomes[i]).append(", Idade: ").append(idades[i]).append("\n");
        }
        resultArea.setText(sb.toString());
    }
}
