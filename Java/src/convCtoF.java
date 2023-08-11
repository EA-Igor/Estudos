import java.util.Scanner;

public class convCtoF {

    public static void main(String[] args) {
        float tempC, tempF;
        Scanner in = new Scanner(System.in); 
        System.out.print("Escreva a temperatura em Celsius para ser convertida em Fahrenheit: ");
        tempC = in.nextFloat();
        tempF = (9*tempC+160)/5;
        System.out.println("A temperatura em Fahrenheit é: " + tempF);
        in.close();
    }
}
