class MyFunctionClass {
    public void  printName(String name){
        System.out.println("Name :- " + name);
    }
    
}


class MySecondClass{
    public static void main(String[] args) {
        MyFunctionClass obj = new MyFunctionClass();
        obj.printName("Abhinav");
    }

}