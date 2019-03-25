package MyTask;

import java.util.ArrayList;

//вывести все числа до N, в которых число делится на каждую из цифр в нем
public class Numbers {
    public static void main(String[] args) {
        int number = 60;
        for (int i=10; i<number; i++){
        checkNumbers(i);}
    }
public static void checkNumbers(int value){
      int n=value;
    ArrayList<Integer> digits = new ArrayList<Integer>();
    while (n > 0) {
        digits.add(n % 10);
        n = n / 10;
    }
    int sum=0;
    for (int i=0; i<digits.size(); i++){
        try{
        if (value % digits.get(i)!= 0){break;  }else{
            sum=sum+1;}
        }
         catch (ArithmeticException e) {
             System.out.println("Среди цифр числа  "+value+ " есть 0"  );
         }}
    if (sum==digits.size()){
        System.out.println("Число "+value+ " делится на все цифры, входящие в него без остатка");
//    } else {
//        System.out.println("Число "+value+ " НЕ делится на все цифры входящие в него без остатка");
    }
}}