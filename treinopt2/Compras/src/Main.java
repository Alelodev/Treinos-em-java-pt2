import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static void main() {

        var scanner = new Scanner(System.in);
        ArrayList<Compras> listaDeCompras = new ArrayList<>();
        boolean continuarComprando = true;
        var cartaoA = new Cartao();

        System.out.println("Digite o limite do cartao: ");
        cartaoA.setLimiteDoCartao(scanner.nextDouble());
        scanner.nextLine();

        while (continuarComprando) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Lançar nova compra");
            System.out.println("2 - Ver lista de compras");
            System.out.println("3 - Finalizar");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o \n pendente

            switch (opcao) {
                case 1 -> {
                    var compra = new Compras();

                    System.out.println("Digite o nome do item: ");
                    compra.setNomeDoProduto(scanner.nextLine());

                    System.out.println("Preço: ");
                    compra.setValorDoProduto(scanner.nextDouble());
                    scanner.nextLine(); // limpa o \n pendente

                    listaDeCompras.add(compra);
                    cartaoA.setValorDoCartao(cartaoA.getValorDoCartao() + compra.getValorDoProduto());

                    System.out.println("Compra registrada!");

                    if (cartaoA.getValorDoCartao() >= cartaoA.getLimiteDoCartao()) {
                        System.out.println("Seu limite acabou!");
                        listaDeCompras.sort(Comparator.comparingDouble(Compras::getValorDoProduto));
                        System.out.println("Todas as suas compras: " + listaDeCompras);
                        System.out.println("Valor total das compras: " + cartaoA.getValorDoCartao());
                        continuarComprando = false;
                    }
                }

                case 2 -> {
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("Nenhuma compra registrada ainda.");
                    } else {
                        listaDeCompras.sort(Comparator.comparingDouble(Compras::getValorDoProduto));
                        System.out.println("Suas compras (ordenadas por valor): " + listaDeCompras);
                    }
                }

                case 3 -> {
                    listaDeCompras.sort(Comparator.comparingDouble(Compras::getValorDoProduto));
                    System.out.println("Todas as suas compras: " + listaDeCompras);
                    System.out.println("Valor total das compras: " + cartaoA.getValorDoCartao());
                    continuarComprando = false;
                }

                default -> System.out.println("Opção inválida! Digite 1, 2 ou 3.");
            }
        }

        System.out.println("Programa encerrado.");
    }
}