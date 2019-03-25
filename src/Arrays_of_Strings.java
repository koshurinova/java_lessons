public class Arrays_of_Strings {
    public static void main (String[] args){
        String[] strings =new String[3];
        strings[0]="Мама";
        strings[1]="мыла";
        strings[2]="раму";

        for (int i=0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
        System.out.println();
        // цикл for-each

            for (String string:strings ) { //(тип данных имя перемнной внутри цикла: имя массива)
                System.out.println(string);
            }
        System.out.println();
        //еще пример
        int[] numbers={1,2,3};
        //считаем сумму
        int sum=0;
        for (int i: numbers){

            sum=sum+i;
        }
        System.out.println(sum);
        }


}
