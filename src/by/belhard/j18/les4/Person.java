package by.belhard.j18.les4;

public class Person {

    String name;
    int age;
    Country country;
    Sex sex;

    public Person(String name,int age,Country country , Sex sex){

        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
    }

    public Person(String name, int age, Country country) {

        this(name , age, country ,Sex.MALE);
    }

}
