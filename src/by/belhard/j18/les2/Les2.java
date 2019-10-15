package by.belhard.j18.les2;
//hz zochem no norm

public class Les2 {
    public static void main(String[] args) {
        byte a = 0;
        for (int i = 0; i < 129; i++) {
            byte b = a;
            a += i;
            if (b < a) {
                System.out.println("Hmmmm.... Let's see:" + a);
            } else {
                System.out.println("Ohhhhh ,shield, an overload >_< :" + a);
            }

        }
    }
}
