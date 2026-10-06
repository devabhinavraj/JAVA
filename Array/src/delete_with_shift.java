import java.util.Scanner;

public class delete_with_shift {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 2;
        arr[1] = 10;
        arr[2] = 3;
        arr[3] = 15;
        arr[4] = 20;

        // Transerve Array Before DELETE
        int len = arr.length;
        for(int i = 0 ; i < len ; i++ ){
            System.err.println("Element of Array at index Before DELETE " + i + " : " + arr[i]);
        }
        
        // Delete with shifting 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index where you want to Delete :");
        int idx = sc.nextInt();
        if (idx  < 0 || idx > len){
            System.err.println("Invaild index choose between 0 to " + (len -1));
            sc.close();
            return;
            
        }
        for (int i = idx +1 ; i < len ; i ++){
            arr[i-1] = arr[i];
        }
        arr[len-1] = 0;

        // Transerve Array After DELETE 
        for(int i = 0 ; i < len ; i++ ){
            System.err.println("Element of Array at index After DELETE " + i + " : " +  arr[i]);
        }
        sc.close();
    }
}
