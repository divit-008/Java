
import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {
        //input for array size
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array you want : ");
        int size = sc.nextInt();
        //declaring array
        int[] x = new int[size];
        //finding length of array to take inputs and outputs
        int len = x.length;
        //input for array contents
        for(int i=0; i<len; i++){
            System.out.println("Enter value of  " + i + " index : ");
            x[i] = sc.nextInt();
        }
        //output of the array
        for(int j= 0; j<len; j++){
            System.out.println("Array contains " + x[j] + "in" + j + "index");
        }

    }
}