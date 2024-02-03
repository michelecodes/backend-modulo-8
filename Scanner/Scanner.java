import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {
        // Cria um objeto Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir as quatro notas
        System.out.println("Digite a nota 1:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3:");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a nota 4:");
        double nota4 = scanner.nextDouble();

        // Calcula a média
        double media = calcularMedia(nota1, nota2, nota3, nota4);

        // Exibe a média
        System.out.println("A média das notas é: " + media);

        // Fecha o Scanner
        scanner.close();
    }

    // Método para calcular a média
    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }
}
