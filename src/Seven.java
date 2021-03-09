import java.util.Scanner;

public class Seven {
    public static void seven(){
        System.out.println("Введите размерность массива");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A[][] = new int[N][N];
        int CH = 1, NCH = 1;
        int C[] = new int[CH];
        int NC[] = new int[NCH];
        for (int i = 0; i < N; i++){
            for (int j = 0; i < N; j++){
                System.out.println("Введите элемент массива " + i + " " + j);
                A[i][j] = scan.nextInt();
                if (A[i][j]%2 == 0){
                    C[CH] = A[i][j];
                    CH++;
                }
                else {
                    NC[NCH] = A[i][j];
                    NCH++;
                }
            }
        }
        for (int g = 0; g < CH; g++){System.out.println(C[g] + " ");}
        System.out.println("\n");
        for (int t = 0; t < NCH; t++){System.out.println(NC[t] + " ");}
    }
}
