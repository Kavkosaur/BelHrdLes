package by.belhard.j18.les7.HashExmpl;

public class EqualsHashcodeExample {

    public static void main(String[] args) {

        Person person1 = new Person(1,"Vasya");
        Person person3 = new Person(1,"Vasya");
        Person person2 = new Person(3,"Kirill");

        System.out.println("person1:" + person1.hashCode());
        System.out.println("person2:" + person2.hashCode());
        System.out.println("person3:" + person3.hashCode());

    }
}
