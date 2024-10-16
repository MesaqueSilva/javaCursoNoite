package javaCursoNoite;

import java.util.Scanner;

public class ContadorSemInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 5005;  // Variável para armazenar o número de cliques

        System.out.println("Contador de Cliques");
        System.out.println("Pressione ENTER para incrementar o contador ou digite 'sair' para finalizar.");

        // Loop contínuo para aguardar entradas do usuário
        while (true) {
            System.out.print("Comando: ");
            String entrada = scanner.nextLine();  // Lê a entrada do usuário

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado. Contagem final: " + contador);
                break;  // Encerra o loop e o programa
            }

            contador++;  // Incrementa o contador
            System.out.println("Contador: " + contador);
        }

        scanner.close();  // Fecha o Scanner (boa prática)
    }
}
