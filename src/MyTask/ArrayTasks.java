package MyTask;

import java.util.*;

public class ArrayTasks {
    public static void main(String[] args) {
        int[] numbers = {10, 7, 0, 4, 0, 0, 5, 7};



//        getMax(numbers);
//        getMin(numbers);
//        getRevers(numbers);
//        getZeroToEnd(numbers);
//        getZeroToStart(numbers);
//        setArrayNumber();
//        fillArrayZeroOne();
//          fillArraySimpleNumbers();
        deleteArrayDublicate(numbers);
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
        List<int[]> listOfStrings = new ArrayList<int[]>();
        listOfStrings = Arrays.asList(array);
        System.out.println("Полученный ArrayList с помощью метода Arrays.asList()");
        for (String str : listOfStrings)
            System.out.print(" " + str);
//        listOfStrings = new ArrayList<String>();
//        ArrayList numbersList2 = new ArrayList();
//        Collections.addAll(numbersList2, array);
//        System.out.println();
        System.out.println(listOfStrings.get(0));


//        for (int i = 1; i <= numbersList2.size() - 1; i++) {
//            int value = (int) numbersList2.get(i);
//            for (int k = i + 1; k <= array.length - 1; k++) {
//
//                if ((int) numbersList2.get(k) == value) {
//                    numbersList2.remove(k);
//                }
//            }
//        }
//        for (int j = 0; j < numbersList2.size(); j++) {
//            System.out.print(numbersList2.get(j) + ", ");
//        }
    }
}