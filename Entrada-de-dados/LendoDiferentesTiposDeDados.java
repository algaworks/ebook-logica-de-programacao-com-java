import java.util.Scanner;

public class LendoDiferentesTiposDeDados {

    public static void main(String[] args) {
        System.out.println("====================");

        Scanner scanner = new Scanner(System.in);

        // ----------------------------------------------

        System.out.print(" >>> Digite um texto: ");
        String texto = scanner.nextLine();
        System.out.println("O texto digitado "
            + "foi " + texto);

        // ----------------------------------------------

        // Apesar do Java trabalhar com o "." como
        // separador de decimais, o Scanner vai receber
        // um decimal no formato em que seu computador estiver
        // configurado, ou seja, se você usa o
        // português brasileiro, então, para digitar,
        // terá que usar a vírgula como separador
        // de decimais. A própria funcionalidade Scanner vai
        // transformar o número com vírgula em algo
        // que o Java entenda, ou seja, um número
        // que tem o "." como separador de decimais.
        System.out.print(" >>> Digite um decimal: ");
        double numeroDecimal = scanner.nextDouble();
        System.out.println("O número decimal digitado "
            + "foi " + numeroDecimal);

        // ----------------------------------------------

        System.out.print(" >>> Digite um inteiro: ");
        int numeroInteiro = scanner.nextInt();
        System.out.println("O número inteiro digitado "
            + "foi " + numeroInteiro);

        // ----------------------------------------------

        System.out.print(" >>> Digite um boolean (true ou false): ");
        boolean booleano = scanner.nextBoolean();
        System.out.println("O booleano digitado "
            + "foi " + booleano);

        // ----------------------------------------------

        scanner.close();

        System.out.println("Fim!");
        System.out.println("====================");
    }  
}
