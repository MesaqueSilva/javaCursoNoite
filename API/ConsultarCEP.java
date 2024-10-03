import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class ConsultarCEP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o CEP: ");
        String cep = scanner.nextLine(); // Lê o CEP fornecido pelo usuário
        
        String jsonResponse = buscarCep(cep);
        
        // Formatar e imprimir a resposta
        formatarResposta(jsonResponse);
        
        scanner.close();
    }

    public static String buscarCep(String cep) {
        try {
            String urlString = "https://viacep.com.br/ws/" + cep + "/json/";
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Ler a resposta
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

    public static void formatarResposta(String jsonResponse) {
        try {
            JSONObject jsonObject = new JSONObject(jsonResponse);
            System.out.println("Informações do Endereço:");
            System.out.println("CEP: " + jsonObject.getString("cep"));
            System.out.println("Logradouro: " + jsonObject.getString("logradouro"));
            System.out.println("Bairro: " + jsonObject.getString("bairro"));
            System.out.println("Cidade: " + jsonObject.getString("localidade"));
            System.out.println("Estado: " + jsonObject.getString("uf"));
        } catch (Exception e) {
            System.out.println("Erro ao processar a resposta: " + e.getMessage());
        }
    }
}
