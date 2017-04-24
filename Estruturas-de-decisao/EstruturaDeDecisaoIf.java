import java.util.Scanner;

public class EstruturaDeDecisaoIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================");

        System.out.print("Informe o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        boolean produtoAltoValor = precoProduto >= 100;

        double percentualDesconto = 0.0;

        // Se maior ou igual 100, aplique o desconto.
        if (produtoAltoValor) {
            percentualDesconto = 5.0;
        } else { // Senão, não aplique desconto algum.
            System.out.println("Não será aplicado desconto algum.");
        }

        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;

        System.out.println("O produto sairá por R$"
            + precoComDesconto + ".");

        System.out.println("Fim!");
        System.out.println("============================");

        scanner.close();
    }
}
