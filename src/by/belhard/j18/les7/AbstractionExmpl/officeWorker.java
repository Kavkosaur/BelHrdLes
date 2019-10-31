package by.belhard.j18.les7.AbstractionExmpl;

public class officeWorker extends AbstractWorker {

    public officeWorker(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("Too much papers");
    }
}
