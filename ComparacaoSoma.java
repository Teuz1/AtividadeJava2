import java.util.Scanner;

public class ComparacaoSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o número B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o número C: ");
        int C = scanner.nextInt();

        // Verificação da soma e saída de dados
        int soma = A + B;

        System.out.println("\n" + A + " + " + B + " = " + soma);

        if (soma > C) {
            System.out.println(soma + " > " + C);
            System.out.println("A Soma de A + B é Maior do que C");
        } else if (soma < C) {
            System.out.println(soma + " < " + C);
            System.out.println("A Soma de A + B é Menor do que C");
        } else {
            System.out.println(soma + " = " + C);
            System.out.println("A Soma de A + B é Igual a C");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

