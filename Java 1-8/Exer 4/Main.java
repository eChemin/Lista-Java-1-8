import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do jogador: ");
        String nomeJogador = scanner.nextLine();
        
        System.out.print("Digite a pontuação inicial do jogador: ");
        int pontuacaoInicial = scanner.nextInt();
        
        System.out.print("Digite o nível inicial do jogador: ");
        int nivelInicial = scanner.nextInt();
        
        Jogador jogador = new Jogador(nomeJogador, pontuacaoInicial, nivelInicial);
        
        int opcao;
        do {
            System.out.println("\n### Menu ###");
            System.out.println("1. Aumentar pontuação");
            System.out.println("2. Subir de nível");
            System.out.println("3. Exibir informações do jogador");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser adicionado à pontuação: ");
                    int valorPontuacao = scanner.nextInt();
                    jogador.aumentarPontuacao(valorPontuacao);
                    break;
                    
                case 2:
                    jogador.subirNivel();
                    break;
                    
                case 3:
                    jogador.exibirInfo();
                    break;
                    
                case 4:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 4);
        
        scanner.close();
    }
}
