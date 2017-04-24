import java.util.Scanner;

public class LendoInformacoesComScanner {

    public static void main(String[] args) {
        System.out.println("====================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma distância: ");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.println("A distância digitada foi "
            + distanciaPercorrida + "Km.");

        scanner.close();

        System.out.println("Fim!");
        System.out.println("====================");
    }  
}
