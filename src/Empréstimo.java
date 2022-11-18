import java.util.Scanner;

public class Empréstimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double porcentagem;

        System.out.println("INDIQUE QUAL SUA IDADE ↡");
        int idade = scanner.nextInt();

        System.out.println("QUAL SEU VALOR SALARIAL");
        double salario = scanner.nextInt();
        porcentagem = (salario * 30) / 100;

        System.out.printf("A pessoa que está solicitando o empréstimo tem " + idade);
        System.out.println(" anos de idade e tem o salário de " + salario + " reais");

        System.out.println("QUAL O VALOR DO EMPRESTIMO");
        int valorEmprestimo = scanner.nextInt();

        System.out.println("GOSTARIA DE PARCELAR EM QUANTA VEZES");
        int parcela = scanner.nextInt();


        System.out.printf("O valor solicitado é de " + valorEmprestimo + " reais");
        System.out.println(" para ser pago em " + parcela + " parcelas");

        if (idade >= 18 && idade <= 65) {
            System.out.println("O empréstimo foi aprovado.");
        } else if (parcela <= 3 && parcela >= 25) {
            System.out.println("empréstimo reprovado");
        } else if (valorEmprestimo <= porcentagem) {
            System.out.println("O empréstimo foi reprovando");
        } else {
            System.out.println("O empréstimo foi reprovando");
        }
    }
}
