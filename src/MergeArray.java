import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] firstArray = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i < firstArray.length; i++){
            System.out.println("Element" + (i+1));
            firstArray[i] = sc.nextInt();
        }
        int[] secondArray = new int[5];
        for (int i=0; i < secondArray.length; i++) {
            System.out.println("Element" + (i + 1));
            secondArray[i] = sc.nextInt();
        }
        int[] mergeArray = new int[firstArray.length+secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            mergeArray[i] = firstArray[i];
        }
        int index = secondArray.length;
        for (int i = 0; i < secondArray.length; i++) {
            mergeArray[index] = secondArray[i];
            index++;
        }

        String str="";
        for (int x: mergeArray){
            str += x +" ";
        }
        System.out.println("Merge Array is " + str);
    }
}
