package by.belhard.j18.les8.exceptionExample.Unckecked;

public class Main {
    public static void main(String[] args) {

        System.out.println(getElementByIndex(new String[]{"0","1","2"},5));
        System.out.println(getField(new ExampleWithField()));
    }
    private static String getElementByIndex(String[] strings , int i){
        return strings[i];}
    private static int getField(ExampleWithField o){return o.a;}
}

