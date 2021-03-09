import java.io.*;
import java.util.Scanner;

public class Eleven {
    public static void eleven() throws IOException {
        System.out.println("Напишите программу , которая создает файл , компоненты которого имеют структуру : \n " +
                "табельный номер , аванс. Введите данные о 5 работниках ,а в другой выведите данные о работкниках, имеющих зарплату свыше 10к\n" +
                "Введите: ");

        try {
            FileWriter fstream1 = new FileWriter("file.txt");// конструктор с одним параметром - для перезаписи
            BufferedWriter out1 = new BufferedWriter(fstream1); //  создаём буферезированный поток
            out1.write(""); // очищаем, перезаписав поверх пустую строку
            out1.close(); // закрываем
        } catch (Exception e)
        {System.err.println("Error in file cleaning: " + e.getMessage());}

        FileOutputStream wr = new FileOutputStream("file.txt", true); //Создаем объект записи
        Scanner scan = new Scanner(System.in);
        int IT = 0;

        for (int i = 1;i<1000;i++) {

            System.out.println("Табельный номер "+ i + " работника" );
            String t = Integer.toString(i);
            wr.write(t.getBytes());
            wr.write(" ".getBytes());

            System.out.println("Аванс "+ i + " работника" );
            String txt = Integer.toString(100 + (int) (Math.random() * 1000));
            IT += Integer.parseInt(txt);
            wr.write(txt.getBytes());
            wr.write("\n".getBytes());
        }
        wr.close();

        Scanner re = new Scanner(new File("file.txt")); //Создаем объект чтения

        String ot = new String();
        System.out.println("Вы ввели данные о 1000 работниках: ");
        while (re.hasNextLine())
        {
            String text = re.nextLine(); //Присваиваем text знчаение строки из документа
            String[] retval = text.split(" ");//Делим строку на слова м записываем в массив
            int retv = Integer.parseInt (retval[1]); //Конвертируем стринг в число
            ot += "__________________________________________\n|       " + retval[0] + "       |        " + retval[1] +"           |\n";
        }
        System.out.println(" ___________________________________________________\n");
        System.out.println("|     ТАБЕЛЬНЫЙ НОМЕР       |          АВАНС        |\n");
        System.out.println(ot);
        System.out.println(" ________________________________________\n");
        System.out.println("| ИТОГО:           |        " + IT + "        |\n");
    }
}
