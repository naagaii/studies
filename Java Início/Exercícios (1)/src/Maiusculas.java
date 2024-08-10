import java.util.Scanner;

public class Maiusculas {
    
    // Procedimento para ler uma palavra e mostrar letras maiúsculas
    public static void mostrarMaiusculas() {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que digite uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        // Inicializa uma StringBuilder para armazenar letras maiúsculas
        StringBuilder maiusculas = new StringBuilder();
        
        // Percorre cada caractere da palavra
        for (int i = 0; i < palavra.length(); i++) {
            char caractere = palavra.charAt(i);
            // Verifica se o caractere é uma letra maiúscula
            if (Character.isUpperCase(caractere)) {
                // Adiciona a letra maiúscula ao StringBuilder
                maiusculas.append(caractere);
            }
        }
        
        // Exibe as letras maiúsculas encontradas
        System.out.println("Letras maiúsculas na palavra: " + maiusculas.toString());
        
        // Fecha o objeto Scanner
        scanner.close();
    }

    // Método principal para executar o procedimento
    public static void main(String[] args) {
        // Chama o procedimento para mostrar letras maiúsculas
        mostrarMaiusculas();
    }
}
