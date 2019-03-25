public class ConstructorAndWord {
    public static void main(String[] args) {
      Human.description ="Nice";
      Human human1 = new Human();
      Human human2=new Human("Петя");
      Human human3=new Human("Вася", 15);
      human1.getAllFields();
      human2.getAllFields();
      human3.getAllFields();
      Human.getDescription();
      human1.printNumberOfPeople();
      human2.printNumberOfPeople();
      human3.printNumberOfPeople();
      System.out.println(Human.NATION);
    }
}
 class Human{
    /*переменные класса.
    перед именем ставим static.
    Общая для всех объектов класса
    можем обратить к переменной без создания объекта класса*/
     public static String description;
     public static int countPeople=0;
     public static final String NATION="Rus"; //final указывает на то, что значение константа. константы пишуться заглавными буквами
    //переменные объекта
     private String name;
     private int age;

     /*конструктор для заполнения полей объекта класса.
   Не имеет типа возвращаемого значения.
   Имя конструктора совпадает с именем класса (начинается с большой буквы)
   Два метода (конструктора) могут иметь одинаковое название, если у них разные параметры
    */
     public Human(){
         //ghb отсутствии параметров, можно присвоить их по умолчанию
         this.name="Имя по умолчанию";
         this.age=0;
         System.out.println(" Привет из первого конструктора ");
         countPeople++;
     }
     public Human(String name){
         this.name=name;
         System.out.println(" Привет из второго конструктора ");
         countPeople++;
     }
     public Human(String name, int age){
         this.name=name;
         this.age=age;
         System.out.println(" Привет из третьего конструктора ");
         countPeople++;
     }
     public void setName(String name) {
         this.name = name;
     }

        public void setAge(int age) {
         this.age = age;
     }

    public static void getDescription(){
        System.out.println(description);
     }
     public void getAllFields(){
         System.out.println(name+age+description);
     }

     public void printNumberOfPeople(){
         System.out.println("Число людей "+countPeople);
     }
 }

