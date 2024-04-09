package LNPG_09_DEBUG.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControleEstoque {
    private static Map<String, Integer> estoque = new HashMap<>();

    private static void adicionarProduto(String nome, int quantidade) throws Exception {
        System.out.println(nome);
        if (quantidade <= 0) {
            throw new Exception("A quantidade precisa ser maior que 0");
        }
        if (estoque.containsKey(nome)) {
            quantidade += estoque.get(nome);
        }
        estoque.put(nome.toLowerCase(), quantidade);
    }

    private static void venderProduto(String nome, int quantidade) throws Exception {
        if (!estoque.containsKey(nome)) {
            throw new Exception("Produto não encontrado em estoque!");
        }
        int estoqueAtual = estoque.get(nome);
        if (quantidade > estoqueAtual) {
            throw new Exception("Quantidade insuficiente em estoque!");
        }
        estoque.put(nome, estoqueAtual - quantidade);
    }

    private static void exibirMenu() {
        System.out.print(
                "\nEscolha uma opção:\n1 - Adicionar Produto\n2 - Vender Produto\n3 - Exibir Estoque\n4 - Sair\nres: ");
    }

    private static void exibirEstoque() {
        System.out.println("\nEstoque atual:");
        estoque.keySet().forEach(product -> {
            System.out.printf("%s: %d\n", product, estoque.get(product));
        });
    }

    private static String lerNome(Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println(nome);
        scanner.nextLine();
        return nome;
    }

    private static int lerQuantidade(Scanner scanner) throws NumberFormatException {
        System.out.print("Digite a quantidade do produto: ");
        String quantidade = scanner.nextLine();
        return Integer.parseInt(quantidade);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nome;
            int quantidade;
            while (true) {
                exibirMenu();
                int opcao = scanner.nextInt();
                try {
                    switch (opcao) {
                        case 1:
                            nome = lerNome(scanner);
                            quantidade = lerQuantidade(scanner);
                            adicionarProduto(nome, quantidade);
                            break;
                        case 2:
                            nome = lerNome(scanner);
                            quantidade = lerQuantidade(scanner);
                            venderProduto(nome, quantidade);
                            break;
                        case 3:
                            exibirEstoque();
                            break;
                        case 4:
                            System.out.println("Saindo do programa...");
                            return;
                        default:
                            System.out.println("Opção inválida!");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}