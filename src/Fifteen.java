import java.util.Scanner;

public class Fifteen {
    public static void fifteen() {
        System.out.println("Введите размерность: ");
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        int n = R;
        int f;
        int A[] = new int[R];
        for (int i = 0; i < R; i++) {
            System.out.println("Введите " + i + " элемент массива:  ");
            A[i] = scan.nextInt();
        }
        while(n > 0){
        for (int i = 0; i < R-1; i++){
                if (A[i] > A[i+1]){
                    f = A[i+1];
                    A[i+1] = A[i];
                    A[i] = f;
                }
            }
        n--;
        }
        for (int i = 0; i < R; i++){
            System.out.print(A[i] + " ");
        }
    }
}
