import java.util.Scanner;

public class Atividade_5_Verificacao_de_Dias_da_Semana {
    public static void main(String[] args) {

        // String "diaSmn" que armezenará o dia da semana
        String diaSmn = "";

        // Cria um scanner chamado "cal" (calendário)
        Scanner cal = new Scanner(System.in);

        // Pede a digitação de um número de 1 a 7 e o define
        // como sendo a variável "nDiaSmn" (Número do dia da semana)
        System.out.println("Digite um número de 1 a 7 para sabermos o dia da semana: ");
        int nDiaSmn = cal.nextInt();

        // Verifica se o número digitado é maior que 7 ou menor
        // que 1. Caso seja, irá exibir uma mensagem de erro.
        if (nDiaSmn > 7 || nDiaSmn < 1) {
            System.out.println("Número incorreto");
        }

        // Não sendo maior que 7 ou menor que 1, será iniciado
        // um switch que chegará numa conclusão sobre qual número
        // foi digitado e definirá qual dia da semana corresponde.
        else {
            switch (nDiaSmn) {
                case 1:
                    diaSmn = "segunda-feira";
                    break;
                case 2:
                    diaSmn = "terça-feira";
                    break;
                case 3:
                    diaSmn = "quarta-feira";
                    break;
                case 4:
                    diaSmn = "quinta-feira";
                    break;
                case 5:
                    diaSmn = "sexta-feira";
                    break;
                case 6:
                    diaSmn = "sábado";
                    break;
                case 7:
                    diaSmn = "domingo";
                    break;
            }

            // Ao definir qual é o dia da semana correspondente,
            // exibirá uma mensagem dizendo qual é o dia.
            System.out.println("É " + diaSmn + ".");
        }
    }
}