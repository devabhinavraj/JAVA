class PassByValue {
    public void swap(int a , int b){
        System.out.println("Before Swapping :  a : " + a + " , " + " b : " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping :  a : " + a + " , " + " b : " + b);
    }
    
}

class PassByValueCall{
    public static void main(String[] args) {
        PassByValue obj = new PassByValue();
        int a = 5;
        int b = 8;
        obj.swap(a ,b);
        System.out.println("Outside Swapping :  a : " + a + " , " + " b : " + b);
    }
}
