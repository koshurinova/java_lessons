package MyTask;

import java.util.*;
import java.util.Random;
public class ArrayTasks {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 2, 2, 0, 0};



//        getMax(numbers);
//        getMin(numbers);
//        getRevers(numbers);
//        getZeroToEnd(numbers);
//        getZeroToStart(numbers);
//        setArrayNumber();
//        fillArrayZeroOne();
//        fillArraySimpleNumbers();
//        deleteArrayDublicate(numbers);
//        fillArrayRandom(5);
//        getCount(numbers,7);
//        fillArrayRandomTask(15);
        fillArrayRandomOneTwo(6);
//        findX(numbers,9);
    }

    //вычисляет максимальное значение массива
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент массива " + max);
        return max;
    }

    //вычисляет минимального значение массива
    public static int getMin(int[] array) {
        int min = array[0];

        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент массива " + min);
        return min;
    }

    //перестановка элементов массива
    public static int[] getRevers(int[] array) {
        int size = array.length - 1;
        int[] newArr = new int[size + 1];
        for (int i = 0; i <= size / 2; i++) {
            newArr[i] = array[size - i];
            newArr[size - i] = array[i];
        }
        System.out.print("Перевернутый массив:  ");
        printArray(newArr);
        return newArr;
    }


    //перестановка 0 в конец массива (учитывает 0,0)
    public static int[] getZeroToEnd(int[] array) {
        int sumZero = 0;
        int j = 0;
        int size = array.length - 1; //длина массива
        int[] newArr = new int[size + 1];

        for (int i = 0; i <= size; i++) {
            if (array[i] != 0) {
                newArr[i - j] = array[i];

            } else {
                newArr[size - j] = array[i];
                j++;
            }
        }
        System.out.println();
        System.out.print("Массив с 0 в конце:  ");
        printArray(newArr);
        return newArr;
    }

    //перестановка 0 в начало массива (учитывает 0,0)
    public static int[] getZeroToStart(int[] array) {
        int sumZero = 0;
        int j = 0;
        int size = array.length - 1; //длина массива
        int[] newArr = new int[size + 1];

        for (int i = size; i >= 0; i--) {
            if (array[i] != 0) {
                newArr[size - j] = array[i];
                j++;
            } else {
                newArr[j] = array[i];
            }
        }
        System.out.println();
        System.out.print("Массив с 0 в начале:  ");
        printArray(newArr);
        return newArr;
    }

    //Заполнить массив последовательными нечетными числами, начиная с единицы.
    public static void setArrayNumber(){
        Scanner input= new Scanner(System.in); //создаем поток входных данных
        System.out.println("Введите необходимую длину массива:");
        int s=input.nextInt();
        int[] numbers = new int[s];
        int k=0;
        for (int i=0; i<s;i++){
            numbers[i]=k+1;
            k=k+2;
        }
        System.out.println();
        System.out.print("Массив из "+s+" элементов заполненный нечетными числами:  ");
        printArray(numbers);
    }

    //Заполнить массив нулями и единицами, при этом данные значения чередуются, начиная с нуля.
    public static void fillArrayZeroOne(){
        Scanner input= new Scanner(System.in); //создаем поток входных данных
        System.out.println("Введите необходимую длину массива:");
        int s=input.nextInt();
        int[] numbers = new int[s];
        for (int i=0; i<s;i++) {

            if (i % 2 == 1) {
                numbers[i] = 1;
            } else {
                numbers[i] = 0;
            }
        }
        System.out.println();
        System.out.print("Массив из "+s+" элементов заполненный 0 и 1:  ");
        printArray(numbers);
    }

   // Заполнить массив заданной длины различными простыми числами. Натуральное число, большее единицы,
    // называется простым, если оно делится только на себя и на единицу.
    public static void fillArraySimpleNumbers(){
        Scanner input= new Scanner(System.in); //создаем поток входных данных
        System.out.println("Введите необходимую длину массива:");
        int s=input.nextInt();
        int[] numbers = new int[s];
        int i=0;

                for (int k=2; k<Integer.MAX_VALUE; k++){ //список чисел для проверки
                        boolean q = false;
                        for (int j = 2; j <= k - 1; j++) { //проверка числа на простое
                            if (k % j == 0) {
                                q = false;
                                break;
                            } else {
                                q = true;
                            }
                        }
                        if (q && i<s) { //заполняем i-ый элемент простым числом
                            numbers[i] = k;
                            i++;
                        }else if (i==s){
                            System.out.print("Массив из "+s+" элементов заполненный простыми числами:  ");
                            printArray(numbers);
                           System.exit(0);
                        }
                }
    }

    //заполнение массива элементами для печати
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    //удаление дублей из массива
    public static void deleteArrayDublicate(int[] array) {
        printArray(array);
        String[] arrayS = Arrays.toString(array).split("[\\[\\]]")[1].split(", ");
        List<String> listOfStrings = new ArrayList<String>();
        Collections.addAll(listOfStrings, arrayS);
        System.out.println();
        for (int i = 0; i <= listOfStrings.size() - 1; i++) {
            String value = listOfStrings.get(i);
            for (int k = i + 1; k <= listOfStrings.size() - 1; k++) {
                if (listOfStrings.get(k).equals(value)) {
                    listOfStrings.remove(k);
                    }
            }
        }

        System.out.println("Новый массив");
        for (String x : listOfStrings)
            System.out.print(" " + x);
    }

    //Заполнить массив случайными числами
    public static void fillArrayRandom(int s){
        int[] array = new int[s];
        for(int i=0;i<array.length;i++){
            array[i]=new Random().nextInt(9);
        }
        printArray(array);
    }

    //вычисляет кол-во чисел с в массиве
    public static int getCount(int[] array, int c) {
        int count=0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] ==c) {
                count++;
            }
        }
