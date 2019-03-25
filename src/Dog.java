public class Dog extends Animal{
    /* Класс Dog расширяет (наследуется) от класса Animal
    * Dog (потомок) имеет все теже методы, что и Animal ((родитель)
    * Может иметь свои методы, которых нет у родителя
    * Можем переопределять родительские методы*/

    public void bark(){ //новый метод
        System.out.println("Я собака и я лаю! Гав!");
    }

    public void eat() { //переопределенный ролительский
        System.out.println("Я ем косточку");
    }

    public void showName(){
        System.out.println(name); //наследование поля name, которое объявлено в родительском классе
    }
}
