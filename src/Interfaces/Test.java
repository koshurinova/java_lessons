package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1=new Animal(12);
        Person person1=new Person("Don");
        animal1.sleep();
        person1.sayHello();


        Info info1=new Animal(2); //т.к. этот класс реализует интерфейс Info мы можем ссылть тип переменной класса
        // Info на класс его реализующий. Доступ есть есть только к методам, реализуемым интерфесом
        Info info2=new Person("Bob");
//        ((Animal) info1).sleep();
        info2.showInfo();

        Animal animal2=new Animal(13);
        Person person2=new Person("Kok");
        outputInfo(animal2);
        outputInfo(person2);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
