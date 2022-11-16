public class Media {
    public static void main(String[] args) {

        //NOTA DO PRIMEIRO ALUNO

        double notasAluno = (5.0 + 8.0 + 6.0 + 7.0) / 4.0;
        double mediaFinal = notasAluno;

        System.out.println("A média final é " + mediaFinal);

        if (mediaFinal < 6) {
            System.out.println("reprovado");
        } else {
            System.out.println("Aprovado");
        }

        //NOTAS DO SEGUNDO ALUNO

        double notasAluno2 = (2.0 + 4.0 + 3.0 + 1.0) / 4.0;
        double mediaFinal2 = notasAluno2;

        System.out.println("A média final é " + mediaFinal2);

        if (mediaFinal2 < 6) {
            System.out.println("reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }
}