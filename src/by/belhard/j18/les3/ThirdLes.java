package by.belhard.j18.les3;

//nu pognali
public class ThirdLes {
    public static void main(String[] args) {
        int[] array1 = {5,7,6,-5,4};

        System.out.println(array1[3]);

        int [][] arrayD = new int [3][];
        arrayD[0] = new int [] {7,8,8,9,6,5,425,0};
        System.out.println(arrayD[0]);



        int a = 9983;

        char c = (char) a;

        System.out.println((char)(c - 26));


        //zaLOOPS
        int[] intArray = {1,3,8,8,9};
        for (int i : intArray){ System.out.println(i);}
        int [][] intDArray = new int [][]{{6,3,6,3,6,35,6},{54,12,3,4,56,3,2,34,432}};
        for (int i = 0 ; i < intDArray.length; i ++){
            for (int j = 0 ; j < intDArray[i].length; j ++){
                System.out.print(intDArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}