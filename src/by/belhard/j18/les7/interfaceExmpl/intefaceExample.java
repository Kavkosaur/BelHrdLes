package by.belhard.j18.les7.interfaceExmpl;

public class intefaceExample {

    public static void main(String[] args) {
        System.out.println(Workable.defaultAge);

        Workable workable = new Worker();
        workable.work();
        Workable mworkable = new Machine();
        mworkable.work();

    }
}
