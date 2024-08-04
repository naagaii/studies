import java.util.Scanner;

public class VetorExercicio {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o tamanho do vetor ao usuário
        System.out.print("Digite o tamanho do vetor (TAM): ");
        int TAM = scanner.nextInt();
        
        // Declara um vetor de inteiros com TAM elementos
        int[] vetor = new int[TAM];
        
        // Inicializa o vetor com os números de 1 a 10
        // Se TAM for maior que 10, os números repetem
        for (int i = 0; i < TAM; i++) {
            vetor[i] = (i % 10) + 1;
        }
        
        // Utiliza um laço para imprimir todos os elementos do vetor
        System.out.println("Elementos do vetor:");
        for (int i = 0; i < TAM; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        // Fecha o objeto Scanner
        scanner.close();
    }
}
