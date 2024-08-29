public class Atividade_2_Classificacao_de_Notas {
    public static void main(String[] args) {
        int nota = 2;

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Satisfatório");
        } else {
            System.out.println("Insatisfatório");
        }
    }
}