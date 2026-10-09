class ArrayPassByReference {
    public void incremen(int arr[]){
        System.out.println("Before Increment :" + arr[0]);
        arr[0] = arr[0] +10;
        System.out.println("After Increment :" + arr[0]);
    }
}

class NewCaller{
    public static void main(String[] args) {
        ArrayPassByReference obj = new ArrayPassByReference();
        int arr[] = new int[1];
        arr[0] = 40;
        System.out.println("Before Calling  Increment :" + arr[0]);
        obj.incremen(arr);
        System.out.println("After calling Increment :" + arr[0]);
    }
}
