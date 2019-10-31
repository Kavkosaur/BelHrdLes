package by.belhard.j18.les7.AbstractionExmpl;

public class factoryWorker extends AbstractWorker {


    public factoryWorker(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("Opyaaat' rabota.....");
    }
}
