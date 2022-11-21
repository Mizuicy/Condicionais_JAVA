import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        Random random = new Random(6);
        Scanner scanner = new Scanner(System.in);

        int numero;
        int aleatorio = random.nextInt(6);

        System.out.println("Digite um numero de 1 a 6");
        numero = scanner.nextInt();

        if (numero <= 1 && numero >= 6) {
            System.out.println("O numero selecionado foi " + numero);
            System.out.println("Erro! Por favor, escolha um numero entre 1 e 6.");
        } else if (numero == aleatorio) {
            System.out.println("O numero selecionado foi " + numero);
            System.out.println("O numero sorteado foi " + aleatorio);
            System.out.println("Você acertou");
        } else if (numero != aleatorio) {
            System.out.println("O numero selecionado foi " + numero);
            System.out.println("O numero sorteado foi " + aleatorio);
            System.out.println("Voce Errou");
        }
    }
}
