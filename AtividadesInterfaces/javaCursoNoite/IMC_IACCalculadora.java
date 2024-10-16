package javaCursoNoite;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IMC_IACCalculadora extends JFrame {
    private JTextField weightField;
    private JTextField heightField;
    private JTextField waistField;
    private JTextArea resultArea;

    public IMC_IACCalculadora() {
        setTitle("Calculadora de IMC e IAC");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel weightLabel = new JLabel("Peso (kg):");
        weightLabel.setBounds(10, 20, 80, 25);
        panel.add(weightLabel);

        weightField = new JTextField(20);
        weightField.setBounds(100, 20, 165, 25);
        panel.add(weightField);

        JLabel heightLabel = new JLabel("Altura (m):");
        heightLabel.setBounds(10, 50, 80, 25);
        panel.add(heightLabel);

        heightField = new JTextField(20);
        heightField.setBounds(100, 50, 165, 25);
        panel.add(heightField);

        JLabel waistLabel = new JLabel("Cintura (cm):");
        waistLabel.setBounds(10, 80, 100, 25);
        panel.add(waistLabel);

        waistField = new JTextField(20);
        waistField.setBounds(120, 80, 165, 25);
        panel.add(waistField);

        JButton calculateButton = new JButton("Calcular");
        calculateButton.setBounds(10, 110, 150, 25);
        panel.add(calculateButton);

        resultArea = new JTextArea();
        resultArea.setBounds(10, 140, 250, 100);
        resultArea.setEditable(false); // Impede a edição do resultado
        panel.add(resultArea);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    calculateResults();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                        IMC_IACCalculadora.this, 
                        "Por favor, insira valores numéricos válidos.",
                        "Erro de Entrada",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });
    }

    private void calculateResults() {
        // Verifica se todos os campos estão preenchidos
        if (weightField.getText().isEmpty() || 
            heightField.getText().isEmpty() || 
            waistField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                this, 
                "Todos os campos precisam ser preenchidos.",
                "Erro de Entrada",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // Converte as entradas para double
        double weight = Double.parseDouble(weightField.getText());
        double height = Double.parseDouble(heightField.getText());
        double waist = Double.parseDouble(waistField.getText());

        // Calcula o IMC (Peso / Altura²)
        double imc = weight / Math.pow(height, 2);

        // Calcula o IAC (Cintura / Altura) - 18 (Cintura em metros, então dividimos por 100)
        double iac = (waist / (height * 100)) - 18;

        // Formata o resultado
        String result = String.format("IMC: %.2f\nIAC: %.2f", imc, iac);
        resultArea.setText(result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            IMC_IACCalculadora calculator = new IMC_IACCalculadora();
            calculator.setVisible(true);
        });
    }
}
