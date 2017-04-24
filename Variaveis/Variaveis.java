public class Variaveis {

    public static void main(String[] args) {
        System.out.println("====================");

        // Altere o valor da variável abaixo
        // para realizar testes.
        double precoProduto = 115.0;
        System.out.println("O preço do produto é de "
            + precoProduto + " reais");

        double percentualDesconto = 5.0;
        System.out.println("O desconto será de "
            + percentualDesconto + "%.");

        // Regra de três para descobrir qual o valor
        // do desconto.
        double desconto = precoProduto * percentualDesconto / 100;

        // Preço do produto menos o desconto para
        // sabermos o valor do produto com o
        // desconto que foi calculado na linha anterior.
        double precoComDesconto = precoProduto - desconto;

        System.out.println("Com desconto, o produto sai "
            + "por R$" + precoComDesconto + ".");

        System.out.println("Fim!");
        System.out.println("====================");
    }
}
