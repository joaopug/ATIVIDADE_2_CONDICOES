import java.util.Scanner;

public class Atividade_9_Verificacao_de_Numero_Positivo_Negativo_ou_Zero {
    public static void main(String[] args) {
        // Cria um Scanner chamado "pega"
        Scanner pega = new Scanner(System.in);

        // Pede para o usuário digitar um número e coloca dentro da
        // variável "n"
        System.out.println("Me dá um número:");
        Double n = pega.nextDouble();

        // Verifica se "n" é negativo, positivo ou zero
        if (n > 0) {
            System.out.println("O número é positivo");
        } else if (n < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("Tu digitou Zero bro");
        }
    }
}
