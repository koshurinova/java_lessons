import java.util.Scanner;

public class Switch {
    public static void main (String[] args){
        //switch похож на if, используется когда много условий, которые необходимо перебрать
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введи возраст:");
        int age = scanner.nextInt();

        switch (age){
            case 0:
                System.out.println("Новорожденный");
                break;
            case 7:
                System.out.println("Пошел в школу");
                break;
            case 10:
                System.out.println("Закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }

    }
}
