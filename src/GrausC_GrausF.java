import java.util.Scanner;

public class GrausC_GrausF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperatura;
        System.out.println("INDIQUE QUAL O TIPO DE TEMPERATURA  ↡");
        String unidadedeMedida = scanner.nextLine();

        if (unidadedeMedida.equals("C")) {
            System.out.println("COLOQUE O VALOR DA TEMPERATURA ↡");
            temperatura = scanner.nextDouble();
            System.out.println("A temperatura informada foi " + temperatura + "º");
            double conversaoF = (temperatura * 1.8) + 32.0;
            System.out.println("Ela equivale a " + conversaoF + "º Farenheit.");

        } else if (unidadedeMedida.equals("F")) {
            System.out.println("COLOQUE O VALOR DA TEMPERATURA ↡");
            temperatura = scanner.nextDouble();
            System.out.println("A temperatura informada foi " + temperatura + "º");
            double conversaoC = (temperatura - 32.0) / 1.8;
            System.out.println("Ela equivale a " + conversaoC + "º Celsius");
        } else {
            System.out.println("Essa letra " + unidadedeMedida + " não é uma unidade de medida");
        }
    }
}
