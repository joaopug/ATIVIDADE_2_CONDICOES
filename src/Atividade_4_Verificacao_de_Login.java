import java.util.Scanner;

public class Atividade_4_Verificacao_de_Login {
    public static void main(String[] args) {
        // Strings que possuem os dados de comparação

        String usuario = "pedrinhominecraft74";
        String senha = "Creeperexplosivo12!";

        // Criacão de um "Scanner" chamado 'cheirador' para cheirar (receber) os inputs.

        Scanner cheirador = new Scanner(System.in);

        // O scanner "cheirador" sendo utilizado para receber os caracteres e armazenar
        // numa variável String chamada "userdgtd", userdgtd = usuário digitado

        System.out.println("Digite o usuário: ");
        String userdgtd = cheirador.nextLine();

        // Novamente o "cheirador" sendo usado, dessa vez para armazenar e receber
        // os caracteres na String "passdgtd", passdgtd = senha digitada.

        System.out.println("Digite a senha: ");
        String passdgtd = cheirador.nextLine();

        // Sistema que compara a variável "usuario" com a variável "userdgtd".
        // Ele também irá verificar se a "senha" é igual a a "passdgtd".
        // Se ambos forem iguais, irá imprimir a mensagem "Tudo certo",
        // caso contrário, dirá "Tá errado fi".

        if (userdgtd.equals(usuario) && senha.equals(passdgtd)) {
            System.out.println("Tudo certo");
        } else {
            System.out.println("Tá errado fi");
        }
    }
}