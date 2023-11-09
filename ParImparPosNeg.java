import java.util.Scanner;

public class ParImparPosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificação se é par ou ímpar e se é positivo ou negativo
        if (numero % 2 == 0) {
            // Número é par
            if (numero > 0) {
                System.out.println("O Número " + numero + " é par e positivo!");
            } else if (numero < 0) {
                System.out.println("O Número " + numero + " é par e negativo!");
            } else {
                System.out.println("O Número " + numero + " é zero!");
            }
        } else {
            // Número é ímpar
            if (numero > 0) {
                System.out.println("O Número " + numero + " é ímpar e positivo!");
            } else if (numero < 0) {
                System.out.println("O Número " + numero + " é ímpar e negativo!");
            } else {
                System.out.println("O Número " + numero + " é zero!");
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
