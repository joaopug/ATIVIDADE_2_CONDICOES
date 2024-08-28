import java.util.Scanner;

public class Atividade_8_Classificacao_de_Temperatura {
    public static void main(String[] args) {
        // Criação das variáveis
        double celsius = 0;

        // Criação do Scanner chamado "medidor"
        Scanner medidor = new Scanner(System.in);

        // Petição para dar uma temperatura e armazenar na variável "celsius"
        System.out.println("Digite uma temperatura em Celsius: ");
        celsius = medidor.nextDouble();

        // Verificação da temperatura e categorização
        if (celsius >= 30) {
            System.out.println("Está muito quente 🥵");
        } else if (celsius < 30 && celsius > 15) {
            System.out.println("Tá agradável 😇😇");
        } else {
            System.out.println("Tá frio 🥶🥶");
        }
    }
}
