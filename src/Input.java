import java.util.Scanner;

public class Input {
    public static void main (String[] args){
        Scanner s= new Scanner(System.in); //создаем поток входных данных
        System.out.println("Введите что-нибудь:");
        String string = s.nextLine(); //вызываем у объекта класса scanner (s) метод nextLine, который считывает строчку с клавиатуры
        System.out.println("Вы ввели: "+string);

        System.out.println("Введите число:");
        int x = s.nextInt();
        System.out.println("Вы ввели: "+x);
    }
}
