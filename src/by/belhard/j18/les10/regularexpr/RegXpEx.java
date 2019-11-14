package by.belhard.j18.les10.regularexpr;

public class RegXpEx {
    public static void main(String[] args) {
        String input = "hrh4fhf5heh7;fh2321232";

        String output = input.replaceAll("[\\d]","*");
        System.out.println(output);
    }

}
