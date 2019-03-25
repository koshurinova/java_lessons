public class ObjectAndToString {
    public static void main(String[] args) {
    HumanO h1=new HumanO("Dany",45);
    h1.toString(); /*toString тут возвращает хэшкод для созданного объекта (принадлежит классу object,
    от которого наследуются все классы)
    Хэшкод - уникальный номер присвоенный каждому объекту*/
        System.out.println(h1); //все методы print вызывают toString (скрыто)

    }
}
class HumanO{
    private String name;
    private int age;
    public HumanO(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String toString (){ //метод можно переопределить! внутри своего класса, если будет совпадать сигнатура
        return name+", "+age;
    }
}
