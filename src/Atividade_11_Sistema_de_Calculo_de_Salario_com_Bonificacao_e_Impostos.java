import java.util.Scanner;

public class Atividade_11_Sistema_de_Calculo_de_Salario_com_Bonificacao_e_Impostos {
    public static void main(String[] args) {

        double bonus = 0;
        double imposto = 0;

        Scanner analise = new Scanner(System.in);

        System.out.println("Digite o salário bruto do funcionário");
        double salarioBruto = analise.nextDouble();
        System.out.println("Quanto anos o funcionário trabalha na empresa?");
        int anosTrab = analise.nextInt();

        if (anosTrab >= 10) {
            bonus = 0.10;
        } else if (anosTrab >= 5) {
            bonus = 0.05;
        }

        if (salarioBruto >= 5000.00) {
            imposto = 0.27;
        } else if (salarioBruto < 5000.00 && salarioBruto >= 3000.00) {
            imposto = 0.18;
        } else {
            imposto = 0.10;
        }

        double valorBns = (bonus * salarioBruto);
        double valorImp = (imposto * salarioBruto);
        double salarioLiq = ((salarioBruto - (imposto * salarioBruto)) + (bonus * salarioBruto));

        System.out.println("O funcionário recebe R$ " + salarioBruto + " e também trabalha na empresa há " + anosTrab + " ano(s).\n" + "Por conta disso, ele tem direito há um bônus de " + bonus * 100 + "% sobre o salário, resultando em R$ " + valorBns + " que ele deve receber.\n" + "Tudo seria maravilhoso se fosse só isso, mas infelizmente\n" + "precisa-se descontar " + imposto * 100 + "% do salário bruto devido a impostos, ou seja, R$ " + valorImp + ".\n" + "Feito os cálculos, o salário líquido ficará:\n" + "R$ " + salarioLiq);
    }
}
