import java.util.Scanner;
public class WID_Q01{
  public static void main(String[] args){
     Scanner s = new Scanner(System.in);
    int lin,col,lin2,col2,i,j,k;
    String resp = "S";
    int[][] A = null;
    int[][] B = null;
    int[][] C = null;
    while(resp.equalsIgnoreCase("S")){
        System.out.println("Qual o número de linhas da matriz A: ");
        lin = s.nextInt();
        System.out.println("Qual o número de colunas da matriz A: ");
        col = s.nextInt();
        System.out.println("Qual o número de linhas da matriz B: ");
        lin2 = s.nextInt();
        System.out.println("Qual o número de colunas da matriz B: ");
        col2 = s.nextInt();
        if(lin<10 && col<10 && lin2<10 && col2<10 && col==lin2){
            A = new int[lin][col];
            B = new int[lin2][col2];
            C = new int[lin2][col];

            for(i=0;i<lin;i++){
                for(j=0;j<col;j++){
                    System.out.println("Digite a ["+(i+1)+"]["+(j+1)+"] da matriz A:");
                    A[i][j] = s.nextInt();
                }
            }
            for(i=0;i<lin2;i++){
                for(j=0;j<col2;j++){
                    System.out.println("Digite a ["+(i+1)+"]["+(j+1)+"]: da matriz B");
                    B[i][j] = s.nextInt();
                }
            }    
            for ( i = 0; i < lin; i++) {
                for ( j = 0; j < col2; j++) {
                    for ( k = 0; k < col; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            System.out.println("Valores da matriz:");
            for ( i = 0; i < C.length; i++) {
                for ( j = 0; j < C[i].length; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        System.out.println("Matrizes de ordem inválida, deseja tentar novamente?");
        System.out.println("(S/N)?");
        resp = s.next();
    }
    else
      {
      System.out.println("Matrizes de ordem inválida, deseja tentar novamente?");
      System.out.println("(S/N)?");
      resp = s.next();
      }
    }
  }
}