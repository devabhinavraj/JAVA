import java.util.Scanner;
public class insert_with_shifting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];

        // Insert Element in Array;
        arr[0] = 2;
        arr[1] = 10;
        arr[2] = 3;
        arr[3] = 15;

        // Tranverse Array
        int len = arr.length;
        for(int i =0 ; i < len ; i++ ) {
            System.out.print("Before inserting Element at index " + i + ": " +arr[i] + " "+"\n");
        }

        // Insert With shifting 
        System.out.print("Enter the index where you want to insert the element: ");
        int idx = sc.nextInt();
        System.out.print("Enter the element you want to insert: ");
        int data = sc.nextInt();
        for (int i = len -2 ; i >= idx ; i --){
            arr[i+1] = arr[i];
        }
        arr[idx] = data;

        // Tranverse Array after inserting
        for(int i = 0 ; i < len ; i++){
            System.out.print("After inserting Element at index " + i + ": " +arr[i] + " "+"\n");
        }
    }
}