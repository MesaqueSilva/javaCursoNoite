import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ConsultarCepComIG {

    public static void main(String[] args) {
        // Cria a interface gráfica
        criarInterface();
    }

    public static void criarInterface() {
        // Cria o frame principal
        JFrame frame = new JFrame("Consultar CEP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Configura o layout do frame para centralização
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.CENTER;
        
        // Cria o painel para a entrada de CEP
        JPanel panel = new JPanel(new GridBagLayout());
        JLabel label = new JLabel("Digite o CEP:");
        JTextField cepField = new JTextField(10);
        JButton consultarButton = new JButton("Consultar");

        // Configura a centralização do painel
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(label, gbc);
        gbc.gridx = 1;
        panel.add(cepField, gbc);
        gbc.gridx = 2;
        panel.add(consultarButton, gbc);

        // Área de texto para exibir o resultado
        JTextArea resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        resultArea.setFont(new Font("SansSerif", Font.PLAIN, 14));

        // Centraliza o texto no JTextArea
        resultArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        resultArea.setAlignmentX(JTextArea.CENTER_ALIGNMENT);

        JScrollPane scrollPane = new JScrollPane(resultArea);

        // Adiciona o painel e a área de texto ao frame
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        frame.add(panel, gbc);
        gbc.gridy = 2;
        frame.add(scrollPane, gbc);

        // Listener do botão
        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cep = cepField.getText();
                if (!cep.isEmpty()) {
                    String jsonResponse = buscarCep(cep);
                    resultArea.setText(formatarResposta(jsonResponse));
                } else {
                    resultArea.setText("Por favor, insira um CEP válido.");
                }
            }
        });

        // Exibe a janela
        frame.setVisible(true);
    }

    public static String buscarCep(String cep) {
        try {
            String urlString = "https://viacep.com.br/ws/" + cep + "/json/";
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } catch (Exception e) {
            return "Erro ao buscar CEP: " + e.getMessage();
        }
    }

    public static String formatarResposta(String jsonResponse) {
        try {
            JSONObject jsonObject = new JSONObject(jsonResponse);
            StringBuilder sb = new StringBuilder();
            sb.append("Informações do Endereço:\n");
            sb.append("CEP: ").append(jsonObject.getString("cep")).append("\n");
            sb.append("Logradouro: ").append(jsonObject.getString("logradouro")).append("\n");
            sb.append("Bairro: ").append(jsonObject.getString("bairro")).append("\n");
            sb.append("Cidade: ").append(jsonObject.getString("localidade")).append("\n");
            sb.append("Estado: ").append(jsonObject.getString("uf")).append("\n");

            return sb.toString();
        } catch (Exception e) {
            return "Erro ao processar a resposta: " + e.getMessage();
        }
    }
}
