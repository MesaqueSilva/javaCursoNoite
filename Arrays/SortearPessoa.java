

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SortearPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>(); // Lista para armazenar os nomes
        String nome;
        
        System.out.println("Digite os nomes das pessoas (ou 'sair' para finalizar):");

        // Captura os nomes
        while (true) {
            System.out.print("Nome: ");
            nome = scanner.nextLine();
            
            if (nome.equalsIgnoreCase("sair")) { // Se o usuário digitar 'sair', o loop termina
                break;
            }

            if (!nome.trim().isEmpty()) { // Verifica se o nome não está vazio
                nomes.add(nome);
            } else {
                System.out.println("Nome innome]válido. Tente novamente.");
            }
        }

        // Verifica se existem nomes na lista
        if (nomes.isEmpty()) {
            System.out.println("Nenhum nome foi inserido.");
        } else {
            // Sorteio
            Random random = new Random();
            int indiceSorteado = random.nextInt(nomes.size());
            String nomeSorteado = nomes.get(indiceSorteado);

            // Exibe o nome sorteado
            System.out.println("A pessoa sorteada foi: " + nomeSorteado);
        }

        scanner.close(); // Fecha o scanner
    }
}