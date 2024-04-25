import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();
        
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();
        
        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Digite a placa do carro: ");
        String placa = scanner.nextLine();
        
        Carro carro = new Carro(marca, modelo, ano, placa);
        
        int opcao;
        do {
            System.out.println("\n### Menu ###");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Exibir informações do carro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade de aceleração (em km/h): ");
                    double quantidadeAceleracao = scanner.nextDouble();
                    carro.acelerar(quantidadeAceleracao);
                    break;
                    
                case 2:
                    System.out.print("Digite a quantidade de frenagem (em km/h): ");
                    double quantidadeFrenagem = scanner.nextDouble();
                    carro.frear(quantidadeFrenagem);
                    break;
                    
                case 3:
                    carro.exibirInfo();
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