//        System.out.println("Количество цифр "+c+ " в массиве = " + count);
        return count;
    }

    //Сформировать массив из случайных целых чисел от 0 до 9 , в котором единиц от 3 до 5 и двоек больше троек
    public static void fillArrayRandomTask(int s){
        int[] array = new int[s];
        for(int i=0;i<array.length;i++){
            array[i]=new Random().nextInt(9);
        }
        printArray(array);
        System.out.println();
        //   Проверяем кол-во единиц
        if (getCount(array,1)>5){
               for (int k=0; k<=array.length-1; k++) {
                   if (array[k]==1 && getCount(array,1)>5){
                       array[k]= new Random().nextInt(9);
                   }
               }
        }else
                if(getCount(array,1)<3) {
                    for (int k = 0; k <= array.length - 1; k++) {
                        if (array[k]!= 1 && getCount(array, 1) < 3) {
                            int n = (int) Math.floor(Math.random() * array.length);
                            array[n] = 1;
                        }
                    }
                }
//           Сравниваем кол-во двоек и троек
        if (getCount(array,2)<=getCount(array,3)){
            for (int k = 0; k <= array.length - 1; k++)
            {
                if (array[k] != 1&& getCount(array,2)-getCount(array,3)<=0 ) {
                    array[k] = 2;
                }
            }
        }
        printArray(array);

    }

    //Найти элемент массива = х
    public static int findX(int[] array, int x) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == x) {
//                System.out.println("Заданное число " +x+" имеет индекс "+i );
                return i;
//                break;
            }

        }
//        System.out.println("Заданное число " +x+" отсутствует в массиве" );
        return 1000;

    }


    // Заполните массив случайным образом нулями, единицами и двойками так, чтобы первая двойка в массиве
    // встречалась раньше первой единицы, количество единиц было в точности равно суммарному количеству нулей и двоек.
    public static void fillArrayRandomOneTwo(int s) {
        int[] array = new int[s];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(3);
        }
        printArray(array);
        System.out.println();
        int c1=getCount(array,1);
        int c0=getCount(array,0);
        int c2=getCount(array,2);
       while (c1!=c0+c2){
           if (c1<c0+c2){
               int j=findX(array,0);
               if (j==1000){
                   j=findX(array,2);
               }
               array[j]=1;

           }else{
               int j=findX(array,1);
               array[j]=2;
           }
           c1=getCount(array,1);
           c0=getCount(array,0);
           c2=getCount(array,2);

       }

      int j2=findX(array,2);
      int j1=findX(array,1);
      if (j1<j2){
          array[j1]=2;
          array[j2]=1;
      }
        printArray(array);
    }

}