package by.belhard.j18.les7.AbstractionExmpl;

public class AbstractionExample {
    public static void main(String[] args) {
        AbstractWorker worker = new factoryWorker("Vasya", 25);

        worker.eat("DICH");
        worker.work();
    }

}
