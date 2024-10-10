class Animal {
    void fazerSom() {
        System.out.println("Animal faz som");
    }
}

class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Au Au");
    }
}

class Gato extends Animal {
    void fazerSom() {
        System.out.println("Miau");
    }
}

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal meuAnimal;

        meuAnimal = new Cachorro();
        meuAnimal.fazerSom();  // Saída: Au Au

        meuAnimal = new Gato();
        meuAnimal.fazerSom();  // Saída: Miau
        
        meuAnimal = new Animal();
        meuAnimal.fazerSom();  // Saída: Miau
        
    }
}