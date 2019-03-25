public class This_15 {

    public static void main(String[] args) { //psvm
        Human human1=new Human();
        human1.setAge(18);
        human1.setName("Маша");
        human1.getInfo();

    }
    static class Human {
        String name; //переменная класса
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) { //переменная метода
            this.name =name; //this указывает на переменную класса
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void getInfo(){
            System.out.println(name+", "+age);
        }
    }
}
