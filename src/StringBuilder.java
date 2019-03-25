import java.lang.*;

public class StringBuilder {
    public static void main(String[] args) {
    String x = "hello";
    String s1="Hello ";
    String s2=" my ";
    String s3=" friend";
    String sAll=s1+s2+s3;

        System.out.println(sAll);

    x.toUpperCase(); //так нельзя. методы класса string оперируют не на текущей строке, а возвращают новую новой
    x=x.toUpperCase();
    System.out.println(x);

    java.lang.StringBuilder sb=new java.lang.StringBuilder("Hello"); //объекты этого класса могут изменяться
        sb.append(" our");
        System.out.println(sb.toString());
        sb.append(" our ").append("friends");
        System.out.println(sb.toString());
    }
}
