public class array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        // Default Values of array elements
        System.out.println(arr[0]);

        // insert elements in array
        arr[0] = 1;
        System.out.println("Element at index 0: " + arr[0]);

        // Update elements in array
        arr[0] = 2;
        System.out.println("Updated element at index 0: " + arr[0]);

        // Traverse array
        int len = arr.length;
        System.out.println("Array length: " + len);
        for (int i = 0; i < len; i++) {
            System.out.println("Traverse Array:" + arr[i]);
        }
    }
}
