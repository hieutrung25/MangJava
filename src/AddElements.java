import java.util.Scanner;

public class AddElements {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Insert size of array");
        size = input.nextInt();
        int[] array = new int[size];
        for (int i=0; i<size; i++){
            System.out.println("Insert Element:" + (i+1) + " : " );
            int number = input.nextInt();
            array[i] = number;
        }
        String arrString = "";
        for (int x: array){
            arrString += x + "";
            System.out.println("Your String:" + arrString);
        }

    }
}
