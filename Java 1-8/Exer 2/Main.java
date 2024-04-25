import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro = null;
        
        int opcao;
        do {
            System.out.println("\n### Menu ###");
            System.out.println("1. Criar novo livro");
            System.out.println("2. Exibir informações do livro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.println("\n### Criar novo livro ###");
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicação do livro: ");
                    int anoPublicacao = scanner.nextInt();
                    livro = new Livro(titulo, autor, anoPublicacao);
                    System.out.println("Livro criado com sucesso!");
                    break;
                    
                case 2:
                    if (livro != null) {
                        System.out.println("\n### Informações do livro ###");
                        livro.exibirInfo();
                    } else {
                        System.out.println("\nNenhum livro foi criado ainda.");
                    }
                    break;
                    
                case 3:
                    System.out.println("\nSaindo...");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 3);
        
        scanner.close();
    }
}
