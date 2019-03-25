package MyTask;

import java.util.Scanner;

//проверить слово на симметричность (зеркальны левая и правая части)
public class MirrorWord {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in); //создаем поток входных данных
        System.out.println("Введите слово для проверки:");
        String word=input.nextLine();
        char[] s=word.toCharArray(); //формируем массив из символов слова

        for (int i=0; i<=s.length/2; i++){
            if (s[i]==s[s.length-1-i]) {
                if (i==s.length/2){
                    System.out.println("Слово " +word+ " зеркально");
                }
                  continue;

            }else{
                System.out.println("Слово " +word+" не зеркальное");
            break;
            }

        }
    }


}
