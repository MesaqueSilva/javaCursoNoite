import java.util.Scanner;

public class CrudArray2 {
    // Arrays para armazenar nome e idade
    static String[] nomes = new String[10];
    static int[] idades = new int[10];
    static int contador = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar usuário");
            System.out.println("2. Exibir usuários");
            System.out.println("3. Atualizar usuário");
            System.out.println("4. Deletar usuário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    adicionarUsuario(sc);
                    break;
                case 2:
                    // Implementar exibirUsuarios
                    break;
                case 3:
                    // Implementar atualizarUsuario
                    break;
                case 4:
                    // Implementar deletarUsuario
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
        } while (opcao != 5);

        sc.close();
    }

    // Criar (Adicionar usuario):
    public static void adicionarUsuario(Scanner sc) {
        if (contador < nomes.length) {
            System.out.print("Digite o nome: ");
            sc.nextLine();  // Consumir a nova linha pendente
            String nome = sc.nextLine();
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            nomes[contador] = nome;
            idades[contador] = idade;
            contador++;
            System.out.println("Usuário cadastrado com sucesso!");
        } else {
            System.out.println("Limite de usuários atingido.");
        }
    }

    // Métodos vazios para exibir, atualizar e deletar usuários:
    public static void exibirUsuarios() {
        // Implementar
    }

    public static void atualizarUsuario(Scanner sc) {
        // Implementar
    }

    public static void deletarUsuario(Scanner sc) {
        // Implementar
    }
}
