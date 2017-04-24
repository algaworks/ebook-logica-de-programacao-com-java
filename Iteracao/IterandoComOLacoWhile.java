import java.util.Random;
import java.util.Scanner;

public class IterandoComOLacoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("============================");

        // Aleatórios de 0 até 9
        int numeroAleatorio = random.nextInt(10);
        boolean tentarNovamente = true;

        System.out.println("Aperte CTRL+C, a qualquer momento, para parar.");

        // Enquanto tentarNovamente igual a true, itera novamente.
        while (tentarNovamente) {
            System.out.print("Tente adivinhar o número: ");
            int numero = scanner.nextInt();

            // Repare que a relação abaixo e a de diferença, ou seja,
            // enquanto diferente, retorna true e, por isso,
            // tenta novamente.
            tentarNovamente = numeroAleatorio != numero;

            if (tentarNovamente) {
                System.out.println("Errado!");
            }
        }

        System.out.println("Parabéns! Você adivinhou. Era o número "
            + numeroAleatorio + " mesmo.");

        System.out.println("Fim!");
        System.out.println("============================");
    }
}
