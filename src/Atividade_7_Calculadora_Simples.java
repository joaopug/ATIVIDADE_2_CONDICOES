import java.util.Scanner;

public class Atividade_7_Calculadora_Simples {
    public static void main(String[] args) {

        // Criação das variáveis
        double n1 = 0;
        double n2 = 0;
        double r = 0;
        char op = 'A';


        // Criação do Scanner chamado "receba'
        Scanner receba = new Scanner(System.in);

        // Petição para digitar dois números e colocar na variável "n1" e no "n2"
        System.out.println("Me dê dois números por favor");
        System.out.println("Digite o primeiro número: ");
        n1 = receba.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = receba.nextInt();

        // Petição para saber qual operação realizar e armazenar numa variável char chamada "op"
        System.out.println("Qual operação quer realizar?\n" + "1. Adição | 2. Subtração | 3. Multiplicação | 4. Divisão");
        op = receba.next().charAt(0);

        // Dependendo do caractere dado, uma certa operação será realizada
        if (op == '1') {
            r = n1 + n2;
        } else if (op == '2') {
            r = n1 - n2;
        } else if (op == '3') {
            r = n1 * n2;
        } else if (op == '4') {
            r = n1 / n2;
        }
        // Caso um caractere diferente seja dado, será exibido essa mensagem
        else {
            System.out.println("Tá errado isso aí preto,\n" + "reinicie o código");
        }
        //Verificação para saber o caractere é 1 ou 2 ou 3 ou 4
        if (op == '1' || op == '2' || op == '3' || op == '4') {
            System.out.println("O Resultado da operação é: " + r);
        }
    }
}
