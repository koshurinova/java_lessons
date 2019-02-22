import java.util.Scanner;

public class DoWhile {
    public static void main (String [] args){
        //программа просит ввести цифру до тех пор пока не считает 5

        //Способ 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число 5:");
//        int value = scanner.nextInt();
//        while (value!=5){
//            System.out.println("Введите число 5:");
//            value = scanner.nextInt();
//        }
//        System.out.println("Вы ввели 5, верно ");

        //Способ 2
        Scanner scanner2 = new Scanner(System.in);
        int value2;
        do {
            System.out.println("Введите число 5:");
            value2 = scanner2.nextInt();
        } while (value2!=5);

        System.out.println("Вы ввели 5, верно ");
    }
}
