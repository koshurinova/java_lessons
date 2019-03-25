public class Arrays {
    public static void main (String [] args){
        int number = 10; //примитивный тип данных
        int[] numbers = new int[5]; // ссылочный тип данных, создаем массив размером 5
//        System.out.println(numbers[0]);
        //инициализация элементов может быть поэлементной или с помощью цикла

        for (int i=0; i<numbers.length; i++){
            numbers[i]=i*5;
        }

        for (int i=0; i<numbers.length; i++){
            System.out.println("Элемент массива "+i+ " равен " +numbers[i]);
        }
        System.out.println();//пустая строка для разделения
// еще способо задания массива
        int numbers2[]={1,2,3};
        int numbers3[][]= new int [5][];
        for (int i=0; i<numbers2.length; i++){
            System.out.println("Элемент массива "+i+ " равен " +numbers2[i]);
        }
    }
}
