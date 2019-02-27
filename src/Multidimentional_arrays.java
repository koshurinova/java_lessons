public class Multidimentional_arrays {
    public static void main (String[] args){
        /* многомерные массивы (пример двумерный
        * 1 2 3
        * 4 5 6
        * 7 8 9
        */
        int [][] matrice = {{1,2,3},
                            {4,5,6},
                            {7,8,9}}; //массив массивов
        System.out.println(matrice[2][2]);
        System.out.println(matrice[0][2]);

        String[][] strings=new String[2][3]; //пустой строковый
        System.out.println();
        for (int i=0; i<matrice.length; i++){
            for (int k=0; k<matrice.length; k++){
                System.out.print(matrice[i][k]+" "); //выводим на одной строчке
            }
            System.out.println();
        }
//        System.out.println();
    }
}
