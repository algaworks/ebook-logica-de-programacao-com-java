public class Vetores {

  public static void main(String[] args) {
    System.out.println("===============================");

    // Faça testes incluindo mais preços aqui no
    // vetor e, depois, altere e imprima diferentes
    // posições.
    double[] precoProdutos = new double[]{ 150.0, 20.0, 10.0, 100.0 };

    // O índice é 1, mas o produto é o segundo,
    // pois, os indices começam do 0.
    double precoProduto = precoProdutos[1];

    // Vai imprimir 20.0
    System.out.println("O preço do segundo produto é " + precoProduto);

    // Alterando o valor da posição 2 (de índice 1).
    precoProdutos[1] = 21.0;
    System.out.println("O segundo produto teve seu preço alterado.");

    // Vai imprimir 21.0 ao invés de 20.0.
    // Repare também que estou mandando imprimir diretamente
    // pelo array, sem a intermediação de uma variável como
    // foi na impressão do trecho anterior.
    System.out.println("O preço do segundo produto é " + precoProdutos[1]);

    System.out.println("Fim!");
    System.out.println("===============================");
  }
}
