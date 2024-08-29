import java.util.Scanner;

public class Atividade_6_Verificacao_de_Aprovacao_Escolar {
    public static void main(String[] args) {
        Scanner bone = new Scanner(System.in);

        System.out.println("Me dá a média");
        double media = bone.nextDouble();

        if (media >= 7) {
            System.out.println("Parabéns, você foi aprovado 😎😎😎😎😎");
        } else if (media < 7 && media >= 5) {
            System.out.println("Home, tu tá de recuperação 😐😐😐😐😐😐");
        } else {
            System.out.println("Estás reprovado 🤣🤣🤣🤣🤣🤣");
        }
    }
}