public class solution {
    public static void main(String[] args) {
        String texto = "Hello, world!";
        int inicio = 7; // Índice do primeiro caractere desejado
        int fim = 12;   // Índice do último caractere desejado (exclusivo)

        String substring = texto.substring(inicio, fim);
        System.out.println(substring);
    }
}