
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class SortearPessoas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
		String nome;
		
		System.out.println("Digite os nomes das pessoas(ou 'sair' para finalizar): ");
		
		while(true) {
			System.out.println("Digite o nome");
			nome = sc.nextLine();
		
			if ( nome.equalsIgnoreCase("sair")) {
				break;
				
			}
				
				nomes.add(nome);
			
		}
		
			
		if ( nomes.isEmpty()) {
			System.out.println("Nenhum nome foi digitado!");
			
		}else {
			
			Random ramdom = new Random();
			int indiceSorteado = ramdom.nextInt(nomes.size());
			String nomeSorteado = nomes.get(indiceSorteado);
			
			System.out.println("A pessoal sorteada foi: " + nomeSorteado);
		}
		
		
		
		
		sc.close();
	}

}
