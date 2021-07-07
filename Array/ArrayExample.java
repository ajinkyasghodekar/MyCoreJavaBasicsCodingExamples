package Array;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("Enter what size of array u want: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
    
        System.out.println("Enter " +n +" Values in array.");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("------------------------------------------");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}