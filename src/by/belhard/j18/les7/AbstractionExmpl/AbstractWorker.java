package by.belhard.j18.les7.AbstractionExmpl;

public abstract class AbstractWorker {
    private String name;
    private int age;

    public AbstractWorker(String name, int age){
        this.age = age;
        this.name = name;


    }

    public void eat(String dish){

        System.out.printf("%s is eating %s\n" , name, dish);

    }
    public abstract void work();
}
