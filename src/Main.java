import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Выберите задание:\n1.Корни\n2.Среднее геометрическое\n3.Выражение\n4.10 строк по 5\n5.Нечетные от 1 до 100\n6.Наименьший общий делитель\n7.Четные и нечетные\n8.Файл с окладом\n9.файл с чаром\n10.файл с зарплатой\n11.файл с авансом\n12.50 случ чисел\n13.файл с соткой случ чисел\n14.файл из целых чисел\n15.ввод одн массива и сортировка\n16.натур число кратное 3 и меньше 100\n17.кубы чисел предыдущего\n18.10ное в 2ное");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        switch (i){
            case 1:{break;}
            case 2:{break;}
            case 3:{break;}
            case 4:{break;}
            case 5:{break;}
            case 6:{break;}
            case 7:{Seven.seven(); break;}
            case 8:{break;}
            case 9:{Nine.nine(); break;}
            case 10:{Ten.ten(); break;}
            case 11:{Eleven.eleven(); break;}
            case 12:{break;}
            case 13:{break;}
            case 14:{break;}
            case 15:{Fifteen.fifteen(); break;}
            case 16:{break;}
            case 17:{break;}
            case 18:{break;}
        }
    }
}
