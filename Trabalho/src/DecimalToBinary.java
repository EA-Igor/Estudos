import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa criado com a finalidade de converter um número decimal para um número binário utilizando o resto de divisões curtas por 2.");
        System.out.print("Digite um número decimal: ");
        int decimal = scanner.nextInt();
        
        
        String binary = "";
        
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }
        
        System.out.println("O número binário equivalente é: " + binary);
        scanner.close();
    }
}