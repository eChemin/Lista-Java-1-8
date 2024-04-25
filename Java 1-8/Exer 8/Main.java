import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();

        Pizza pizza1 = new Pizza("Mussarela", 30.0, new String[]{"Molho de tomate", "Mussarela"});
        Pizza pizza2 = new Pizza("Calabresa", 35.0, new String[]{"Molho de tomate", "Calabresa", "Cebola"});
        Pizza pizza3 = new Pizza("Frango com Catupiry", 40.0, new String[]{"Molho de tomate", "Frango", "Catupiry"});

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n### Menu ###");
            System.out.println("1. Adicionar pizza ao pedido");
            System.out.println("2. Remover pizza do pedido");
            System.out.println("3. Informar endereço de entrega");
            System.out.println("4. Finalizar pedido");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n### Menu de Pizzas ###");
                    System.out.println("1. Mussarela - R$30.00");
                    System.out.println("2. Calabresa - R$35.00");
                    System.out.println("3. Frango com Catupiry - R$40.00");
                    System.out.print("Escolha uma pizza (1-3): ");
                    int escolhaPizza = scanner.nextInt();
                    scanner.nextLine(); /
                    switch (escolhaPizza) {
                        case 1:
                            pedido.adicionarPizza(pizza1);
                            break;
                        case 2:
                            pedido.adicionarPizza(pizza2);
                            break;
                        case 3:
                            pedido.adicionarPizza(pizza3);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Digite o índice da pizza que deseja remover: ");
                    int indicePizza = scanner.nextInt();
                    pedido.removerPizza(indicePizza);
                    break;
                case 3:
                    System.out.print("Digite o endereço de entrega: ");
                    String endereco = scanner.nextLine();
                    pedido.setEnderecoEntrega(endereco);
                    break;
                case 4:
                    if (pedido.getPizzas().isEmpty()) {
                        System.out.println("Não há pizzas no pedido.");
                    } else if (pedido.getEnderecoEntrega() == null || pedido.getEnderecoEntrega().isEmpty()) {
                        System.out.println("Por favor, informe o endereço de entrega.");
                    } else {
                        System.out.println("\n### Pedido Finalizado ###");
                        System.out.println("Endereço de entrega: " + pedido.getEnderecoEntrega());
                        System.out.println("Pizzas:");
                        for (int i = 0; i < pedido.getPizzas().size(); i++) {
                            System.out.println((i + 1) + ". " + pedido.getPizzas().get(i).getNome() + " - R$" +
                                    pedido.getPizzas().get(i).getValor());
                        }
                        System.out.println("Total: R$" + pedido.calcularTotal());
                        continuar
