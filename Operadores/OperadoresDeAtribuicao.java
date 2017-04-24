public class OperadoresDeAtribuicao {

    public static void main(String[] args) {
        System.out.println("===============================");

        int umNumero = 5;

        umNumero += 2;
        System.out.println("Resultado da adição de 5 com 2: " + umNumero);

        umNumero = 5; // Voltando o valor para 5.

        umNumero -= 2;
        System.out.println("Resultado da subtração de 5 pelo 2: "
            + umNumero);

        umNumero = 5; // Voltando o valor para 5.

        umNumero *= 2;
        System.out.println("Resultado da multiplicação de 5 pelo 2: "
            + umNumero);

        umNumero = 5; // Voltando o valor para 5.

        umNumero /= 2;
        System.out.println("Resultado da divisão de 5 pelo 2: "
            + umNumero);

        umNumero = 5; // Voltando o valor para 5.

        umNumero %= 2;
        System.out.println("Resto da divisão de 5 pelo 2: " + umNumero);

        System.out.println("Fim!");
        System.out.println("===============================");
    }
}
