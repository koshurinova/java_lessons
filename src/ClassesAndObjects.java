public class ClassesAndObjects {
    public static void main (String[] args){
        Person person1 = new Person(); //создаем новый объект класса Person
        person1.name="Маша"; //доступ к полям через . после имени объекта
        person1.age=18;
        person1.speak();
        int years1=person1.calculateYearsToRetirement();
        System.out.println("Количество лет до пенсии "+years1);
        System.out.println();
        Person person2 = new Person();
        person2.name="Вова";
        person2.age=20;
        person2.sayHello();
        person2.sayBye();
    }
}

class Person{
    // У класса есть поля и дейтсвия (методы)
    //Поля
    String name;
    int age;

    //методы
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
}