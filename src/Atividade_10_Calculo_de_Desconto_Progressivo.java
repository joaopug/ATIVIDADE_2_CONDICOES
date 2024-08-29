import java.util.Scanner;

public class Atividade_10_Calculo_de_Desconto_Progressivo {
    public static void main(String[] args) {

        double desconto = 1.0;

        Scanner socorro = new Scanner(System.in);

        System.out.println("Dê o valor total de sua compra, meu filho: ");
        double compra = socorro.nextDouble();

        if (compra > 500.00) {
            desconto = 0.20;
        } else if (compra <= 500.00 && compra >= 200.00) {
            desconto = 0.10;
        } else if (compra <= 199.99 && compra >= 100.00) {
            desconto = 0.05;
        }

        if (compra <= 0) {
            System.out.println("Esse não é um valor válido.");
        } else if (compra >= 100) {
            System.out.println("O valor da sua compra é R$ " + compra + " né?\n" + "Por ser esse valor, seu desconto será de " + desconto * 100 + "%.\n" + "Ou seja, você economizou R$ " + compra * desconto + " e só vai precisar pagar R$ " + (compra - (compra * desconto)) + ".");
        } else {
            System.out.println("Por sua compra ser R$ " + compra + ", ou seja,\n" + "abaixo de R$ 100,00, você não tem direito a desconto.");
        }
    }
}
