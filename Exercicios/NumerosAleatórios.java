import java.util.Random;

public class NumerosAleatórios {
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("Números aleatórios gerados:");

        // Gera e exibe 5 números aleatórios entre 1 e 100
        for (int i = 0; i < 5; i++) {
            int numero = random.nextInt(100) + 1; // Gera número entre 1 e 100
            System.out.println(numero);
        }
    }
}
