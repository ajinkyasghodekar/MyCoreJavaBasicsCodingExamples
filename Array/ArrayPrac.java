package Array;

import java.util.Scanner;

class ArrayPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        System.out.println("Enter any 5 values: ");
        for(int i=0; i<5; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("------------------------------");
        for (int j=4; j>=0; j--) {
            System.out.println(arr[j]);
        }
    }
}
