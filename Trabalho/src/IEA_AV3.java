import java.util.Scanner;

public class IEA_AV3 {
    public static void main(String[] args) {
        String continuar;
        Scanner in = new Scanner(System.in);

        do {
            float A[] = new float[10];
            double B[] = new double[10];
            double C[] = new double[10];
            int lin;
            
            for (lin = 0; lin < 10; lin++) {
                System.out.print("Digite A[" + (lin + 1) + "]: ");
                A[lin] = in.nextFloat();
            }
            
            for (lin = 0; lin < 10; lin++) {
                C[lin] = 1;
            }
            
            boolean achou = false;
            System.out.print("Digite o valor que gostaria de pesquisar: ");
            double pesq = in.nextDouble();
            double valor = pesq;
            lin = 0;
            
            while (lin < 10 && !achou) {
                if (A[lin] == pesq)
                    achou = true;
                else
                    lin++;
            }
            
            if (achou == false)
                System.out.print("O valor " + pesq + " não foi encontrado");
            else {
                while (pesq > 0) {
                    B[lin] = pesq + B[lin];
                    C[lin] = pesq * C[lin];
                    pesq--;
                }
            }
            
            if (achou == true)
                System.out.println("O valor " + valor + " foi encontrado na posição " + (lin + 1) + ", o seu somatório é " + B[lin] + " e o fatorial é " + C[lin]);
            
            System.out.println("Deseja pesquisar outro número? (s/n)");
            continuar = in.next();
            in.nextLine(); 
        } while (continuar.equals("s") || continuar.equals("S"));

        in.close();
    }
}
