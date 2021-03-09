import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ten {
    public static void ten() throws IOException {
        System.out.println("Напишите программу , которая создает файл , компоненты которого имеют структуру : \n " +
                "табельный номер , ФИО , сумма зарплаты. Введите данные о 5 работниках ,а в другой выведите данные о работкниках, имеющих зарплату свыше 10к\n" +
                "Введите: ");

        FileOutputStream wr = new FileOutputStream("file.txt", true); //Создаем объект записи
        Scanner scan = new Scanner(System.in);

        for (int i = 1;i<1000;i++) {
            System.out.println("Номер "+ i + " работника" );
            String tx = Integer.toString(i);
            wr.write(tx.getBytes());
            wr.write(" ".getBytes());

            System.out.println("Табельный номер "+ i + "работника" );
            String t = Integer.toString(i);
            wr.write(t.getBytes());
            wr.write(" ".getBytes());

            System.out.println("ЗП "+ i + "работника" );
            String txt = Integer.toString(5000 + (int) (Math.random() * 15000));
            wr.write(txt.getBytes());
            wr.write("\n".getBytes());
        }
        wr.close();

        Scanner re = new Scanner(new File("file.txt")); //Создаем объект чтения

        String ot = null;
        System.out.println("Вы ввели данные о 1000 работниках: ");
        while (re.hasNextLine())
        {
            String text = re.nextLine(); //Присваиваем text знчаение строки из документа
            String[] retval = text.split(" ");//Делим строку на слова м записываем в массив
            int retv = Integer.parseInt (retval[2]); //Конвертируем стринг в число
            if (retv>10000)
            {
                int s = retv;
                ot += retval[0] + " " + retval[1] + " " + retval[2]+"\n";
            }
        }
        System.out.println("Работники имеющие ЗП > 10K: " + ot);
    }
}
