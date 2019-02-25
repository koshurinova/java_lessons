public class Break_Continue {
    public static void main (String [] args){
     int i=0;
     while (true){
        if (i==15){
            break; //мгновенный выход из цикла
        }
         System.out.println(i);
         i++;
     }

     for (int a=0; a<=15; a++){
         if (a%2==0){ //остаток от деления на 2
             continue;
         }
         System.out.println("Это нечетное число " +a);
     }
    }
}
