public class OperadoresRelacionais {

    public static void main(String[] args) {
        System.out.println("===============================");

        // Faça testes alterando o valor das duas variáveis abaixo.
        int primeiraVariavel = 1;
        int segundaVariavel = 1;

        System.out.println("O valor da primeira variável é "
            + primeiraVariavel + " e o da segunda é "
            + segundaVariavel + ".");

        boolean primeiraVariavelEMaiorQueASegunda
            = primeiraVariavel > segundaVariavel;
        System.out.println("Primeira variável é maior que a segunda? "
            + primeiraVariavelEMaiorQueASegunda);


        boolean primeiraVariavelEMenorQueASegunda
            = primeiraVariavel < segundaVariavel;
        System.out.println("Primeira variável é menor que a segunda? "
            + primeiraVariavelEMenorQueASegunda);

        boolean primeiraVariavelEMaiorIgualASegunda
            = primeiraVariavel >= segundaVariavel;
        System.out.println("Primeira variável é maior ou igual a segunda? "
            + primeiraVariavelEMaiorIgualASegunda);

        boolean primeiraVariavelEMenorIgualASegunda
            = primeiraVariavel <= segundaVariavel;
        System.out.println("Primeira variável é menor ou igual a segunda? "
            + primeiraVariavelEMenorIgualASegunda);

        boolean primeiraVariavelEIgualASegunda
            = primeiraVariavel == segundaVariavel;
        System.out.println("Primeira variável é igual a segunda? "
            + primeiraVariavelEIgualASegunda);

        boolean primeiraVariavelEDiferenteDaSegunda
            = primeiraVariavel != segundaVariavel;
        System.out.println("Primeira variável é diferente da segunda? "
            + primeiraVariavelEDiferenteDaSegunda);

        System.out.println("Fim!");
        System.out.println("===============================");
    }
}
