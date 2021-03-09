import java.awt.desktop.SystemEventListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Nine  {
    public static void nine() throws IOException {
        FileOutputStream wr = new FileOutputStream("file.txt");
        Scanner scan = new Scanner(System.in);
        char Z = 'a';
        while(Z != 'z'){
            System.out.println("Введите символ");
            String F = scan.next();
            Z = F.charAt(0);
            wr.write(Z);
        }
        System.out.println("Success!");
        wr.close();
    }
}
