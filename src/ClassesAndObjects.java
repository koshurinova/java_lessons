public class ClassesAndObjects {
    public static void main (String[] args){
        Person person1 = new Person(); //создаем новый объект класса Person
//        person1.name="Маша"; //доступ к полям через . после имени объекта, если у поля нет private
//        person1.age=18;
        person1.setName("Маша");
        person1.setAge(18);
        person1.speak();
        int years1=person1.calculateYearsToRetirement();
        System.out.println("Количество лет до пенсии "+years1);
        System.out.println();
        Person person2 = new Person();
//        person2.name="Вова";
//        person2.age=20;
        person2.sayHello();
        person2.sayBye();
        Person person3 = new Person();
        person3.setNameAndAge("Петя",45);
        person3.speak();
//String s=2+2+"=value";
//        System.out.println(s);
//        for (int i=10; i>0; i++){
//            System.out.println(i);
//    }
    byte a=127;
     a++;
        System.out.println(a);
}

static class Person{
    // У класса есть поля и дейтсвия (методы)
    //Поля
    private String name;
    private int age;
/* Сеттеры и геттеры
Нужны, чтобы не передавать внутренние данные наружу. В сеттерах можно реализовать проверку вводимых данных
*/
    public void setName(String userName){
       if (userName.isEmpty()){//проверяем пустая строка или нет, возвращает true если строка пустая, false, если нет
            System.out.println("Имя не введено");
        }else{
            name = userName; //приравнимаем name тому, что пришло в параметрах
        }

    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        age=userAge; //приравнимаем name тому, что пришло в параметрах
    }
    public int getAge(){
        return age;
    }

    //методы
    void setNameAndAge(String username, int userage){

        name=username;
        age=userage;}
    void speak(){
        System.out.println("Меня зовут "+name+". Мне "+age+" лет.");
    }

    void sayHello(){
        System.out.println("Hello! Я "+name);
    }
    void sayBye(){
        System.out.println("Good bye!");
    }
    int calculateYearsToRetirement(){ //метод возвращающий целое число
        int years=65-age;
//        System.out.println("Количество лет до пенсии "+years);
        return years; //после return программа выходит из метода
    }
}}