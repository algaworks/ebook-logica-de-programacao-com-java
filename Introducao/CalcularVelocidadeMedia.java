public class CalcularVelocidadeMedia {

    public static void main(String[] args){
        System.out.println("=== CÁLCULO DA VELOCIDADE MÉDIA ==========");

        double distanciaPercorrida = 150;
        System.out.println("A distância percorrida foi de " + distanciaPercorrida + "Km.");

        double tempoGasto = 1.5;
        System.out.println("O tempo gasto foi de " + tempoGasto + " horas.");

        double velocidadeMedia = distanciaPercorrida / tempoGasto;
        System.out.println("Para encontrar a velocidade média dividimos a distância (" + distanciaPercorrida + ") pelo tempo gasto no percurso (" + tempoGasto + ").");

        System.out.println("A velocidade média é de " + velocidadeMedia + "Km/h");
    }
}
