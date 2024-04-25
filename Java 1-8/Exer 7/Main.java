public class Main {
    private static List<Produto> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Adicionar produto");
            System.out.println("2. Atualizar produto");
            System.out.println("3. Remover produto");
            System.out.println("4. Mostrar relatório de estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    atualizarProduto();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    mostrarRelatorioEstoque();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        System.out.println("Encerrando");
    }

    private static void adicionarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();
        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, codigo, preco, quantidade);
        estoque.add(produto);
        System.out.println("Produto adicionado ao estoque.");
    }

    private static void atualizarProduto() {
        System.out.print("Digite o código do produto que deseja atualizar: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        Produto produtoEncontrado = null;
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado != null) {
            System.out.print("Novo nome do produto: ");
            String novoNome = scanner.nextLine();
            System.out.print("Novo preço do produto: ");
            double novoPreco = scanner.nextDouble();
            System.out.print("Nova quantidade em estoque: ");
            int novaQuantidade = scanner.nextInt();

            produtoEncontrado.setNome(novoNome);
            produtoEncontrado.setPreco(novoPreco);
            produtoEncontrado.setQuantidadeEmEstoque(novaQuantidade);
            System.out.println("Produto atualizado.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void removerProduto() {
        System.out.print("Digite o código do produto que deseja remover: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        Produto produtoRemover = null;
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                produtoRemover = produto;
                break;
            }
        }

        if (produtoRemover != null) {
            estoque.remove(produtoRemover);
            System.out.println("Produto removido do estoque.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void mostrarRelatorioEstoque() {
        System.out.println("Relatório de Estoque:");
        for (Produto produto : estoque) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
        }
    }
}