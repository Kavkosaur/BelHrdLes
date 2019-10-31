package by.belhard.j18.les7.interfaceExmpl;

public class Worker implements Workable,Eatable{

    @Override
    public void work(
    ) {
        System.out.println("rabotat'");
    }

    @Override
    public void eat(String param) {
        System.out.printf("Eating %s" , param);

    }
}
